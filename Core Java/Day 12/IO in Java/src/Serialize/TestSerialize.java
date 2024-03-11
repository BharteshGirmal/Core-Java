package Serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialize
{
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Sub obj=new Sub();
		obj.x=500;
		obj.y=999;
		obj.D= new Dependency();
		// to save th file
		FileOutputStream file= new FileOutputStream("E:\\C-DAC\\Core Java Module 3\\Day 12\\Serialize.adda",true);
		ObjectOutputStream Obj= new ObjectOutputStream(file);
		Obj.writeObject(obj); 
		Obj.flush();
		Obj.close();
		file.close(); //closing the file

		// to read the file
		FileInputStream filein= new FileInputStream("E:\\C-DAC\\Core Java Module 3\\Day 12\\Serialize.adda");
		ObjectInputStream Oin=new ObjectInputStream(filein);
		while(true) {
			try {
				Sub obj2=(Sub)Oin.readObject(); //typeCast
				System.out.println("X : "+obj2.x+"\nY : "+obj2.y+"Z : "+obj2.D);
			}catch(Exception e) {
				System.out.println(e);
				break;
			}
		}
		Oin.close();

	}
}

class Test 
{
	transient int x;
}
class Sub extends Test implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Dependency D;
	int y;
}

class Dependency implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int z;
}
