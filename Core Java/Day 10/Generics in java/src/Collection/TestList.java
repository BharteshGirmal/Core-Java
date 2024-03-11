package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class TestList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> str= new ArrayList<String>(); // not thread SAFE
		str.add("Red");
		str.add("White");
		str.add("Black");
		str.add("Blue");
		str.add("Brown");
		str.add("Voilet");
		str.add("Yellow");
		System.out.println("ArrayList Elements : ");
		ShowElements(str);
		//ShowElements2(str);
		System.out.println("After Removing Yellow : ");
		str.remove("Yellow");
		ShowElements3(str);

		LinkedList<String> str1= new LinkedList<String>();
		str1.add("Red");
		str1.add("White");
		str1.add("Black");
		str1.add("Blue");
		str1.add("Brown");
		str1.add("Voilet");
		str1.add("Yellow");
		System.out.println("LinkList Elements : ");
		ShowElements(str1);
		System.out.println("After Removing 1st Element  : ");
		str1.remove();
		ShowElements(str1);

		Stack<String> str2= new Stack<String>();
		str2.add("Red");
		str2.add("White");
		str2.add("Black");
		str2.add("Blue");
		str2.add("Brown");
		str2.add("Voilet");
		str2.add("Yellow");
		System.out.println("Stack Elements : ");
		ShowElements(str2);
		System.out.println("After Removing with index 3");
		str2.remove(3);
		ShowElements(str2);

		Vector<String> str3= new Vector<String>();
		str3.add("Red");
		str3.add("Voilet");
		str3.add("Yellow");
		str3.add("Blue");
		str3.add("Brown");
		str3.add("Black");
		System.out.println("Vector Elements : ");
		ShowElements(str3);
		System.out.println("Red is in the List "+str3.contains("Red"));
		System.out.println("Rainbow is in the List "+str3.contains("Rainbow"));
		System.out.println("Removing All Elements : ");
		str3.removeAllElements();
		ShowElements(str3);

	}// end of main

	public static void ShowElements(List<String> str) 
	{
		for (int i = 0; i < str.size(); i++)
		{
			System.out.print(str.get(i)+"  ,");
		}
		System.out.println();

	}

	public static void ShowElements2(List<String> list) 
	{
		for(String str : list) // for string str in list
		{
			System.out.print(str+"  ,");
		}
		System.out.println();
	}

	// print using itrator
	public static void ShowElements3(List<String> list) 
	{
		Iterator<String> it = list.iterator(); // it will itrate the list
		while(it.hasNext())
		{
			System.out.print(it.next()+"  ,");
		}
		System.out.println();
	}
}// end of class
