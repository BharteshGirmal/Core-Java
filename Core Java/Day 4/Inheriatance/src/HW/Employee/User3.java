
package HW.Employee;
import java.util.Scanner;
public class User3 
{
	public static void main(String[] args) 
	{
		PartTimeEmployee Emp= new PartTimeEmployee();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Total Working Hours");
		double hours=sc.nextDouble();
		Emp.setWorkingHR(hours);
		System.out.println(Emp);
		Emp.setName("Bhartesh");
		System.out.println(Emp);
		Emp.setEmpId(121);
		System.out.println(Emp);
		Emp.setDepartment("Core Java");
		System.out.println(Emp);
	}

}
