package Exceptions;
public class Example4
{
	public static void main(String[] args) throws Exception 
	{
		f1();
		//Height(55);
	}
	
	public static void f1() throws Exception 
	{
		//Height(55);
		Height(-1);
	}
	public static void Height(int x) throws Exception
	{
		if(x > 0) System.out.println("Height of Building :" +x);
		else
		{
			Exception e= new Exception();
			throw e;
		}
	}

}
