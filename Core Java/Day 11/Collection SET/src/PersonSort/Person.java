package PersonSort;

public class Person implements Comparable<Person> 
{
	String Name;
	MyDate DOB;

	public Person() 
	{
		this.Name=null;
		this.DOB=null;
	}
	public Person(String name, MyDate dOB)
	{
		super();
		Name = name;
		DOB = dOB;
	}

	@Override
	public String toString() 
	{
		String str="Person Name "+this.Name+"Date of Birth : "+this.DOB;
		return str;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public MyDate getDOB() {
		return DOB;
	}

	public void setDOB(MyDate dOB) {
		DOB = dOB;
	}


	@Override
	public int compareTo(Person o) 
	{
		// TODO Auto-generated method stub
		return 0;
	}


}
