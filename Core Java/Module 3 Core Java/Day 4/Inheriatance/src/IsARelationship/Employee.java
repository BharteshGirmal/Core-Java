package IsARelationship;
public class Employee extends Person 
{
	private int EmpId;
	private double Salary;
	private String Department;
	
	public Employee() 
	{
		System.out.println("Employee is created");
	}
	
	public Employee(int empId, double salary, String department)
	{
		super();
		EmpId = empId;
		Salary = salary;
		Department = department;
	}
	
	public void Show()
	{
		System.out.println(super.getName()+" "+super.getDOJ());
		System.out.println(this.EmpId+" "+this.Salary+" "+this.Department);
	}



	public int getEmpId() 
	{
		return EmpId;
	}
	public void setEmpId(int empId) 
	{
		EmpId = empId;
	}
	public double getSalary() 
	{
		return Salary;
	}
	public void setSalary(double salary) 
	{
		Salary = salary;
	}
	public String getDepartment()
	{
		return Department;
	}
	public void setDepartment(String department) 
	{
		Department = department;
	}
	
	
}
