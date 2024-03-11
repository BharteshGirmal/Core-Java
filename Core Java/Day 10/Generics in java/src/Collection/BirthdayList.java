package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BirthdayList
{
	ArrayList<String> list = new ArrayList<String>();

	public  void AddName(String name)
	{ 
		list.add(name);
		System.out.println("The Guest "+ name +" is Added........");
	}
	public int CountNumberGuest()
	{
		if(list.isEmpty())
		{
			System.out.println("The List is Empty");
		}
		int count=list.size();
		return count;
	}

	public void RemoveAName(String name)
	{
		if(list.isEmpty())
		{
			System.out.println("Their is no Guest in list to Remove ");
		}
		else
			list.remove(name);
		System.out.println("The Guest is Removed");
	}

	public void ClearList()
	{
		if(list.isEmpty())
		{
			System.out.println("The List is Empty");
		}
		else
		list.clear();
		System.out.println("All the Guests are cleared from the list ..........");
	}

	public void ShowGuestList()
	{
		if(list.isEmpty())
		{
			System.out.println("The List is Empty");
		}
		else
		{
			for(String str : list)
			{
				System.out.print(list+"  ,");
			}
			System.out.println();
		}
	}

	public boolean CheckGuestName(String name)
	{
		if(list.isEmpty())
		{
			System.out.println("The List is Empty");
		}
		if(list.contains(name))
		{
			return true;
		}
		else
			return false;
	}

}
