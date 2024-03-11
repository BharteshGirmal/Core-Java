package inheritance;
public class test 
{
	public static void main(String[] args) 
	{
		Alpha obj=new Alpha();
		Alpha obj2=new Beta();
		obj2.doJob1();
		obj2.FA();
		obj2.F1();
		
		
	}
}

class Alpha
{
	void FA()
	{
		System.out.println("FA of Alpha");
	}
	void F1()
	{
		System.out.println("F1 of Alpha");
	}
	public void doJob1()
	{
		System.out.println("DO Job 1");
	}
}
class Beta extends Alpha
{
	void FB()
	{
		System.out.println("FB of Beta");
	}
	void F1()
	{
		System.out.println("F1 of Beta");
	}
	public void doJob2()
	{
		System.out.println("DO Job 2");
	}
}

class Theta extends Beta
{
	void FC()
	{
		System.out.println("FC of Theta");
	}
	void F1()
	{
		System.out.println("F1 of Theta");
	}
	public void doJob3()
	{
		System.out.println("DO Job 3");
	}
}

class Gama extends Theta
{
	void FD()
	{
		System.out.println("FD of Gama");
	}
	public void doJob4()
	{
		System.out.println("DO Job 4");
	}
}
class Delta
{
	public void doJob5()
	{
		System.out.println("DO Job 5");
	}
}
