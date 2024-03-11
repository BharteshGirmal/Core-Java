package testinheritance;

public class Test3 
{
	public static void main(String[] args) 
	{
		Test(new Alpha());
		Test(new Beta());
		Test(new Theta());
		Test(new Gama());
		Test(new Delta());
	}
	
	public static void Test(Alpha obj)
	{
		obj.FA();
	}
	public static void Test(Beta obj)
	{
		obj.FA();
		obj.FB();
	}
	public static void Test(Theta obj)
	{
		obj.FA();
		obj.FB();
		obj.FC();
	}
	public static void Test (Gama obj)
	{
		obj.FA();
		obj.FB();
		obj.FC();
		obj.FD();
	}
	public static void Test(Delta obj)
	{
		obj.F5();
	}
}

class Alpha
{
	public Alpha() 
	{
		System.out.println("Alpha");
	}
	void Show()
	{
		System.out.println("Alpha");
	}
	void FA()
	{
		System.out.println("FA of Alpha");
	}
	void F1()
	{
		System.out.println("F1 of Alpha");
	}
}

class Beta extends Alpha
{
	public Beta() 
	{
		System.out.println("Beta");
	}
	void Show()
	{
		System.out.println("Beta");
	}
	void FB()
	{
		System.out.println("FB of Beta");
	}
	void F2()
	{
		System.out.println("F2 of Beta");
	}
}

class Theta extends Beta 
{
	public Theta() 
	{
		System.out.println("Theta");
	}
	void Show()
	{
		System.out.println("Theta");
	}
	void FC()
	{
		System.out.println("FC of Theta");
	}
	void F3()
	{
		System.out.println("F3 of Theta");
	}
}

class Gama extends Theta 
{
	public Gama() 
	{
		System.out.println("Gama");
	}
	void Show()
	{
		System.out.println("Gama");
	}
	void FD()
	{
		System.out.println("FD of Gama");
	}
	void F4()
	{
		System.out.println("F4 of Gama");
	}
}

class Delta  
{
	public Delta() 
	{
		System.out.println("Delta");
	}
	void Show()
	{
		System.out.println("Delta");
	}
	void F5()
	{
		System.out.println("F5 of Delta");
	}
}
