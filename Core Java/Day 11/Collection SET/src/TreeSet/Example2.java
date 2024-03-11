package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Example2 
{
	public static void main(String[] args) 
	{
		TreeSet<Dummy> TS= new TreeSet<Dummy>();
		TS.add(new Dummy(121,"ABC"));
		TS.add(new Dummy(854,"PQR"));
		TS.add(new Dummy(455,"XYZ"));
		TS.add(new Dummy(245,"MNO"));
		TS.add(new Dummy(112,"BNGO"));
		
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
