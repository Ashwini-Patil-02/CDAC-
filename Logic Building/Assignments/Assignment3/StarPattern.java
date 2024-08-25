
public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; 
        int columns = 5; 

        // Outer loop for each row
        for (int i = 0; i < rows; i++) {
            // Inner loop for each column
            for (int j = 0; j < columns; j++) {
                System.out.print("*"); 
            }
            System.out.println(); // Move to the next line after printing all columns
        }
    }
}


/*12. Write a program to draw the following pattern: 
***** 
***** 
***** 
***** 
*****
*/