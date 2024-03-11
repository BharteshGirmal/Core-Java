package Runnables;

public class ThreadJoin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Thread th1= new Thread(new Task(15));
		th1.setName("Thread 1");
		th1.start();
		
		th1.join(); // Main thread Pauses till th1 thread completes
		System.out.println("Job Done Thank U .............\n"+Thread.currentThread().getName());
	}
}

class Task implements Runnable
{
	int Range;
	public Task(int r) 
	{
		Range=r;
	}
	@Override
	public void run() 
	{
		for (int i = 0; i < Range; i++) 
		{
			System.out.println(i+" "+Thread.currentThread().getName() );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
