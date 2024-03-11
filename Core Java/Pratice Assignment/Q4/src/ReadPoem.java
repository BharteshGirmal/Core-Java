import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ReadPoem 
{
	public static void main(String[] args) throws IOException {

		ArrayList<String> list= new ArrayList<String>();

		FileInputStream file=new FileInputStream("E:\\C-DAC\\Core Java Module 3\\Pratice Assignment\\Q4\\Poems.abc");
		Scanner sc= new Scanner(file);
		while(sc.hasNext())
		{
			String data=sc.nextLine();
			System.out.println(data);
			//list.add(data);
		}
		 Iterator<String> it=list.iterator();
		 while(it.hasNext())
		 {
			 String data=it.next();
			 list.add(data);
			 if(data== null) break;
			 System.out.println(data);
		 }
		 sc.close();
	}

}
