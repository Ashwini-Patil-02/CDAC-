  /*7. Write a program to calculate the sum of the digits of the number 9876. The output should be 
30 (9 + 8 + 7 + 6).*/
class Ques7{
              public static void main (String args []){
			  int n= 9876,sum=0,r;
			  while(n>0)
			  {
			  
			  r = n%10;
			  sum = sum+r;
			  n = n/10;
			 }
			 System.out.println("sum  of digit is :" + sum);
			 
			 }
			 
			}
		
			 