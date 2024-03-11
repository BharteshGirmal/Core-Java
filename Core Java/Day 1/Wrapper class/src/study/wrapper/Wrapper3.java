package study.wrapper;

import java.util.Scanner;

public class Wrapper3 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Overseas");
		String s= sc.next();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch)) //is Uppercase
				System.out.print(ch);
		}
	}
}
