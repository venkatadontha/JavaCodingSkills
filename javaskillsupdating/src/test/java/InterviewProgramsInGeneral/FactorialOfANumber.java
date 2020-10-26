package InterviewProgramsInGeneral;

import java.util.Scanner;

public class FactorialOfANumber 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the factorial number : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
				
		int factorial = fact(num);
		System.out.println("Factorial of the number " + num + " is : " + factorial);
	}

	private static int fact(int n)
	{
		int output;
		
		if (n == 1)
		{
			return 1;
		}
		output = fact(n-1) * n;
		return output;
	}
}
