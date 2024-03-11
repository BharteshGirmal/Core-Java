package HomeWork2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PowerThread extends Thread 
{
	@Override
	public void run() 
	{
		FileOutputStream file=null;

		try {
			file= new FileOutputStream("E:\\C-DAC\\Core Java Module 3\\Day 12\\IO in Java\\src\\HomeWork2\\tables.txt",true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Appending the power 
		PrintWriter PW= new PrintWriter(file);
		do
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number to print its power \n 0 to Quit");
			int num=sc.nextInt();
			if(num == 0) break;
			for(int i=1;i<=10;i++) // printing power of number upto index 10
			{
				double power=Math.pow((double)num, (double)i);
				PW.println(num+"^"+i+"= "+power);
			}
			PW.println("________________________________________");
			System.out.println("Power of "+num+" is Printed");
			
		}while(true);
		PW.flush();
		PW.close();
	}
}
