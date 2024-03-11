package Errors;

import java.util.Scanner;

public class CrashHandling 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numrator Value");
		int Num=sc.nextInt();
		System.out.println("Enter the Denominator Value");
		int Den= sc.nextInt();
		
		try
		{
			float res = (float)(Num/Den);
			System.out.println("Result : "+res);
		}
		catch(ArithmeticException E)
		{
			//Handling the Exception
			System.out.println("Enter the valid Value for Denominator");
		}
		System.out.println("Program Complied Successfully");
		
//		Error =
//		Thread [main] (Suspended (exception ArithmeticException))	
//				Crashing.main(String[]) line: 12	

	}

}
