public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num <=5); 
 
 
    } 
} 
/* Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `do
while` loop? 

1. Initially num is 0.The loop starts prints 0 then increments num to 1.
After the first iteration the condition while (num > 0); is evaluated.
 Since num is now 1 which is greater than 0 the loop will execute again.
This means the loop will continue infinitely printing numbers from 0 upwards
 without stopping because num will always be greater than 0 after the first increment.

*/