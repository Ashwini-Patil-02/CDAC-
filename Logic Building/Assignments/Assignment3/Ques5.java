  //5. Write a program to print the Fibonacci sequence up to the number 21. 
  
  // 0  1  1  2  3   5  8  13   21
  
  import java.util.*;
  class Ques5{
  
             public static void main(String args[]){
			 int n,a=0, b=1,c;
			 System.out.println("enter vaule of n");
			 Scanner r=new Scanner(System.in);
			 n = r.nextInt();
			 
			 for(int i =1; i<= n; i++){
			 System.out.println(a);
			 c = a+b;
			 a=b;
			 b=c;
			 
			 
			 }
		}
			 
  }		 
			 