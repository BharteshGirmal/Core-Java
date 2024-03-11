package study.split;

import java.util.Scanner;

import study.hasarelation.MyDate;

public class Date 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dash Seprated Date");
		String date=sc.nextInt();
		String[] dates= date.split("-");
		MyDate date= new MyDate();
		for(String date:dates)
		{
			System.out.println();
		}
	}
	
}
