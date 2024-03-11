package HomeWork3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class NameList
{
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream file=new FileOutputStream("E:\\C-DAC\\Core Java Module 3\\Day 12\\IO in Java\\src\\HomeWork3\\ListofNames",true);
		//appending
		PrintWriter pw= new PrintWriter(file);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the names");
		while(true)
		{
			String str=sc.nextLine();
			if(str.equalsIgnoreCase("Quit")); break;
			
		}
		pw.flush();
		pw.close();
	}
}
