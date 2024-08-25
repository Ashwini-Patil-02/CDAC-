
public class Ques21 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            int number = 1; // Start with the first odd number

            for (int j = 1; j <= i; j++) {
                System.out.print(number); // Print the odd number
                if (j < i) {
                    System.out.print("*"); // Print the asterisk if it's not the last number in the row
                }
                number += 2; // Move to the next odd number
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}




 /*21. Write a program to print the following pattern: 
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9
*/