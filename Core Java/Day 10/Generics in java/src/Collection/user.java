package Collection;
import java.util.Scanner;

public class user 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		BirthdayList list=new BirthdayList();
		int choice=0;
		do
		{
			System.out.println("************Guest Menu************"
					+ "\n1.Show Guest List"
					+ "\n2.Add a Guest Name"
					+ "\n3.Remove a Guest"
					+ "\n4.Clear the list"
					+ "\n5.Check guest is Present"
					+ "\n6.Find Number of Guest"
					+ "\n7.Exit"
					+ "\n___________________________________________"
					+ "\nEnter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				list.ShowGuestList();
				break;
			case 2:
				System.out.println("Enter the Guest Name to Add");
				String name=sc.next();
				list.AddName(name);
				break;
			case 3:
				System.out.println("Enter the Guest Name to Remove");
				String name2=sc.next();
				list.RemoveAName(name2);
				break;
			case 4:
				System.out.println("Clearing ther list");
				list.ClearList();
				break;
			case 5:
				System.out.println("Enter Guest name to check wheather present or not");
				String name3=sc.next();
				System.out.println("The Guest "+name3+" is in list "+list.CheckGuestName(name3));
				break;
			case 6:
				int count=list.CountNumberGuest();
				System.out.println("Number Guest in Party is : "+count);
				break;
			default :
				System.out.println("Invalid choice");
				break;
			}
		}while(choice !=7);
	}

}
