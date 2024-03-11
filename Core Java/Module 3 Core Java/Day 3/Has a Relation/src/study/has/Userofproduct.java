package study.has;

import java.util.Scanner;

import study.hasarelation.MyDate;
import study.hasarelation.Product;

public class Userofproduct 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		p.setProductName("C Programming");
		p.setCost(500);
		p.setExpiry(new MyDate(22,04,2022));
		System.out.println(p);
		
		System.out.println("Enter the Quantity of Product");
		int qty=sc.nextInt();
		Product []array = new Product[qty];
		for(int i=0;i<qty;i++)
		{
			System.out.println("Enter the Product Name");
			String Name=sc.nextLine();
			System.out.println("Enter the Cost of Product");
			double cost=sc.nextDouble();
			System.out.println("Enter the Expiry Date ( DD-MM-YY )");
			System.out.println("Enter day");
			int Day=sc.nextInt();
			System.out.println("Enter Month");
			int Month=sc.nextInt();
			System.out.println("Enter Year");
			int Year=sc.nextInt();
			MyDate date=new MyDate(Day,Month,Year);
			Product PP = new Product(Name,cost,date);
			array[i]=PP;
		}
		// to Print the Specific Part of array
		for(Product P2 :array)
		{
			System.out.println(P2.getProductName()+ "  "+P2.getExpiry());
		}
		
	}

}
