package Generics.PlaceHolder;
public class MyStack<P>
{
	P[] arr;
	private int top=-1;

	public MyStack(P[] a)
	{
		arr=a;
	}

	public void Push(P x)
	{
		top++;
		arr[top]=x;
	}

	public P Pop()
	{
		return arr[top--];
	}

	public void Show()
	{
		for(P obj:arr)
		{
			System.out.print(obj+"  ,");
		}
		System.out.println();
	}

}
