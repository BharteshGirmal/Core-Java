
public class Employee implements Comparable<Employee>
{
	private int Id;
	private String Name;
	private String Dept;
	private MyDate Doj;
	
	public Employee(int id2, String name, String dept, MyDate doj)
	{
		super();
		Id = id2;
		Name = name;
		Dept = dept;
		Doj = doj;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() 
	{
		String str="\n________________________________________________\n";
		str+="Employee Id : "+this.Id+"\nName : "+this.Name+"\nDepartment : "
				+this.Dept+"\nDate of Joining : "+this.Doj;
		str+="\n________________________________________________\n";
		return str;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public MyDate getDoj() {
		return Doj;
	}
	public void setDoj(MyDate doj) {
		Doj = doj;
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.Doj.compareTo(o.Doj);
	}

}
