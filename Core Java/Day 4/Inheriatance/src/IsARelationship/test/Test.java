package IsARelationship.test;

public class Test 
{
	public static void main(String[] args) 
	{
		//A ob= new A();
		//B ob2= new B();
		//C ob3= new C();
		//D ob4= new D();
		//E ob5= new E();
		C obj= new C(100,200,300);
		System.out.println(obj.a+ " "+obj.b+" "+obj.c);
	}

}

class A
{
	int a;
	A()
	{
		System.out.println("A is Created");
	}
	A(int a)
	{
		this.a=a;
	}
}
class B extends A
{
	int b;
	B()
	{
		System.out.println("B is Created");
	}
	B(int a,int b)
	{
		super(a);
		this.b=b;
	}
}
class C extends B
{
	int c;
	C()
	{
		System.out.println("C is Created");
	}
	C(int n1,int n2,int n3)
	{
		super(n2,n3);
		this.c=n1;
	}
}
class D extends C
{
	D()
	{
		System.out.println("D is Created");
	}
}

class E extends B
{
	E()
	{
		System.out.println("E is Created");
	}
}
