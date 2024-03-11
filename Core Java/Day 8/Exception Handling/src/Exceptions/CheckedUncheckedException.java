package Exceptions;
import java.io.IOException;

public class CheckedUncheckedException 
{
	public static void main(String[] args) 
	{
		ShowNumber("23");
//		try
//		{
//			ShowNumber("23");
//		}
//		catch(NumberFormatException N)
//		{
//			System.out.println("Must be a Number : "+N);
//		}
		System.out.println("Program Ends Successfully");
	}
	
	public static void ShowNumber(String s)
	{
		int x= Integer.parseInt(s);
		System.out.println("Res : "+(x*x));
	}

	public static void Test()
	{
		throw new ArithmeticException(); // unchecked Exception
		// Low Priority 
	}

	public static void Test2()
	{
		try 
		{
			throw new IOException(); // Checked Exception
			// Top Priority
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
