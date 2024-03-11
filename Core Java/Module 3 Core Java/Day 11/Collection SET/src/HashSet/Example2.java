package HashSet;

import java.util.Comparator;
import java.util.HashSet;

public class Example2 
{
	public static void main(String[] args) 
	{
		HashSet<Dummy> HS= new HashSet<Dummy>();
		HS.add(new Dummy(541,"Java"));
		HS.add(new Dummy(456,"Advanced Java"));
		HS.add(new Dummy(154,"Data Structure"));
		HS.add(new Dummy(541,"Java"));
		HS.add(new Dummy(664,"DataBase"));
		
		for(Dummy d : HS)
		{
			System.out.println(d+"\n");
		}
	}
}
class Dummy implements Comparable<Dummy>
{
	private int ID;
	private String Name;
	public Dummy()
	{
		ID=0;
		Name=null;
	}
	public int getID() {
		return ID;
	}
	public Dummy(int id , String name)
	{
		ID=id;
		Name=name;
	}
	
	@Override
	public String toString()
	{
		String str="ID : "+this.ID+"\nName : "+this.Name;
		return str;
	}

	@Override
	public int compareTo(Dummy o)
	{
		return this.Name.compareTo(o.Name);
	}
	
	@Override
	public int hashCode() 
	{
		String str=ID+Name;// Hashing into unique code
		return str.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		Dummy D= (Dummy)obj;
		if(D.ID == this.ID && D.Name.equals(this.Name))
		return true;
		else
			return false;
	}
}

class IDordering implements Comparator<Dummy>
{
	@Override
	public int compare(Dummy o1, Dummy o2) 
	{
		if(o1.getID() > o2.getID())return 1;
		if(o1.getID() < o2.getID())return -1;
		else
			return 0;
	}
	
}