package ObjOutputStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		//For reading 
		FileInputStream input=new FileInputStream("E:\\C-DAC\\Core Java Module 3\\Day 12\\Data2.xyz");
		ObjectInputStream obj1 = new ObjectInputStream(input);
		while(true)
		{
			try 
			{
				Object obj2= obj1.readObject();
				System.out.println(obj2);
			} 
			catch(EOFException e) 
			{
				System.out.println("End of File Exception");
				break;
			}
		}
	}
}
