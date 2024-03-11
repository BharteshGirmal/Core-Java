package IOExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderEx 
{
	public static void main(String[] args) throws IOException {
		
		FileReader file= new FileReader("E:\\C-DAC\\Core Java Module 3\\Day 12\\textread.txt");
		BufferedReader reader = new BufferedReader(file);
		while(true)
		{
			String data= reader.readLine();
			if(data == null) break;
			System.out.println(data);
		}
	}
}
