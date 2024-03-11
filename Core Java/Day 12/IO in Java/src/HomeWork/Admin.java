package HomeWork;

import java.util.Scanner;
import java.util.TreeMap;

public class Admin
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		TreeMap<String, String> str= new TreeMap<String,String>();
		// passing string as formal arguments ( UserName and Password )
		User obj=new User(); // object of user class
		obj.AddUser("Bhartesh","123456");
		obj.AddUser("Akshay","654321");
		obj.AddUser("Pankaj","112233");
		obj.AddUser("Pooja","123321");
		obj.AddUser("Neha","321123");

		int choice=0;
		do
		{
			System.out.println("*************************************************"
					+ "\n1.Add a User"
					+ "\n2.Login Enter User Name and Password"
					+ "\n3.Show All Users"
					+ "\n4.Change a Password"
					+ "\n5.Remove a User"
					+ "\n6.Quit"
					+ "\nEnter Your Choice");
			choice=sc.nextInt();
			System.out.println("*************************************************");
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter User Name");
				String Name=sc.next();
				do
				{		
					System.out.println("Enter the Password");
					String Pass=sc.next();
					System.out.println("Re-Enter the Password");
					String Pass2=sc.next();
					if(Pass.equals(Pass2))
					{
						obj.AddUser(Name, Pass2);
						System.out.println("Username Added Sucessfully...........");
						break;
					}
					System.out.println("Password Doesn't Matches ReEnter the Password");
					
				}while(true);
				break;
			}
			
			case 2:
				System.out.println("Enter the UserName");
				String name=sc.next();
				System.out.println("Enter the Password");
				String Password=sc.next();
				obj.Login(name, Password);
				break;
			case 3:
				System.out.println("Showing the List of All Users..............");
				obj.ShowUser();
				break;
			case 4:
				System.out.println("Enter User Name");
				String user=sc.next();
				try {
					obj.ChangePassword(user);
				} catch (UnauthorisedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 5:
				System.out.println("Enter User Name");
				String Uname=sc.next();
				System.out.println("Enter Password");
				String Upass=sc.next();
				try {
					obj.RemoveUser(Uname, Upass);
				} catch (UnauthorisedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 6:
				System.out.println("________________ Thank You ________________");
				break;
			default :
				System.out.println("Invalid Choice");
				break;
			}

		}while(choice !=6);
		sc.close();

	}//end of main

}// end of class
