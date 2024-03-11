import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class EnumrationEx 
{
	public static void main(String[] args) 
	{
		Vector<String> v = new Vector<String>();
		v.add("red");
		v.add("orange");
		v.add("purple");
		v.add("green");
		v.add("yellow");
		v.add("white");
		v.add("black");
		System.out.println("Priting with Enumration : ");
		Enumeration<String> Enum= v.elements();
		while(Enum.hasMoreElements())
		{
			System.out.print(Enum.nextElement()+"  ,");
		}
		System.out.println();
		System.out.println("Printing With itrator : ");
		Iterator<String> it = v.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+"  ,");
		}

	}
}
