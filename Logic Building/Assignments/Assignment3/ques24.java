public class Ques24{
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // Print the current row number
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}



/*
24. Write a program to print the following pattern: 

1 
22 
333 
4444 
55555 
*/