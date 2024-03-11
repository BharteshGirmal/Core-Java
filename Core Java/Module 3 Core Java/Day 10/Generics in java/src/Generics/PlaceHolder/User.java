package Generics.PlaceHolder;
public class User 
{
	public static void main(String[] args) 
	{
		Integer[] arr= new Integer[6];
		MyStack<Integer> stack= new MyStack<Integer>(arr);
		// Integer is a Actual type parameter
		System.out.println("Stack1 : ");
		stack.Push(10);
		stack.Push(30);
		stack.Push(40);
		stack.Push(50);
		add(stack);
		stack.Show();
		
		System.out.println("Stack2 : ");
		MyStack<MyDate> stack2 = new MyStack<>(new MyDate[3]);
		// MyDate is a Actual type parameter
		stack2.Push(new MyDate(25, 05, 2022));
		stack2.Push(new MyDate(26, 05, 2022));
		stack2.Show();
		
		System.out.println("Stack3 : ");
		MyStack<Thread> stack3= new MyStack<Thread>(new Thread[1]);
		// Thread is a Actual type parameter
		stack3.Push(new Thread());
	}
	
	public static void add(MyStack<Integer> st)
	{
		int sum=0;
		
		sum= sum + st.Pop();
		sum= sum + st.Pop();
		sum= sum + st.Pop();
		sum= sum + st.Pop();
		
		System.out.println("Sum : "+sum);
	}

}
