package Generics;
public class User 
{
	public static void main(String[] args) 
	{
		Object[] arr= new Object[6];
		MyStack stack= new MyStack(arr);
		stack.Push(10);
		stack.Push(30);
		stack.Push(40);
		stack.Push(50);
		add(stack);
	}
	
	public static void add(MyStack st)
	{
		int sum=0;
		
		sum= sum + (Integer)st.Pop();
		sum= sum + (Integer)st.Pop();
		sum= sum + (Integer)st.Pop();
		sum= sum + (Integer)st.Pop();
		
		System.out.println("Sum : "+sum);
	}

}
