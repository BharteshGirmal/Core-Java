package WaitAndNotify;

public class BankUser 
{
	public static void main(String[] args) 
	{
		Account AC = new Account(6000);
		DepositThread thread1 = new DepositThread(AC); // passing same account for sharing
		WithdrawThread thread2= new WithdrawThread(AC);
		thread1.start();
		thread2.start();
	}// end of main

}// end of function

class DepositThread extends Thread
{
	Account ACC; // creating object of account class

	public DepositThread(Account A) 
	{
		this.ACC=A;
	}
	@Override
	public void run()
	{
		synchronized (ACC) 
		{
			if(ACC.getBalance() == 8500)
			{
				try {
					ACC.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
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

			ACC.notifyAll();
		}
	}
}

class WithdrawThread extends Thread
{
	Account ACC; // creating object of account class

	public WithdrawThread(Account A) 
	{
		this.ACC=A;
	}
	@Override
	public void run() 
	{
		synchronized (ACC) 
		{
			if(ACC.getBalance() == 9000)
			{
				try {
					ACC.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			int count=5;
			while(count-- >0)
			{
				ACC.Withdraw(100);
				ACC.ShowBalance();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			ACC.notifyAll(); // Notify to all threads after wait is over
			
		}//end of synchronized fun
		
	}//end of run fun
	
}//end of class