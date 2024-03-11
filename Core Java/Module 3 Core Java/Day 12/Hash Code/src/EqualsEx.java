
public class EqualsEx
{
	public static void main(String[] args)
	{
		Dummy obj1 = new Dummy("Java", 12);
		//Dummy obj2 = obj1;
		Dummy obj2= new Dummy("Java", 12);
		// voileting the equals and hash code contract
		System.out.println("Equals : "+obj1.equals(obj2));
		System.out.println("Object 1 : "+obj1.hashCode());
		System.out.println("Object 2 : "+obj2.hashCode());
	}
}

class Dummy
{
	private String Name;
	private int RollNo;
	
	@Override
	public int hashCode() 
	{
		return this.RollNo; // unique Number
	}//avoid the voilating the contract
	
	
	@Override
	public boolean equals(Object obj) 
	{
		Dummy str= (Dummy)obj;
		if(str.Name.equals(this.Name) && str.RollNo==this.RollNo)
			return true;
		else
			return false;
	}
	
	public Dummy(String name, int rollNo) 
	{
		super();
		Name = name;
		RollNo = rollNo;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	
	
}