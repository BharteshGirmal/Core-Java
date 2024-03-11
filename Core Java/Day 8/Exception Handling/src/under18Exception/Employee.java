package under18Exception;
public class Employee
{
	private String Name;
	private  String Department;
	private  MyDate DOJ;

	public Employee(String name, String department, MyDate dOJ) {
		super();
		Name = name;
		Department = department;
		DOJ = dOJ;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() 
	{
		String str="\nEmployee Name : "+Name+"\nDepartment : "+Department+"\nDate of Joining : "+DOJ;
		return str;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public MyDate getDOJ() {
		return DOJ;
	}
	public void setDOJ(MyDate dOJ) throws Under18Exception
	{
		if((2022 - dOJ.getYear()) >=18) //difference of current enter and birth year
				this.DOJ=dOJ;
		else
			throw new Under18Exception();
				
	}	
}
