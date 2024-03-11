package WaitAndNotify;

public class WaitAndNotifyEx 
{
	public static void main(String[] args) 
	{
		Data D = new Data();
		Increament th1= new Increament(D);
		Decrement th2 = new Decrement(D);
		th1.start();
		th2.start();
	}// end of main
}// end of function

class Data
{
	int value;
}


class Increament extends Thread
{
	Data D;
	public Increament(Data d) 
	{
		this.D=d;
	}
	@Override
	public void run() 
	{
		while(true)
		{
			synchronized (D) 
			{
				if(D.value == 10)
					try {
						D.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				D.value++;
				D.notifyAll();
			}
			System.out.println("After Increament The value is : "+D.value);
		}
	}
}


class Decrement extends Thread
{
	Data D;
	public Decrement(Data d) 
	{
		this.D=d;
	}
	@Override
	public void run() 
	{
		while(true)
		{
			synchronized(D) 
			{
				if(D.value == 0)
				{
					try {
						D.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				D.value--;
				D.notifyAll();
			}
			System.out.println("After Decrement The value is : "+D.value);
		}
	}
}