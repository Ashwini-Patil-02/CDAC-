public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count != 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
} 


/* Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the 
`while` loop?

1. In the code above count = 0 is an assignment so the condition actually sets count to
 0 and then checks whether 0  is true or false.
In Java an integer value of 0 is treated as false so the loop's condition evaluates 
to false and the loop body never executes.*/