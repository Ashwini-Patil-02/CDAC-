public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count = 1; 
 
 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
} 


/* Error to investigate: Why does this code produce a compilation error? 
What needs to be done to initialize the loop variable properly?

-->it produce compiliation error because of count not intialized there.
  intialise the value of count.
*/