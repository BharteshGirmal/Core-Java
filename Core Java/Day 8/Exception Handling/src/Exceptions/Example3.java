package Exceptions;
public class Example3 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(args[0].toUpperCase());//Command Line 
			int x=Integer.parseInt(args[1]); 
			// if args[0] or args[1] is not given then ArrayIndexOutOfBound 
			int division = 100/x;
			// if x =0 ArithamaticException Error
			System.out.println(division);
			String arr[]= new String[3];
			System.out.println(arr[0].toLowerCase());
		}

		//Using Pipe
		catch(ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException E)
		{
			System.out.println("Catching : "+E);
		}
		catch(Exception E) // Acts Like a Sink
		{
			E.printStackTrace();
		}
		System.out.println("End of Try Catch Block , Program end properly");
	}

}
