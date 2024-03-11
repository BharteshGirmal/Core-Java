
package study.parameters;

public class ObjectSwapping_2 
{
	public static void main(String[] args) 
	{
		SwappingNumber S1= new SwappingNumber();
		SwappingNumber S2= new SwappingNumber();
		
		S1.value=90;
		S2.value=66;
		
		System.out.println("Before \nS1 : "+S1.value+"\nS2 : "+S2.value);
		Increament(S1,S2);
		System.out.println("After \nS1 : "+S1.value+"\nS2 : "+S2.value);
	} // end of main
	
	public static void Increament(SwappingNumber x ,SwappingNumber y)
	{
		x.value++;
		y.value++;
	}

} // end of class

class SwappingNumber
{
	int value;
}