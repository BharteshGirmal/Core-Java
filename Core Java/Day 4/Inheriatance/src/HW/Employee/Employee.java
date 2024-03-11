
package HW.Employee;

import IsARelationship.Person;

public class Employee extends Person
{
	private String Name;
	private String Department;
	private int EmpId;
	private double Salary;
	
	public Employee() 
	{
		super();
	}
	
	public Employee(String name, String department, int empId, double salary) 
	{
		super();
		Name = name;
		Department = department;
		EmpId = empId;
		Salary = salary;
	}
	
	@Override
	public String toString()
	{
		String str="Employee Name : "+this.Name+"\nDepartment : "+this.Department+
				"\nEmployee ID : "+this.EmpId+"\nSalary : "+this.Salary;
		return str;
	}

	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
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
