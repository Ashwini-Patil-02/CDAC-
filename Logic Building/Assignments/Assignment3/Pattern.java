
public class Pattern {
    public static void main(String[] args) {
        int n = 5;

        // Upper part of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*");
			}
			 System.out.println(i);
		}
		for(int i=4; i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				
                System.out.print(i+"*");
			}
			System.out.println(i);
		}
	}
}



/*13. Write a program to print the following pattern: 
1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2
1
*/