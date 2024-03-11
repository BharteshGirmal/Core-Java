import java.util.HashMap;
import java.util.Scanner;

public class User
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<Integer, String> list= new HashMap<Integer,String>();
		hashmap H1= new hashmap(); // objcet of hash class
		int choice=1;
		do
		{
			System.out.println("1.Add Student in 5 Batches"
					+ "\n2.Show All Students"
					+ "\n3.Exit"
					+ "\nEnter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				for(int i=0;i<5;i++)
				{
					System.out.println("Enter the Roll Number of "+(i+1)+" Student");
					int roll=sc.nextInt();
					System.out.println("Enter the Name of "+(i+1)+" Student");
					String name=sc.next();
					H1.AddUser(roll, name);
				}
				System.out.println("All Names and Roll Numbers added ...............");
				break;
			case 2:
				H1.Show();
				break;
			case 3:
				System.exit(0);
				break;
			default :
				System.out.println("Invalid choice");
				break;
			}
			
		}while(choice !=3);
	}
}
