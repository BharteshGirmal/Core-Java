package HW.Employee;
public class PartTimeEmployee extends Employee
{
	private double WorkingHR;
	
	public PartTimeEmployee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public PartTimeEmployee(String Name , String Department,int id,double salary,double workingHR) 
	{
		super(Name,Department,id,salary);
		WorkingHR = workingHR;
	}
	
	@Override
	public String toString() 
	{
		String str=super.toString()+"\nTotal Working hours : "+this.WorkingHR;
		str+="\n_______________________________";
		return str;
	}

	public double getWorkingHR() 
	{
		return WorkingHR;
	}

	public void setWorkingHR(double workingHR) 
	{
		WorkingHR = workingHR;
	}

}
