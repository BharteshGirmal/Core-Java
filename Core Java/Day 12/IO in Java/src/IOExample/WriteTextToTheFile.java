package IOExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTextToTheFile
{
	public static void main(String[] args) throws FileNotFoundException // checked Exception 
	{

		//file is Opening in Overwrite Mode
		//FileOutputStream fileout= new FileOutputStream("E:\\C-DAC\\Core Java Module 3\\Day 12\\textread.txt");
		// this will open the file in append mode 
		boolean append=true;
		FileOutputStream fileout= new FileOutputStream("E:\\C-DAC\\Core Java Module 3\\Day 12\\textread.txt",append);
		PrintWriter p= new PrintWriter(fileout);

		Scanner sc= new Scanner(System.in);
		/*System.out.println("Enter the String to Add in the file ");
		String input=sc.nextLine();
		p.println(input);
		p.flush();
		p.close();*/
		while(true)
		{
			System.out.println("Enter the String to Add in the file ");
			String input=sc.nextLine();
			if(input.equalsIgnoreCase("Quit")) break;
			p.println(input);
			p.flush();
			p.close();
		}

	}

}
