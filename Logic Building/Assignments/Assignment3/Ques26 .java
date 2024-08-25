class Ques26 {
    public static void main(String[] args) {
         int n = 5; // Number of rows
        int num = 1; // Starting number

        for (int i = 1; i <= n; i++) {
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            // Move to the next line
            System.out.println();
        }
    }
}



/*  26. Write a program to print the following pattern: 
 
 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15

*/