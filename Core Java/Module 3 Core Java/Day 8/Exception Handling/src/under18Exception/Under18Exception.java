package under18Exception;
public class Under18Exception extends Exception // Checked Exception
{
	public Under18Exception()
	{
		super("The Age of Employee must be Greater than 18");
	}

}
