package under18Exception;
public class User 
{
	public static void main(String[] args) 
	{
		Employee E= new Employee();
		E.setDepartment("Developer");
		try
		{
			E.setDOJ(new MyDate(12, 05, 2015));
		}
		catch(Under18Exception U)
		{
			System.out.println(U);
		}
		E.setName("Bhartesh");
		System.out.println(E);
		System.out.println("Program Ends Properly");
	}

}
