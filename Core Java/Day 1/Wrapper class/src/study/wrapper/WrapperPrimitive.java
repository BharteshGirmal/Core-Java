
package study.wrapper;

public class WrapperPrimitive 
{
	public static void main(String[] args) 
	{
		Integer ob= new Integer(88);  // Boxing
		Integer ob2=100; // Auto Boxing
		Character ch= new Character('a'); // Boxing
		Character ch2='b'; // Auto Boxing
		Boolean bool= new Boolean(false); //Boxing
		Boolean bool2=true;
		Float f= new Float(88.323);
		Double d= new Double(9999.99);
		
		// Primitive data type
		int x= ob ; // Auto UnBoxing
		int y= ob2;
		char c=ch;
		char c2=ch2;
		boolean b=bool;
		boolean b2=bool2;
		float s=f;
		double dd=d;
	}
}
