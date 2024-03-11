package IOExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadText 
{
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream file= new FileInputStream("E:\\C-DAC\\Core Java Module 3\\Day 12\\textread.txt");
		Scanner sc= new Scanner(file); // it connects to Keyboard
		while(sc.hasNextLine())//check for next line is available or not
		{
			String data=sc.nextLine();
			System.out.println(data);
		}
		
	}
}
