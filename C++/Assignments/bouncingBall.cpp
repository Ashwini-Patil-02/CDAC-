#include <iostream>
#include <conio.h>
#include <windows.h>
#include <ctime>
#include <fstream> // For file handling

using namespace std;

// Constants
const int screenWidth = 40;
const int screenHeight = 20;
const char ballChar = 'O';
const char platformChar = '=';
const char emptySpace = ' ';
const int platformRowOffset = 2; // Platform above the bottom boundary
const string highScoreFile = "highscore.txt"; // File to store high score

// Game variables
int ballX, ballY;
int ballDirX = 0, ballDirY = 0;
int platformX;
int score = 0;
int highScore = 0;
int level = 1; // New variable to track level
bool gameOver = false;

// Function to move cursor to a specific position
void gotoxy(int x, int y) {
    COORD coord;
    coord.X = x;
    coord.Y = y;
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), coord);
}

// Function to set text color
void setColor(int color) {
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), color);
}

// Function to clear the screen
void clearScreen() {
    system("cls");
}

// Function to draw the game boundary with improved visuals
void drawBoundary() {
    setColor(15); // White for borders
    for (int i = 0; i <= screenWidth; i++) cout << "-";
    cout << endl;

    for (int i = 0; i < screenHeight - 1; i++) {
        cout << "|";
        for (int j = 0; j < screenWidth - 1; j++) cout << emptySpace;
        cout << "|" << endl;
    }

    for (int i = 0; i <= screenWidth; i++) cout << "-";
}

// Function to draw the ball and platform with statistics on the right side outside the game window
void drawGame() {
    // Draw the ball
    setColor(14); // Yellow for ball
    gotoxy(ballX, ballY);
    cout << ballChar;

    // Draw the platform
    setColor(10); // Green for platform
    gotoxy(platformX, screenHeight - platformRowOffset);
    for (int i = 0; i < 7; i++) cout << platformChar;

    // Draw game statistics outside the right side of the game window
    int statsX = screenWidth + 5; // Position for the stats outside the window
    int statsY = 3;  // Start position for the stats

    setColor(11); // Light blue for stats title
    gotoxy(statsX, statsY); cout << "GAME STATS:";
    setColor(15); // White for score, high score, and level
    gotoxy(statsX, statsY + 2); cout << "Score: " << score;
    gotoxy(statsX, statsY + 4); cout << "High Score: " << highScore;
    gotoxy(statsX, statsY + 6); cout << "Level: " << level;
}

// Function to clear the previous positions of the ball and platform
void clearGame() {
    setColor(0); // Black for clearing
    gotoxy(ballX, ballY);
    cout << emptySpace;

    gotoxy(platformX, screenHeight - platformRowOffset);
    for (int i = 0; i < 7; i++) cout << emptySpace;
}

// Function to save the high score to a file
void saveHighScore() {
    ofstream file(highScoreFile);
    if (file.is_open()) {
        file << highScore;
        file.close();
    }
}

// Function to load the high score from a file
void loadHighScore() {
    ifstream file(highScoreFile);
    if (file.is_open()) {
        file >> highScore;
        file.close();
    } else {
        highScore = 0; // Default high score if file doesn't exist
    }
}

// Function to initialize game variables
void initializeGame() {
    ballX = screenWidth / 2;
    ballY = screenHeight / 2;
    ballDirX = 0; // Ball is static initially
    ballDirY = 0;
    platformX = screenWidth / 2 - 3;
    score = 0;
    level = 1; // Start at level 1
    gameOver = false;
}

// Function to update ball position and check for collisions
void updateBall() {
    if (ballDirX == 0 && ballDirY == 0) return; // Ball is static, no update

    ballX += ballDirX;
    ballY += ballDirY;

    // Collision with left wall
    if (ballX <= 1) ballDirX = 1;

    // Collision with right wall
    if (ballX >= screenWidth - 1) ballDirX = -1;

    // Collision with top wall
    if (ballY <= 1) ballDirY = 1;

    // Collision with platform
    if (ballY == screenHeight - platformRowOffset - 1 && ballX >= platformX && ballX < platformX + 7) {
        ballDirY = -1;
        score++;
        if (score > highScore) {
            highScore = score;
            saveHighScore(); // Save high score whenever it is updated
        }

        // Level Up
        if (score >= 10 * level) {
            level++;
        }
    }

    // Ball falls below platform
    if (ballY >= screenHeight - 1) gameOver = true;
}

// Function to update platform position based on user input
void updatePlatform() {
    if (_kbhit()) {
        char ch = _getch();
        if (ch == 'a' || ch == 'A') platformX = max(1, platformX - 2);
        if (ch == 'd' || ch == 'D') platformX = min(screenWidth - 8, platformX + 2);

        // Start the ball if it's static
        if (ballDirX == 0 && ballDirY == 0) {
            ballDirX = 1;
            ballDirY = -1;
        }
    }
}

// Function to display instructions with styling
void showInstructions() {
    clearScreen();
    setColor(15); // White text
    cout << "==========================\n";
    cout << "       INSTRUCTIONS       \n";
    cout << "==========================\n\n";
    cout << "1. Use 'A' to move the platform left.\n";
    cout << "2. Use 'D' to move the platform right.\n";
    cout << "3. Bounce the ball on the platform to score points.\n";
    cout << "4. If the ball falls below the platform, the game is over.\n";
    cout << "5. The ball will remain static initially. Press any key to start the ball bouncing.\n";
    cout << "Press any key to return to the menu...\n";
    _getch();
}

// Function to display a selectable menu with colors
int showMenu() {
    int option = 0;
    char key;
    do {
        clearScreen();
        setColor(15); // White text
        cout << "=============================\n";
        cout << "||       BOUNCING BALL     ||\n";
        cout << "=============================\n\n";
        cout << (option == 0 ? " -> Start Game\n" : "    Start Game\n");
        cout << (option == 1 ? " -> Instructions\n" : "    Instructions\n");
        cout << (option == 2 ? " -> Quit\n" : "    Quit\n");

        key = _getch();
        if (key == 72) option = (option - 1 + 3) % 3; // Up arrow
        if (key == 80) option = (option + 1) % 3;     // Down arrow
    } while (key != 13); // Enter key

    return option;
}

int main() {
    loadHighScore(); // Load high score when the game starts

    srand(static_cast<unsigned>(time(0)));
    int choice;
    do {
        choice = showMenu();
        switch (choice) {
            case 0: // Start Game
                initializeGame();
                clearScreen();
                drawBoundary();
                while (!gameOver) {
                    clearGame();
                    updateBall();
                    updatePlatform();
                    drawGame();
                    
                    // Increase ball speed based on level
                    int speed = max(100 - level * 10, 20); // Minimum speed of 20ms
                    Sleep(speed);
                }
                clearScreen();
                setColor(12); // Red for game over message
                cout << "Game Over!\n";
                cout << "Your Score: " << score << "\n";
                cout << "High Score: " << highScore << "\n";
                setColor(15); // Reset color
                cout << "Press any key to return to the menu...\n";
                _getch();
                break;

            case 1: // Instructions
                showInstructions();
                break;

            case 2: // Quit
                cout << "Thank you for playing!\n";
                break;
        }
    } while (choice != 2);
    return 0;
}
