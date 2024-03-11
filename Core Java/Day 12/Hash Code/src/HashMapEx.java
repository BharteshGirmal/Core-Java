import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx
{
	public static void main(String[] args) 
	{
		// ------------------ Hash Map  ------------------ 
		java.util.HashMap<Integer, String> HM= new java.util.HashMap<Integer,String>();
		//Prints in Bucket order of Hash Table
		HM.put(11, "JAVA");
		HM.put(1, "DS");
		HM.put(5, "CPP");
		HM.put(12, "COP");
		HM.put(15, "DBT");
		HM.put(51, "C++");
		HM.put(11, "CORE-JAVA");// Overiting Earlier Value
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Roll Number");
		System.out.println("The Name is  : "+HM.get(sc.nextInt()));
		
		Set<Integer> set = HM.keySet();
		Iterator<Integer> it= set.iterator();
		while(it.hasNext())
		{
			int key=it.next();
			String value=HM.get(key);
			System.out.println(key+"  ,"+value);
		}
		
	}
}
