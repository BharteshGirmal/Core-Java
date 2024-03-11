
package study.wrapper;

import java.util.Scanner;

public class PasswardSetting 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		boolean x=false;
		
		// taking the counters
		int Digit=0;
		int uppercase=0;
		int count=1;
		int fg=0;
		
		while(true)
		{
			System.out.println("Enter the Passward ");
			String pass=sc.next();
			
			for(int i=0;i<pass.length();i++)
			{
				// for checking each character 
				char ch = pass.charAt(i);
				if(i==0) // means there is no character in password
				{
					// using character wrapper class to check the letters
					if(Character.isLetter(ch))
					{
						// if found return 
						x=true;
					}
					else
						fg=1;
				}
				
				if(fg == 1)
					break;
				
				if(x)//true or false
				{
					if(Character.isDigit(ch))
					{
						Digit++;
					}
					
					if(Character.isUpperCase(ch))
					{
						uppercase++;
					}
				}
				
			}
			if(Digit >0 && uppercase >0)
			{
				System.out.println("Congrat's Your Password is Strong");
				break;
			}
			else
			{
				System.out.println("Attempt : "+count);
				count++;
				if(count == 4)
					break; // means Maximum 4 Wrong attempts are permitted
				System.out.println("Please Enter a Strong Password"
						+ "\nIt Should contain"
						+ "\n1.At least 1 Digit"
						+ "\n2.At least 1 Uppercase Letter");
			}
		
		}
		
		
	} // end of main
	
} // end of class
