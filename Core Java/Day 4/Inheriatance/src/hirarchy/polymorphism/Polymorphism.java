
package hirarchy.polymorphism;

public class Polymorphism 
{
	public static void main(String[] args) 
	{
		Alpha A= new Alpha(); // only FA
		Beta B= new Beta(); // FA and FB
		theta T= new theta(); // FA FB FC
		Gama G= new Gama(); // FA FB FC FD
		Delta D= new Delta();
		D.FA();
		D.FB();
		
	}//end of main
	
}//end of function
class Alpha
{
	Alpha()
	{
		System.out.println("Inside Alpha");
	}
	
	public void FA()
	{
		System.out.println("Alpha");
	}
}
class Beta extends Alpha
{
	Beta()
	{
		System.out.println("Inside Beta");
	}
	public void FB()
	{
		System.out.println("Beta");
	}
}
class theta extends Beta
{
	theta()
	{
		System.out.println("Inside theta");
	}
	public void FC()
	{
		System.out.println("Theta");
	}
}
class Gama extends theta
{
	Gama()
	{
		System.out.println("Inside Gama");
	}
	public void FD()
	{
		System.out.println("Gama");
	}
}
class Delta extends Beta
{
	Delta()
	{
		System.out.println("Inside Delta");
	}
}

