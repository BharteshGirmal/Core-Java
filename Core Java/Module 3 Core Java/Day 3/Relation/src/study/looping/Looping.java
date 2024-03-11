package study.looping;
import java.util.Scanner;
public class Looping 
{
	static double Balance=100;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice=1;
		double Amount;
		do
		{
			System.out.println("Select The Following"
					+ "\n1.Deposit"
					+ "\n2.Withdraw"
					+ "\n3.Show Balance"
					+ "\n4.Quit"
					+ "\nEnter Your Choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Amount to Deposit");
				Amount=sc.nextDouble();
				Balance=Balance+Amount;
				break;
			case 2:
				System.out.println("Enter the Amount to Withdraw");
				Amount=sc.nextDouble();
				if(Balance <100)
				{
					System.out.println("Not Enough Balance");
				}
				else
				{
					Balance-=Amount;
				}
				break;
			case 3:
				System.out.println("Current Balance : "+Balance);
				break;
			case 4:
				System.out.println("Are you want to exit"
						+ "\npress 1 Exit 0 to continue");
				int cnt=sc.nextInt();
				if(cnt == 1)
				{
					break;
				}
				else if(cnt == 0)
				{
					choice=0;
				}
				break;
			default :
				System.out.println("Invalid choice");
				break;
			}
			
		}while(choice !=4);


	}

}
