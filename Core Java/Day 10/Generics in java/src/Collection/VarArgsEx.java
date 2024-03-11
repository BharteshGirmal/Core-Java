package Collection;

public class VarArgsEx
{
	public static void main(String[] args)
	{
		add(10);
		add(10,20,30);
		add(10,20,30,14,15,13,54);
		add(10,20,30,102,74);
		int[] arr= new int[2];
		arr[0]=90;
		arr[1]=100;
		add(arr);
	}
	public static void add(int...a)//Variable Arguments (...)
	{
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			sum= sum+a[i];
		}
		System.out.println("Sum : "+sum);
	}
}
