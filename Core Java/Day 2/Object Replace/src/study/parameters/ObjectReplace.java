
package study.parameters; // creating a new package for a class ObjectReplace

public class ObjectReplace 
{
	public static void main(String[] args) 
	{
		SwappingNumber X= new SwappingNumber();
		X.value=10;
		System.out.println("Before  X : "+X.value);
		Increament(X);
		System.out.println("After   X : "+X.value);
	}
	
	public static void Increament(SwappingNumber x)
	{
		x.value=90;
	}
}


// creating a anather class of SwappingNumber
class SwappingNumber
{
	int value;
}