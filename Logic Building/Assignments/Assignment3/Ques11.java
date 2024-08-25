/*11. Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression .*/

public class Ques11 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        int result = ++a + b--; // Pre-increment a and post-decrement b

        System.out.println("Result of the expression (++a + b--) is: " + result);
        System.out.println("Value of 'a' after the expression: " + a);
        System.out.println("Value of 'b' after the expression: " + b);
    }
}
