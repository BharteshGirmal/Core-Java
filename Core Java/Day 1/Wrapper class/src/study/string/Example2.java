package study.string;

public class Example2 
{
	public static void main(String[] args) 
	{
		StringBuffer SB= new StringBuffer("Hello");
		SB.append("World");
		// Mutable StringBuffer
		System.out.println("  "+SB);
		
		StringBuilder SS=new StringBuilder("Good");
		SS.append("Morning");
		// Mutable StringBuilder
		System.out.println(SS+"  "); 
		
		String s1= new String("GOOD");
		s1.concat("Afternoon");
		//Immutable String
		System.out.println(s1);
		
	}

}
