public class InfiniteForLoopUpdate { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i += 2) { 
            System.out.println(i); 
        } 
    } 
} 
/* Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update 
expression be corrected? 

---> The loop as written will not run infinitely.
 The loop prints only 0, 2, 4 because i is incremented by 2.



*/