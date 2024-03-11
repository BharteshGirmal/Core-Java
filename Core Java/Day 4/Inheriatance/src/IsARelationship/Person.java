package IsARelationship;
public class Person 
{
	private String Name;
	private MyDate DOJ;
	
	public Person()
	{
		System.out.println("Person is Created");
	}
	
	public Person(String name, MyDate dOJ)
	{
		super();
		Name = name;
		DOJ = dOJ;
	}
	
	public Person(String patientName) 
	{
		this.Name=patientName;
	}
	
	@Override
	public String toString() 
	{
		String str=this.Name;
		return str;
	}

	public void Show()
	{
		System.out.println(DOJ.getDay()+" "+DOJ.getMonth()+" "+DOJ.getYear());
	}

	public MyDate getDOJ() 
	{
		return DOJ;
	}

	public void setDOJ(MyDate dOJ) 
	{
		DOJ = dOJ;
	}

	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}
	
}
