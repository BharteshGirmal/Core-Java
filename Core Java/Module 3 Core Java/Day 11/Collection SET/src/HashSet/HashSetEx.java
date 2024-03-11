package HashSet;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetEx 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> HS= new HashSet<Integer>();
		
		Collection<Integer> in = Arrays.asList(45,3,12,1,99,65,78,2,2);
		HS.addAll(in);
		System.out.println("Hash Set : ");
		for(Integer i : HS)
		{
			System.out.print(i+"  ,");
		}
		System.out.println();
		
		LinkedHashSet<Integer> HS1 = new LinkedHashSet<Integer>();
		Collection<Integer> in1 = Arrays.asList(45,3,12,1,99,65,78,2,2);
		HS1.addAll(in1);
		System.out.println("Linked Hash Set : ");
		for(Integer i1 : HS1)
		{
			System.out.print(i1+"  ,");
		}
		System.out.println();
	}

}
