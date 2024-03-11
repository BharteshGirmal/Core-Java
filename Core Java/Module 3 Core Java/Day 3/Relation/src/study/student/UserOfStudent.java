package study.student;
import java.util.Scanner;
import study.student.StudentNames;

public class UserOfStudent
{
	static Scanner sc = new Scanner(System.in);
	static StudentNames SS= new StudentNames("Bhartesh Girmal");
	public static void main(String[] args) 
	{
		Menu();
	}
	
	private static void Menu()
	{
		int ch , index;
		do
		{
			System.out.println("Select the Following"
					+ "\n1.Show All Names"
					+ "\n2.Add a Name"
					+ "\n3.Delete a Name"
					+ "\n4.Exit"
					+ "\nEnter you Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				SS.ShowAllNames();
				break;
			case 2:
				System.out.println("Enter the name Seprated by space ");
				sc.nextLine();
				String str=sc.nextLine();
				SS.AddName(str);
				break;
			case 3:
				System.out.println("Enter the index Number");
				index=sc.nextInt();
				String name= SS.GetNameOnIndex(index);
				if(name == null)
				{
					System.out.println("Invalid Index");
				}
				else
				{
					System.out.println("Name : "+name+"\n index : "+index);
				}
				break;
			case 4:
				System.exit(0);
				break;
			default :
				System.out.println("Invalid Choice");
				break;
			}
		}while(ch !=4);
	}

}
