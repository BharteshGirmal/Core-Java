
/*Q3.Write a program that accepts numbers from command line 
show the following
1.Sum of all numbers.
2.all numbers in sorted order.
3.Maximum number from all numbers .
4.Minimum value from all numbers.
Handle non-number input exception using exception handling code. and skip it.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CommandLine 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		int i=0;
		while(i<args.length) // length of command line arguments
		{
			try {
			while(i<args.length)
			{
				list.add(Integer.parseInt(args[i])); //Boxing
				// Adds all elements in the list from command line 
				i++;
			}
			}catch(NumberFormatException n)
			{
				System.out.println(n);
				i++;
			}
		}
		System.out.println("The Command Line Arguments are : ");
		for(Integer S1:list)
		{
			System.out.print(S1+"  ,");
		}
		int sum=0;
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			sum=sum+it.next();// calculating the sum from the list of populated elements
		}
		System.out.println("Sum : "+sum);
		System.out.println("The Sorted Lis"
				+ "t is : ");
		Collections.sort(list);
		for(Integer S:list)
		{
			System.out.print(S+"  ,");
		}
		System.out.println();
		System.out.println("Min : "+Collections.min(list)); 
		//Minimum value from the list
		System.out.println("Max : "+Collections.max(list));
		//Maximum value from the list
	}

}
