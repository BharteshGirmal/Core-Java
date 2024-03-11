package SharingData;

public class Account 
{
	private int Balance;
	
	public Account(int balance) 
	{
		Balance=balance;
	}
	
	public synchronized void Deposit(int amount)
	{
		System.out.println("Deposit Amount : "+amount);
		Balance += amount;
		System.out.println("Balance After Deposit : "+Balance);
	}
	
	public synchronized void  Withdraw(int amount)
	{
		System.out.println("Withdrawal Amount : "+amount);
		Balance -= amount;
		System.out.println("Balance After Withdrawal : "+Balance);
	}
	
	public void ShowBalance()
	{
		System.out.println("Current Balance  : "+Balance);
	}
	
}// end of function
