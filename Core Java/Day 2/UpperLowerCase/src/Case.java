import java.util.Scanner;

public class Case 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		int choice=0;
		do
		{
			System.out.println("Select the Following"
					+ "\n1.Convert String to Uppercase"
					+ "\n2.Convert String to Lowercase"
					+ "\nExit"
					+ "\nEnter your Choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Uppercase(str);
				break;
			case 2:
				Lowercase(str);
				break;
			default :
				System.out.println("Invalid choice");
				break;
			}
		}while(choice!=3 || choice ==0);

	}

	private static void Lowercase(String str) 
	{
		String str1=str.toLowerCase();
		System.out.println("Lowercase String : "+str1);
	}

	private static void Uppercase(String str) 
	{
		String str1=str.toUpperCase();
		System.out.println("Uppercase String : "+str1);
	}

}
