package interfaces;

public interface I1
{
	void F1();

}
//interface I2 implements I1 ==> implmented mthos cannot be inherited 

interface I2
{
	void F1();
	void F2();
}

interface I3 extends I2
{
	void F3();
	void F4();
}

interface I5
{
	void F5();
	default void F6()
	{
		System.out.println("Default Method F6 of Interface I5");
	}
}

interface I6
{
	default void F6()
	{
		System.out.println("Default Method F6 of Interface I6");
	}
}


class Dummy implements I1 ,I6
{

	@Override
	public void F1() {
		// TODO Auto-generated method stub
		
	}
	// Default method of I6 is called Implicitly
}

class Dummy2 implements I5 , I6
{

	@Override
	public void F5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void F6() {
		// TODO Auto-generated method stub
		I5.super.F6();
	}
	
}







