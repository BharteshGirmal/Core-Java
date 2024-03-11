package TreeSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class SetExample
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t= new TreeSet<Integer>();
//		t.add(45);
//		t.add(3);
//		t.add(12);
//		t.add(1);
//		t.add(99);
//		t.add(65);
//		t.add(78);
//		t.add(2);
//		t.add(21); anther method 

		Collection<Integer> ints=Arrays.asList(45,3,12,1,99,65,78,2,21);
		t.addAll(ints);

		for(Integer i : t)
		{
			System.out.print(i+ "  ,");
		}
		System.out.println();

	}
}
