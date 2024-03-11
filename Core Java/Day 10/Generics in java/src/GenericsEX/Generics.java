package GenericsEX;
public class Generics 
{
	public static void main(String[] args) 
	{
		Object[] arr= new Object[5];
		arr[0]=40; //int---> Auto boxing Integer is a Object
		arr[4]= "Hello";//String is a Object
		arr[3]=90;
		arr[2]=60;
		arr[1]=50;
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Adding "+arr[i]);
			sum=sum+(Integer)arr[i];
			System.out.println("Sum : "+sum);
			
			//Exception in thread "main" java.lang.ClassCastException: 
			//java.lang.String cannot be cast to java.lang.Integer
		}
	}

}
