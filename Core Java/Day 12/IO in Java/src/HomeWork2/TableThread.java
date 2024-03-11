package HomeWork2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TableThread extends Thread 
{
	@Override
	public void run()
	{
		FileOutputStream file=null;
		try {
		file = new FileOutputStream("E:\\C-DAC\\Core Java Module 3\\Day 12\\IO in Java\\src\\HomeWork2\\tables.txt",true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter PW=new PrintWriter(file);
		
		for(int i=2;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				PW.println(i+"*"+j+"= "+(i*j));
				//writing in a table.txt file
			}
			PW.println("_______________________________________");
			System.out.println("Table of "+i+" is Done");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		PW.flush();
		PW.close();
	}
}
