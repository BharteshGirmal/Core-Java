package inheritance;

public class Test2 
{
	public static void main(String[] args) 
	{
		
		test(new Beta());
		test(new Alpha()); // it shows error of ClassCastError.
		//(due to passing Super class as argument to test and type Casting to subclass Object)
		test(new Theta());
		test(new Gama());
		//test(new Delta());
	}
	
	
	//passing base class - Allows all objects of Hierarchy to be passed
	public static void test(Alpha obj)
	{
		obj.F1();
		obj.FA();
		if(obj instanceof Beta)
		((Beta)obj).FB(); // Type Casting
	}

}
