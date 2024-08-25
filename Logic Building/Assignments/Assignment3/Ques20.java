public class Ques20 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print(j); // Print the number
                if (j > n - i + 1) {
                    System.out.print("*"); // Print the asterisk if it's not the last number in the row
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}




/*20. Write a program to print the following pattern: 
5 
5*4 
5*4*3 
5*4*3*2 
5*4*3*2*1
*/