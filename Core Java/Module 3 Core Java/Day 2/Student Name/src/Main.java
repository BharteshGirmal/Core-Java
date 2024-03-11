import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student S1= new Student();
		int choice;
		do
		{
			System.out.println("Enter the Student Details");
			String First;
			String Last;
			String stream;
			do
			{
				System.out.println("Enter the First Name ");
				First=sc.next();
				S1.setFirstName(First);
			}while(First == null);

			do
			{
				System.out.println("Enter the Last Name ");
				Last=sc.next();
				S1.setFirstName(Last);
			}while(Last == null);

			do
			{
				System.out.println("Enter the Stream ");
				stream=sc.next();
				S1.setFirstName(stream);
			}
			while(!stream.equalsIgnoreCase("mech")&&!stream.equalsIgnoreCase("Auto")
					&&!stream.equalsIgnoreCase("COMPUTER")&&!stream.equalsIgnoreCase("IT")
					&&!stream.equalsIgnoreCase("Electrical")&&!stream.equalsIgnoreCase("Civil")
					&&!stream.equalsIgnoreCase("Chemical"));
			int age;
			int count=0;
			do
			{
				count++;
				System.out.println("Enter the Age");
				age=sc.nextInt();
				if(count == 2)
				{
					System.out.println("Enter Proper Data");
				}
				if(count == 3)
				{
					System.out.println("Invalid Choice");
					choice=0;
					break;
				}
				S1.setAge(age);	
			}while(age <18 || age>80);
			
			int year;
			do
			{
				System.out.println("Enter Graduation Year");
				year=sc.nextInt();
				S1.setYear(year);
				
			}while(year <2018 || year>2018);
				
			System.out.println("Press 0 to Exit");
			choice=sc.nextInt();
		}while(choice !=0);
		sc.close();

	}
}
