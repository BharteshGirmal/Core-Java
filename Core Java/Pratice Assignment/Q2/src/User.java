import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class User
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		Student Stud=null;
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Bhartesh Girmal",81.60,121,"Ichalkarnji-Kolhapur"));
		list.add(new Student("Akshay Girmal",82.21,100,"Ichalkarnji-Kolhapur"));
		list.add(new Student("Shubham Sharma",85.41,144,"MadhyaPradesh"));
		list.add(new Student("Hardik Parab",91.92,115,"Latur-Maharashtra"));
		int choice=0;

		do
		{
			System.out.println("1.Add a Student to the List "
					+ "\n2.Remove a Student from the list"
					+ "\n3.Show All Students"
					+ "\n4.Show All Students Based on Percentage"
					+ "\n5.Find a student with Student Name"
					+ "\n6.Save All the Deatils of Students in a file"
					+ "\n0.Exit"
					+ "\nEnter Your Choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				sc.nextLine();
				System.out.println("Enter the Name of Student");
				String name=sc.nextLine();
				System.out.println("Enter the Percentage");
				double percentage=sc.nextDouble();
				System.out.println("Enter the Roll Number");
				int RollNo=sc.nextInt();
				System.out.println("Enter the Address");
				String Address=sc.nextLine();
				Stud=new Student(name, percentage, RollNo, Address);
				list.add(Stud);
				break;
			case 2:
				System.out.println("Enter The Roll number of student to remove");
				int rollno=sc.nextInt();
				int flag=0;
				for(int i=0;i<list.size();i++)
				{
					if(list.get(i).getRollNo() == rollno)
					{
						flag++;
						list.remove(i);
						System.out.println("The Roll Number "+rollno+" is removed .............");
						break;
					}
				}
				if(flag == 0)
				{
					System.out.println("Roll Number"+rollno+" is not Present");
				}
				break;
			case 3:
				Iterator<Student> it= list.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				break;
			case 4:
				Collections.sort(list);
				Iterator<Student> it2= list.iterator();
				while(it2.hasNext())
				{
					System.out.println(it2.next());
				}
				System.out.println("The List is Sorted According to Percentage...............");
				break;
			case 5:
				System.out.println("Enter the Name of Student");
				String name2=sc.next();
				Iterator<Student> it3=list.iterator();
				while(it3.hasNext())
				{
					if(name2.equals(Stud.getName()))
					{
						System.out.println("The Student is Already Exists ........");
						System.out.println(name2);
						break;
					}
					System.out.println("No such Student Found int the list.............");
				}
				break;
			case 6:
				System.out.println("Enter the Student name to check the details");
				sc.nextLine();
				String str=sc.nextLine();
				System.out.println("Name : "+str);
				int flag2=0;
				for(int i=0;i<list.size();i++)
				{
					if(list.get(i).getName().equalsIgnoreCase(str))
					{
						flag2++;
						System.out.println(list.get(i));
						break;
					}
				}
				if(flag2 == 0)
				{
					System.out.println("Name not found ");
				}
				System.out.println("___________________________________________");
				break;
			case 7:
				FileOutputStream file=new FileOutputStream("E:\\C-DAC\\Core Java Module 3\\Pratice Assignment\\StudentList.xyz",true);
				ObjectOutputStream obj= new ObjectOutputStream(file);
				PrintWriter pw=new PrintWriter(obj);
				for(int i=0;i<list.size();i++)
				{
					pw.println(list.get(i));
				}
				pw.flush();
				pw.close();
				System.out.println("Information Added sucessfully..............");
				break;
			default :
				System.out.println("Invalid choice");
			}

		}while(true);

	}

}
