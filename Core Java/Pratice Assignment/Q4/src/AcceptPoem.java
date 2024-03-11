import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class AcceptPoem 
{
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream("E:\\C-DAC\\Core Java Module 3\\Pratice Assignment\\Q4\\Poems.abc",true);
		//ObjectOutputStream obj= new ObjectOutputStream(file);
		PrintWriter pw=new PrintWriter(file);
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the Powm Line Here\n Type \"Quit\" to Exit");
			String line=sc.nextLine();
			if(line.equalsIgnoreCase("quit")) break;
			pw.println(line);
		}
		pw.flush();
		pw.close();
		System.out.println("Exited from File...........");
		sc.close();
	}
}
