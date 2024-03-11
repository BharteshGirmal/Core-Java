package Exceptions;
public class ExceptionHandlingEx 
{
	public static void main(String[] args) 
	{
		String arr[]= new String[3];
		
		try
		{
			System.out.println(args[0].toUpperCase());
			//java.lang.ArrayIndexOutOfBoundsException: 0 // For No Arguments
			System.out.println("Line After Problematic Code");
		}
		
		//catch(ArithmeticException E)
		//Error: Could not find or load main class ExceptionHandlingEx
		catch(Exception E)
		{
			//Stack methods are shown
			System.out.println(E);
		}
		finally 
		{
			System.out.println("this code will always run ");
		}
		System.out.println("OutSide Try Catch Finally code Ends Properly");
	}

}
