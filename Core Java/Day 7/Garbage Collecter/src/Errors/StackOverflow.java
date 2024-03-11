package Errors;
public class StackOverflow 
{
	public static void main(String[] args) 
	{
		DummyFunction();
	}

	private static void DummyFunction() 
	{
		System.out.println("Hiiii");
		// no terminating condition
		DummyFunction(); // recursive call
	}

}
