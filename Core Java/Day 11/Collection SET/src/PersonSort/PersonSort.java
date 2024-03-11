package PersonSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PersonSort
{
	public static void main(String[] args) 
	{
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("Bhartesh" , new MyDate(1, 05, 2022)));
		list.add(new Person("Pankaj" , new MyDate(25, 04, 2021)));
		list.add(new Person("Aniket" , new MyDate(11, 04, 2018)));
		list.add(new Person("Rohit" , new MyDate(14, 04, 2018)));
		list.add(new Person("Amol" , new MyDate(05, 05, 2019)));
		
		Collections.sort(list);
		
		for(Person p : list)
		{
			System.out.println(p.getName()+" "+p.getDOB());
		}
	}
	
}

class DOBComparator implements Comparator<Person>
{

	@Override
	public int compare(Person o1, Person o2)
	{
		return o1.getDOB().compareTo(o2.getDOB());
	}
	
}
