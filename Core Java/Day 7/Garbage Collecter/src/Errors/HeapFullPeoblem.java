package Errors;
public class HeapFullPeoblem 
{
	public static void main(String[] args) 
	{
		Dummy []arr= new Dummy[10000];
		
		for (int i = 0; i < 1000; i++) 
		{
			System.out.println(i);
			//arr[i]= new Dummy();//OutOfMemory Error
			//arr[i]=null; // No Error
			Dummy data= new Dummy();
			System.gc();
		}
	}

}

class Dummy
{
	Dummy[] data= new Dummy[100000]; //OutOfMemory Error
	
	@Override 
	// this is a override function of object class it is called implicitly by complier
	protected void finalize() throws Throwable 
	{
		//Cleanup / store / printing done just before the object is being released
		System.out.println("The Object is cleared from stack is having address : "+this);
	}
}
