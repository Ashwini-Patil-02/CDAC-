//4. Write a program to reverse the digits of the number 1234. The output should be 4321. 
   class Ques4{
            public static void main(String args[]){
			   int n=1234,r;
			      while(n>0)
			      {
			          r = n%10;
			            System.out.print(r); //4 3  2  1
			   
			            n= n/10;  //123  12 1
			        }
			   
			    }
            }			 
			   