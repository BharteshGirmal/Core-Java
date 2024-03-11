
public abstract class Shape 
{
	abstract void area();
}

class Square extends Shape
{
	@Override
	void area()
	{
		System.out.println("Area of Square function is called.........");
	}
}

class Triangle extends Shape
{
	@Override
	void area()
	{
		System.out.println("Area of Triangle function is called.........");
	}
}

class Rectangle extends Shape
{
	@Override
	void area()
	{
		System.out.println("Area of Rectangle function is called.........");
	}
}