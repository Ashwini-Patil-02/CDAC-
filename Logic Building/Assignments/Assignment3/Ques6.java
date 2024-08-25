 //6. Write a program to find and print the first 5 prime numbers.

import java.util.*;
class Ques6{
           public static void main(String args[]){
		        int n1,n2,i,j;
				System.out.print("enter the range");
				Scanner r = new Scanner(System.in);
				n1= r.nextInt();
				n2= r.nextInt();
				for(i= n1; i<=n2 ; i++)
				{
				  for(j=2; j<=i ; j++)
				  {
				  if(i%j==0)
				  break;
				}
				   if(i==j)
				   System.out.println(j);
				
		        }
				
		    }
        }
		