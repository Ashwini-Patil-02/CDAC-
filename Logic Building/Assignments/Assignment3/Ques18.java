
public class Ques18 {
    public static void main(String[] args) {
        int n = 4; // This is the number of rows for the top part (excluding the middle row)

        // Top part including the middle row
        for(int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom part (excluding the middle row)
        for(int i = n-1; i >= 1; i--) {
            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

            



/* 18. Write a program to print the following pattern: 
    * 
   *** 
  ***** 
 ******* 
  ***** 
   *** 
    * 
*/