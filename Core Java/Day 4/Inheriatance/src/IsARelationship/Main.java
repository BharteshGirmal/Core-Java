package IsARelationship;
public class Main 
{
	public static void main(String[] args) 
	{
		Employee E1 = new Employee(11,2500,"Core Java");

		//E1.setName("Bhartesh");
		System.out.println(E1.getName()+"  "+E1.getDepartment());
		//E1.setDOJ(new MyDate(25, 04, 2022));
		System.out.println(E1.getDOJ()+"  ");
		E1.Show();
	}
}
