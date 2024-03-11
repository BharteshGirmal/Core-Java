
package study.HW4;

import java.util.Scanner;

public class Author 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Names of Authors Seprated by COMA");
		String str=sc.nextLine();
		String[] ss= str.split(",");
		for(String S :ss)
		{
			System.out.println(S+"");
		}
	}
}
