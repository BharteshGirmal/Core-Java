package HomeWork3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Names 
{
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream file = new FileInputStream("E:\\C-DAC\\Core Java Module 3\\Day 12\\IO in Java\\src\\HomeWork3\\ListofNames.txt");
		Scanner filesc= new Scanner(file);
		
		Scanner sc= new Scanner(System.in); //connects to keyboard
		ArrayList<String> list = new ArrayList<String>();
		while(filesc.hasNextLine()) // reads upto the next line
		{
			list.add(sc.nextLine());
		}
		do
		{
			System.out.println("\n1.Show all Names in the file"
					+ "\n2.Show Number of Names in the file"
					+ "\n3.Show Names in sorted order with index"
					+ "4.Remove from file entry if user enters index"
					+ "\n0.Quit"
					+ "\nEnter Your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				for(int i=0;i<list.size();i++)
				{
					System.out.println(list.get(i)+"  ,");
				}
				break;
			case 2:
				System.out.println("There are "+list.size()+" Names in the file");
				break;
			case 3:
				Collections.sort(list);
				for(int i=0;i<list.size();i++)
				{
					System.out.println((i+1)+". "+list.get(i));
				}
				break;
			case 4:
				System.out.println("Enter number of name to remove");
				for(int i=0;i<list.size();i++)
				{
					System.out.println((i+1)+". "+list.get(i));
				}
				int flag=sc.nextInt();
				list.remove(flag-1);
				UpdateList(list);
				break;
			default :
				System.out.println("Invald Choice");
				break;
			}
		}while(true);
		
	}

	private static void UpdateList(ArrayList<String> list) throws FileNotFoundException 
	{
		FileOutputStream file= new FileOutputStream("E:\\C-DAC\\Core Java Module 3\\Day 12\\IO in Java\\src\\HomeWork3\\ListofNames.txt",false);
		PrintWriter PW= new PrintWriter(file);
		Iterator<String> it= list.iterator();
		while(it.hasNext())
		{
			PW.println(it.next());
		}
		PW.flush();
		PW.close();
	}
}
