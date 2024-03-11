package study.has;

import java.util.Scanner;

import study.hasarelation.Book;
import study.hasarelation.MyDate;

public class BookUser 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Books");
		int size=sc.nextInt();
		sc.nextLine();
		Book []array = new Book[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Name of Book");
			String name=sc.nextLine();
			System.out.println("Enter the Book Price");
			double price=sc.nextDouble();
			System.out.println("Enter the Dates (DD:MM:YY) ");
			int day=sc.nextInt();
			int month=sc.nextInt();
			int year=sc.nextInt();
			System.out.println("Enter the number of authors");
			int n=sc.nextInt();
			sc.nextLine();
			String arr[]=new String[n];
			for(int x=0;x<n;x++)
			{
				System.out.println("Enter the name of Authors of Book ");
				arr[x]=sc.nextLine();
			}
			sc.nextLine();
			
			//MyDate date= new MyDate(day , month ,year);
			
			Book BB= new Book(name,price,new MyDate(day,month,year),arr);	
			array[i]=BB;
			sc.nextLine();
		}

		for(Book B2 :array) //for Each Book B1 in B2
		{
			System.out.println(B2.getBookName()+"  "+B2.getPrice()+"    "+B2.getDateofPublication().getYear());
			
			for(String brr :B2.getAuthors()) // For Each Author in String array brr
			{
				System.out.print( B2.getAuthors()+"  ");
			}
			System.out.println();
		}

	}

}
