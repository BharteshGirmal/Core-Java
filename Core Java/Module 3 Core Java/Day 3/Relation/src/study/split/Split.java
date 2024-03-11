
package study.split;

import java.util.Scanner;

public class Split 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Coma Seprated Authors ");
		
		String str=sc.nextLine();
		
		String[] Authors=str.split(",");
			
		for(String authors:Authors)
		System.out.println(authors);
		
	}
}
