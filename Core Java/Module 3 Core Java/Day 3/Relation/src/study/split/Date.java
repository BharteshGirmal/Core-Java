package study.split;

import java.util.Scanner;

import study.hasarelation.MyDate;

public class Date 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dash Seprated Date");
		String date=sc.next();
		String[] dates= date.split("-");
		MyDate DD= new MyDate();
		System.out.println(DD);
	}
	
}
