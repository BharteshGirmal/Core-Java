package study.bankAccount;

import java.util.Scanner;

public class Banking 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of customers to open account");
		int num=sc.nextInt();
		BankAccount[] Bank = new BankAccount[num];
		for(int i=0;i<num;i++)
		{
			Bank[i] = new BankAccount();
			Bank[i].OpenAccount();
			// for Each new customer a sperate object is created
		}
		int ch;
		do
		{
			System.out.println("********************** Bank System Application **********************");
			System.out.println("\n1.Show Details of Bank Account"
					+ "\n2.Search Account Number"
					+ "\n3.Deposit The Amount"
					+ "\n4.Withraw the Amount"
					+ "\n5.Quit"
					+ "\nEnter Your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				for(int i=0;i<Bank.length;i++)
				{
					Bank[i].ShowAccountDetails();
				}
				break;
			case 2:
				System.out.println("Enter the Account Number to be Search");
				String S= sc.next();
				boolean found=false;
				for(int i=0;i<Bank.length;i++) // Searching Account Number in Whole system
				{
					found=Bank[i].CheckAccountExits(S);
					if(found == true)
						break;
				}
				if(found==false)
				{
					System.out.println("Account Not Exists");
				}
				break;
			case 3:
				found=false;
				System.out.println("Enter Account Number");
				String No=sc.next();
				for(int i=0;i<Bank.length;i++)
				{
					found=Bank[i].CheckAccountExits(No);
					if(found == true)
					{
						Bank[i].Deposit();
					}
					break;
				}
				if(found == false)
				{
					System.out.println("Searched Falied Account Doesnt Exists");
				}
				break;
			case 4:
				found=false;
				System.out.println("Enter Account Number");
				String N=sc.next();
				for(int i=0;i<Bank.length;i++)
				{
					found=Bank[i].CheckAccountExits(N);
					if(found == true)
					{
						Bank[i].Withdraw();
					}
					break;
				}
				if(found == false)
				{
					System.out.println("Searched Falied Account Doesnt Exists");
				}
				break;
			case 5:
				System.out.println("\tTransaction Dislined");
				System.out.println("********************** Bank System Application **********************");
				break;
			}
		}while(ch !=5);

	}

}
