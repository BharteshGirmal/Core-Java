import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashmap 
{
	HashMap<Integer, String> HM= new HashMap<Integer,String>();
	public hashmap() 
	{
		this.HM=null;
	}
	public hashmap(HashMap<Integer, String> H1)
	{
		this.HM=H1;
	}
	
	public void AddUser(int key , String name)
	{
		HM.put(key, name);
	}
	
	public void Show()
	{
		Set<Integer> set=HM.keySet();
		Iterator<Integer> it=set.iterator();
		while(it.hasNext())
		{
			int key=it.next();
			String str=HM.get(key);
			System.out.println("Roll Number : "+key+"\nName : "+str);
			System.out.println("__________________________________");
		}
	}
}
