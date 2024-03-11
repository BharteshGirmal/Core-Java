package Errors;
import java.util.Scanner;

public class Crashing 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numrator Value");
		int Num=sc.nextInt();
		System.out.println("Enter the Denominator Value");
		int Den= sc.nextInt();
		float res = (float)(Num/Den);
		System.out.println("Result : "+res);
		
//		Error =
//		Thread [main] (Suspended (exception ArithmeticException))	
//				Crashing.main(String[]) line: 12	

	}

}
