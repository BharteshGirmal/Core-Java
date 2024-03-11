package ObjOutputStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SaveObject 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		//For Writing
		FileOutputStream file = new FileOutputStream("E:\\C-DAC\\Core Java Module 3\\Day 12\\Data.xyz");
		ObjectOutputStream out= new ObjectOutputStream(file);
		//Object obj= new Object();
		Data obj= new Data();
		obj.value=100;
		obj.des="Century";
		out.writeObject(obj);
		obj= new Data();
		obj.value=200;
		obj.des="Double Century";
		out.writeObject(obj);
		out.flush();
		out.close();

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
	//Exception in thread "main" java.io.NotSerializableException: java.lang.Object
}//end of saveObject

class Data implements Serializable
{
	//transient int value;
	int value;
	String des;
	@Override
	public String toString() 
	{
		return "Value : "+value+"   Description : "+des;
	}
}
