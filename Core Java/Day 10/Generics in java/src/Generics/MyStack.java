package Generics;
public class MyStack 
{
	Object[] arr;
	private int top=-1;
	
	public MyStack(Object[] a)
	{
		arr=a;
	}
	
	public void Push(Object x)
	{
		top++;
		arr[top]=x;
	}
	
	public Object Pop()
	{
		return arr[top--];
	}
	
	public void Show()
	{
		for(Object obj:arr)
			System.out.println(obj+"  ,");
	}

}
