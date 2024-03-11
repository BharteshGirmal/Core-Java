import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TestNIO 
{
	public static void main(String[] args) throws IOException {
		Path p=Paths.get("E:\\C-DAC\\Core Java Module 3\\Day 12\\textread.txt");
		String s1="-------------------";
		Files.write(p, s1.getBytes(), StandardOpenOption.APPEND);
		List<String> lines= Files.readAllLines(p);
		for(String s:lines)
		{
			System.out.println(s);
		}
	}
}
