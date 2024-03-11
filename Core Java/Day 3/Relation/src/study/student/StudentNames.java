package study.student;

public class StudentNames 
{
	private String Names[];
	StringBuffer temp;

	public StudentNames(String Name) 
	{
		this.Names=Name.split(" "); // Space Sperated
		temp=new StringBuffer(Name);
	}

	public void AddName(String Name)
	{
		temp=new StringBuffer(temp.append(Name)); // this will add previous and current string with space
		System.out.println("\nTemp: \n"+temp);
		this.Names=temp.toString().split(" ");
	}

	public String GetNameOnIndex(int index)
	{
		int i=0;
		String str=null;
		for(String sr:Names)
		{
			if(i == index)
			{
				System.out.println("Get Name : "+sr);
				return sr;
			}
			i++;
		}
		return str; // null
	}

	public void ShowAllNames()
	{
		for(String temp:Names)
		{
			System.out.println("Names : "+temp);
		}
		System.out.println("______________________________________________________");

	}

}
