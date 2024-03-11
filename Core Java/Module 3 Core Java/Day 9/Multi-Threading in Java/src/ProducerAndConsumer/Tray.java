package ProducerAndConsumer;

public class Tray 
{
	public static void main(String[] args) 
	{
		Items data= new Items();
		Producer th1= new Producer(data);
		Consumer th2= new Consumer(data);
		
	}//end of main

}//end of class

class Items
{
	int Product;
}

class Producer extends Thread
{
	Items Data;
	public Producer(Items data) 
	{
		this.Data=data;
	}
	@Override
	public void run() 
	{
		while(true)
		{
			StringBuffer str = new StringBuffer();
		}
	}
}//end of class

class Consumer extends Thread
{
	Items Data;
	public Consumer(Items data) 
	{
		this.Data=data;
	}
	@Override
	public void run() 
	{
		while(true)
		{
			
		}
	}
}// end of class