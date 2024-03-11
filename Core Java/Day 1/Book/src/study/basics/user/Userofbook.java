package study.basics.user;

import study.basics.Book;

public class Userofbook 
{
	public static void main(String[] args) 
	{
		Book B1 = new Book();
		B1.setId(111);
		B1.setBookName("Core Java");
		B1.setPrice(555.33);
		System.out.println(B1);
		
		
	}

}
