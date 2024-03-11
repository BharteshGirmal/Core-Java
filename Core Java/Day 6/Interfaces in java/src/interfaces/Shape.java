package interfaces;
public abstract class Shape 
{
	abstract double Area();
}

class Circle extends Shape
{
	double radius;
	
	public Circle(double radius) 
	{
		this.radius = radius;
	}

	double AreaOfCircle()
	{
		double Area=3.14*radius*radius;
		return Area;
	}

	@Override
	double Area() {
		// TODO Auto-generated method stub
		return AreaOfCircle();
	}
}

class Rectangle extends Shape
{
	double length;
	double breadth;
	
	public Rectangle(double length, double breadth) 
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}

	double AreaOfRectnagle()
	{
		double Area=length*breadth;
		return Area;
	}

	@Override
	double Area() {
		// TODO Auto-generated method stub
		return AreaOfRectnagle();
	}
}
