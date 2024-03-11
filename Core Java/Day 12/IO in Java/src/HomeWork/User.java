package HomeWork;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class User 
{
	private TreeMap<String, String> UserInfo;
	Scanner sc= new Scanner(System.in);
	
	public TreeMap<String, String> getUserInfo() 
	{
		return UserInfo;
	}
	
	public User()
	{
		UserInfo= new TreeMap<String ,String>();
	}
	
	public void AddUser(String name,String pass)
	{
		Set<String> user= UserInfo.keySet(); // this will set the user in set
		Iterator<String> it=user.iterator();
		while(it.hasNext())
		{
			String value=it.next();
			if(value.equals(name))
			{
				System.out.println("User Already Exists ..........");
				return;
			}
		}
		UserInfo.put(name, pass);
		System.out.println("User Added Successfully...");
	}
	
	public void ShowUser()
	{
		Set<String> user=UserInfo.keySet();
		Iterator<String> it=user.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public String GetPassword(String name)
	{
		Set<String> user=UserInfo.keySet();
		Iterator<String> it=user.iterator();
		while(it.hasNext())
		{
			String value=it.next(); // taking the values
			if(value.equals(name)) return UserInfo.get(value); // returning id and pass if matches
		}
		//else
		System.out.println("User Not Found ................");
		return null;
	}
	
	public void ChangePassword(String name) throws UnauthorisedException
	{
		Set<String> user=UserInfo.keySet();
		Iterator<String> it=user.iterator();
		while(it.hasNext())
		{
			String value=it.next(); // taking the values
			if(value.equals(name))
			{
				// if name matches in set then enter the od pas to set new password
				System.out.println("Enter the Password");
				String pass=sc.nextLine();
				if(UserInfo.get(value).equals(pass))// checking if old password is correct or not
				{
					// if matches then 
					do
					{
						System.out.println("Enter New Password : ");
						String pass1 = sc.next(); // first new passord
						System.out.println("Re-Enter new Password : ");
						String pass2 = sc.next(); // Confirm new passord
						if(pass1.equals(pass2))
						{
							UserInfo.put(value, pass2);
							System.out.println("Password Changed Sucessfully............");
							return ;
						}
						// else if pass1 pass2 not matches
						System.out.println("ReEnter New Password");
					}while(true);
				}
				else
					throw new UnauthorisedException();
			}
		}//end of while loop
		System.out.println("User Not Found ..............");
	}
	
	public void RemoveUser(String name,String pass) throws UnauthorisedException
	{
		Set<String> user= UserInfo.keySet(); // this will set the user in set
		Iterator<String> it=user.iterator();
		while(it.hasNext())
		{
			String value=it.next();
			if(value.equals(name))
			{
				if(UserInfo.get(value).equals(pass))
				{
					UserInfo.remove(value);
					System.out.println("User Removed..................");
					return;
				}
				else
					throw new UnauthorisedException();
			}
		}
		System.out.println("User Not Found....................");
	}
	
	public void Login(String name ,String pass)
	{
		Set<String> user= UserInfo.keySet(); // this will set the user in set
		Iterator<String> it=user.iterator();
		while(it.hasNext())
		{
			String value=it.next();
			if(value.equals(name))
			{
				if(UserInfo.get(value).equals(pass))
				{
					System.out.println("******************** Welcome ********************");
				}
				else
					System.out.println("Invalid User Name and Password ..........");
				return;
			}
		}
		System.out.println("Not Allowed .................");
	}

}
