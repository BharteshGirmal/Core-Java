package Runnables;

public class ThreadAPI 
{
	public static void main(String[] args) 
	{
		Chat thread1= new Chat();
		thread1.setName("First");
		thread1.start();
		Chat thread2= new Chat();
		thread2.setName("Second");
		thread2.start();
		Chat thread3= new Chat();
		thread3.setName("Third");
		thread3.start();
		
		Thread thread4 = new Thread(new TableGenration());
		thread4.setName("Fourth");
		thread4.start();		
		
	}

}
