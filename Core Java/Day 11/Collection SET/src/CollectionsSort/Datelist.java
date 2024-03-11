package CollectionsSort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Datelist 
{
	public static void main(String[] args)
	{
		ArrayList<MyDate> date= new ArrayList<MyDate>();
		date.add(new MyDate(1, 1, 2022));
		date.add(new MyDate(15, 8, 1947));
		date.add(new MyDate(26, 1, 1950));
		date.add(new MyDate(31, 12, 2021));
		date.add(new MyDate(5, 5, 2022));
		System.out.println("Before Sort : ");
		ShowList(date);
		Collections.sort(date);
		System.out.println();
		System.out.println("After Sort : ");
		ShowList(date);
		
	}
	
	public static void ShowList(List<MyDate> list)
	{
		Iterator<MyDate> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
