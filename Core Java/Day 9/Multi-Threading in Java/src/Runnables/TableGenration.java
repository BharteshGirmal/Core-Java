
package Runnables;


public class TableGenration implements Runnable
{

	@Override
	public void run() {
		Thread currentThread= Thread.currentThread();
		for (int i = 1; i <=20; i++) 
		{
			for (int j = 1; j <=10; j++) 
			{
				System.out.println(i+" * "+j+" = "+i*j+" "+ currentThread.getName());
			}
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
