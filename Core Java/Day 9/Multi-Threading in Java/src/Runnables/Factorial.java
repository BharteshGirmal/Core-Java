package Runnables;

public class Factorial implements Runnable 
{

	@Override
	public void run() 
	{
		for (int i = 1; i <=10; i++) 
		{
			int fact=1;
			for (int j = 2; j <= i; j++) 
			{
				fact=fact*j;
			}
			System.out.println("Factorial of : " +i+ " = "+fact);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
