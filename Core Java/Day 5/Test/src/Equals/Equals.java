
package Equals;

import inheritance.Book;
import inheritance.MyDate;

public class Equals 
{
	public static void main(String[] args) 
	{
		MyDate DOJ = new MyDate(25,05,2022);
		///MyDate DOJ2 = DOJ;
		MyDate DOJ2 = new MyDate(25,05,2022);
		if( DOJ.equals(DOJ2)) // its checks only the addresses of object not the content
		{
			System.out.println(DOJ+" and "+DOJ2+" are same");
		}
		else
			System.out.println(DOJ+" and "+DOJ2+" are Not same");
		
		Book B1 = new Book("Core java",254.45,new MyDate(25, 04, 2022),new String [] {"Dennies Richie","KenThompson"});
		Book B2 = new Book("Core java",254.45,new MyDate(25, 04, 2022),new String [] {"Dennies Richie","KenThompson"});
		
		if(B1.equals(B2))
		{
			System.out.println(B1+" \n\n"+B2+"\n____________________________ Are Same ____________________________");
		}
		else
		{
			System.out.println(B1+" \n\n"+B2+"\n____________________________ Not Same ____________________________");
		}
		
	}
	
	
	
}
