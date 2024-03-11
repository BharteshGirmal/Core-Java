package WaitAndNotify;

public class Account 
{
	private int Balance;
	
	public Account(int balance) 
	{
		Balance=balance;
	}
	
	public void Deposit(int amount)
	{
		System.out.println("Deposit Amount : "+amount);
		Balance += amount;
		System.out.println("Balance After Deposit : "+Balance);
	}
	
	public void Withdraw(int amount)
	{
		System.out.println("Withdrawal Amount : "+amount);
		Balance -= amount;
		System.out.println("Balance After Withdrawal : "+Balance);
	}
	
	public void ShowBalance()
	{
		System.out.println("Current Balance  : "+Balance);
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}
	
	
	
}// end of function
