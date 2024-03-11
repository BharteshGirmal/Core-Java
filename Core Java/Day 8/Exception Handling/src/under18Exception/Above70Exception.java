package under18Exception;

public class Above70Exception extends RuntimeException // Unchecked Exceptions
{
	public Above70Exception() // Parameterless Constructor
	{
		super("The Age of Employee is greater than 70");
		//throwing exception
	}

}
