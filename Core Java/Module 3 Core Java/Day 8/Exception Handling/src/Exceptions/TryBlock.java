
package Exceptions;

public class TryBlock 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(args[0].toUpperCase());//Command Line 
			int x=Integer.parseInt(args[1]); 
			// if args[0] or args[1] is not given then ArrayIndexOutOfBound 
			int division = 100/x;
			// if x =0 ArithamaticExcep  tion Error
			System.out.println(division);
		}

		catch(ArrayIndexOutOfBoundsException A)
		{
			System.out.println("Enter Enough Command Line Arguments ");
		}
		catch(ArithmeticException AA)
		{
			System.out.println("You Can not divide by 0");
		}
		catch(NumberFormatException NN)
		{
			System.out.println("Args[1] Must be a number");
		}
		System.out.println("End of Try Catch Block , Program end properly");
	}

}
