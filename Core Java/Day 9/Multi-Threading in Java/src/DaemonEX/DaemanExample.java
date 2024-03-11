package DaemonEX;

import java.util.Date;

public class DaemanExample
{
	public static void main(String[] args) throws InterruptedException 
	{
		Time th1=new Time();
		th1.setDaemon(true);
		th1.start();
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("Main Thread : "+i*i);
			Thread.sleep(1000);
		} 
	}// end of main

}// end of class

class Time extends Thread
{
	@Override
	public void run() 
	{
		while(true)
		{
			System.out.println(new Date()); // tostring of date
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}