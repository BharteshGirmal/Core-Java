package SharingData;

public class BankUser 
{
	public static void main(String[] args) 
	{
		Account AC = new Account(5000);
		DepositThread thread1 = new DepositThread(AC); // passing same account for sharing
		WithdrawThread thread2= new WithdrawThread(AC);
		thread1.start();
		thread2.start();
	}// end of main

}// end of function

class DepositThread extends Thread
{
	private Account ACC; // creating object of account class

	public DepositThread(Account A) 
	{
		this.ACC=A;
	}
	@Override
	public void run()
	{
		int count=5;
		while(count-- >0)
		{
			ACC.Deposit(500);
			ACC.ShowBalance();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class WithdrawThread extends Thread
{
	private Account ACC; // creating object of account class

	public WithdrawThread(Account A) 
	{
		this.ACC=A;
	}
	@Override
	public void run() 
	{
		int count=5;
		while(count-- >0)
		{
			ACC.Withdraw(200);
			ACC.ShowBalance();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}