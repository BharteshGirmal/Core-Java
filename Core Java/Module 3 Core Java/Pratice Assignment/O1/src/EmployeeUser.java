import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*Q1.Write a class study.Test.CollectionsUtility
	1. create an ArrayList of Employee
		sort it in ascending order
	2. use binarySearch of Collections class
		and check whether a given number is in the ArrayList.
Use the Employee class created earlier.

*/

public class EmployeeUser {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Employee e;
		ArrayList<Employee> list= new ArrayList<Employee>();
		list.add(new Employee(121, "Bhartesh", "Java", new MyDate(20, 05, 2022)));
		list.add(new Employee(154, "Nilima", "Advanced-Java", new MyDate(21, 9, 2022)));
		list.add(new Employee(115, "Shubham", "Micro-Soft", new MyDate(3, 11, 2021)));
		list.add(new Employee(157, "Hardik", "DataBase", new MyDate(17, 01, 2022)));
		int choice=0;
		do
		{
			System.out.println("1.Show list of Employee"
					+ "\n2.Sort Employee"
					+ "\n3.Search Employee"
					+ "\n4.Binary Search"
					+ "\n0.Exit"
					+ "\nEnter Your Choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 0:
					System.exit(0);
					break;
				case 1:
					Iterator<Employee> it=list.iterator();
					while(it.hasNext())
					{
						System.out.println(it.next());
					}
					break;
				case 2:
					System.out.println("Enter the Employee id");
					int id=sc.nextInt();
					System.out.println("Enter the Name of Employee");
					String name=sc.next();
					System.out.println("Enter the Department");
					String dept=sc.next();
					System.out.println("Enter the Date of Joining");
					System.out.println("Enter Day");
					int day=sc.nextInt();
					System.out.println("Enter Month");
					int month=sc.nextInt();
					System.out.println("Enter Year");
					int year=sc.nextInt();
					MyDate date= new MyDate(day, month, year);
					e=new Employee(id, name, dept, date);
					list.add(e);
					System.out.println("New Employee Added Sucessfully");
					break;
				case 3:
					Collections.sort(list);
					Iterator<Employee> it2=list.iterator();
					while(it2.hasNext())
					{
						System.out.println(it2.next());
					}
					System.out.println("The list is Sorted ............................");
					break;
				case 4:
					System.out.println("Binary Search.........");
					System.out.println("Enter the Employee id to search");
					int id3=sc.nextInt();
					int search = Collections.binarySearch(list,new Employee(115, "Shubham", "Micro-Soft", new MyDate(3, 11, 2021)));
					if(search != 0)
					System.out.println("The roll number "+id3+" present at "+(search+1)+" location");
					else
						System.out.println("Student not Present");
					break;
				default :
					System.out.println("Invalid Choice");
					break;
			}
		}while(true);
	}
}
