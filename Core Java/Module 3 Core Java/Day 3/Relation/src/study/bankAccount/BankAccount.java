
package study.bankAccount;

import java.util.Scanner;

public class BankAccount 
{
	private String AccNo;
	private String AccName;
	private String AccType;
	private float Balance;
	static Scanner sc= new Scanner(System.in);

	public void OpenAccount()
	{
		System.out.println("Enter Account Number");
		AccNo=sc.nextLine();
		System.out.println("Enter The Name");
		AccName=sc.nextLine();
		System.out.println("Enter Account Type"
				+ "\n1.Saving"
				+ "\n2.Current");
		AccType=sc.next();
		System.out.println("Enter the Account Opening Balance");
		Balance=sc.nextFloat();
		sc.nextLine();
	}

	public void ShowAccountDetails()
	{
		System.out.println("Account Holder's Name : "+this.AccName);
		System.out.println("Account Number : "+this.AccNo);
		System.out.println("Account Type : "+this.AccType);
		System.out.println("Balance : "+this.Balance);
	}

	public void Deposit()
	{
		float Amount;
		System.out.println("Enter the Amount to Deposit");
		Amount=sc.nextFloat();
		Balance = Balance +Amount;
	}

	public void Withdraw()
	{
		float Amount;
		System.out.println("Enter the Amount to Withdraw");
		Amount=sc.nextFloat();
		if(Amount > Balance)
		{
			System.out.println("InSufficient Balance to withdraw Amount");
		}
		else
		{
			Balance=Balance - Amount;
			System.out.println("Balance After Withrawal of "+Amount+" is : "+this.Balance);
		}
	}

	public boolean CheckAccountExits(String AcNo)
	{
		if(AccNo.equals(AcNo))
		{
			ShowAccountDetails();
			return true;
		}
		else
		{
			System.out.println("Account Does't Exists");
			return false;
		}
	}
}
