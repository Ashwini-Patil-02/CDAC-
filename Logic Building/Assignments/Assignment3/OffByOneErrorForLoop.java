public class OffByOneErrorForLoop { 
    public static void main(String[] args) { 
        for (int i = 1; i <10; i++) { 
            System.out.println(i); 
        } 
        // Expected: 10 iterations with numbers 1 to 10 
        // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
    } 
} 
  /*Error to investigate: What is the issue with the loop boundaries? How should the loop be 
  adjusted to meet the expected output?
   
   ---> in the above code there is condition i<=10 that why i prints 10 times to adjuct 
   the loop output conditon will i<10 only
   
   */