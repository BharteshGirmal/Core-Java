package study.string;

public class Example 
{

	public static void main(String[] args) 
	{
		String S1= "Hello";
		String S2= "Hello";
		//String S2= new String("Hello");
		
		if(S1 == S2)
			System.out.println("Both S1 and S2 point to same Object");
		else
			System.out.println("Both S1 and S2 point to Diffrent Object");
		
		String S3= S1.concat(S2);
		System.out.println("After Concatination S3 : "+S3);

	}

}
