

package study.Utility;
import java.util.Random;

public class GetRandomNumber 
{
	public static void main(String[] args) 
	{
		Random random = new Random();
		int num=random.nextInt(125);
		System.out.println("Next Person is : "+num);
				
	}
}
