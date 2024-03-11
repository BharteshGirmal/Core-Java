package study.wrapper;

public class Wrapper2 
{
	public static void main(String[] args) 
	{
		System.out.println("byte range : "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
		System.out.println("Integer range : "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
		System.out.println("Float range : "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
		System.out.println("Double range : "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);
		System.out.println("Short range : "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
		System.out.println("Long range : "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
		
		// Parse
		String s="44.33";
		//double d= s+55.55;
		double d= Double.parseDouble(s)+55.55;
		System.out.println("ParseDouble from Double Wrapper class : "+d);
		
		Boolean B= true;
		Boolean BB= Boolean.parseBoolean(B);
		if(BB==B)
		{
			System.out.println("Hiii");
		}
	}

}
