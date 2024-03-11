package Runnables;

public class userofrunnable 
{
	public static void main(String[] args) 
	{
		TableGenration Task1 = new TableGenration();
		// task1 method is only implements Runnable not extends thread
		Factorial Task2 = new Factorial();
		// task2 method is only implements Runnable not extends thread
		
		//to use the thread class we pass the object to thread class
		Thread th1= new Thread(Task1);
		th1.start();
		Thread th2= new Thread(Task2);
		th2.start();
	}

}
