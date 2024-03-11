package Runnables;

public class Multithread 
{
	public static void main(String[] args) 
	{
		Video th1= new Video();
		Chat th2= new Chat();
		th1.start();
		// this will create OS level thread and add it into ready queue
		th2.start();
		// When thw Schedular wil select the thread at the time of run() execute
	}
}

class Video extends Thread
{
	@Override
	public void run() 
	{
		while(true)
			System.out.println("Zoom Video is Running");
	}
}
class Chat extends Thread
{
	@Override
	public void run() 
	{
		while(true) {
			System.out.println("Zoom Chat is Running : "+super.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

