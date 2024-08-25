public class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i++) { 
            System.out.println(i); 
        } 
    } 
} 
/* Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted? 
1. The loop condition i < 10 is intended to stop the loop when i reaches or exceeds 10.
However, the loop control variable i is decremented with i-- in each iteration. This means that i is
 continuously reduced, starting from 0 and moving into negative numbers.
