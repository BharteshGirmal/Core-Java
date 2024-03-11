import java.util.Scanner;

public class StringUser 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int choice=0;
		do
		{
			System.out.println("1.Find the Length of String"
					+ "\n2.Show SubString"
					+ "\n3.Check for Pallindrome"
					+ "\n4.Count Number of vowels and digits in String"
					+ "\n5.Exit"
					+ "\nEnter your Choice");
			choice=sc.nextInt();
			switch(choice)	
			
			{
			case 1: 
				StringOpration.LengthOfString(str);
				break;
			case 2:
				StringOpration.SubString(str);
				break;
			case 3:
				StringOpration.Pallindrome(str);
				break;
			case 4:
				StringOpration.CountString(str);
				break;
			case 5:
			break;
			default : System.out.println("Inavalid choice");
			break;
			}
		}while(choice !=5);
	}

}
