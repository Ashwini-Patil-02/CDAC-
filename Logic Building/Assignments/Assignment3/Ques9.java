//9. Write a program to find and print the largest digit in the number 4825.
class Ques9{
    public static void main(String[] args) {
        int number = 4825;
        int largestDigit = 0;

        while (number > 0) 
		{
            int digit = number % 10; // Extract the last digit
            if (digit > largestDigit)
			{
                largestDigit = digit; // Update the largest digit
            }
            number = number / 10; // Remove the last digit
        }

        System.out.println("The largest digit is: " + largestDigit);
    }
}
