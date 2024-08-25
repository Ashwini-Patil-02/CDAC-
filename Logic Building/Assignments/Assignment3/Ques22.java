public class Ques22{
    public static void main(String[] args) {
        int n = 5; // Number of rows for the top half 
        // Print the top half of the pattern 
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Print the bottom half of the pattern 
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}














 /*22. Write a program to print the following pattern: 
********* 
******* 
***** 
*** 
* 
*** 
***** 
******* 
*********
*/