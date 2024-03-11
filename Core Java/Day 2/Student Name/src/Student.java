
public class Student 
{
	private String FirstName , LastName , GraduationStream;
	private int year ,age;
	
	public Student() 
	{
		this.FirstName="FirstName";
		this.LastName="LastName";
		this.GraduationStream="GraduationStream";
		this.age=0;
		this.year=0;
	}
	
	public Student(String FirstName , String LastName , String GraduationStream, int year , int age) 
	{
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.GraduationStream=GraduationStream;
		this.age=age;
		this.year=year;
	}
	
	public String getFirstName() 
	{
		return FirstName;
	}

	public void setFirstName(String firstName) 
	{
		FirstName = firstName;
	}

	public String getLastName() 
	{
		return LastName;
	}

	public void setLastName(String lastName) 
	{
		LastName = lastName;
	}

	public String getGraduationStream() 
	{
		return GraduationStream;
	}

	public void setGraduationStream(String Stream) 
	{
		String S1 = "COMPUTER";
		String S2 = "IT";
		String S3 = "Electrical";
		String S4 = "Mech";
		String S5 = "Civil";
		String S6 = "Chemical";
		String S7 = "Auto";
		
		if(Stream.equalsIgnoreCase(S1)||Stream.equalsIgnoreCase(S2)||Stream.equalsIgnoreCase(S3)
				||Stream.equalsIgnoreCase(S4)||Stream.equalsIgnoreCase(S5)||Stream.equalsIgnoreCase(S6)
				||Stream.equalsIgnoreCase(S7))
		{
			this.GraduationStream=Stream;
		}
		else
		{
			System.out.println("Invalid Stream");
			this.GraduationStream="Mechanical";
		}
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		if(year <2018 || year <2022)
		{
			System.out.println("Graduation year must be in 2018-2022");
			this.year = 2022;
		}
		else
		{
			this.year = 2018;
		}
		this.year = year;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		if(age <18 || age >80)
		{
			System.out.println("Enter Proper Age Between 18-80 ");
			this.age=18;
		}
		else
		{
			this.age=age;
		}
	}
	
	public String toString()
	{
		String str="First Name : "+this.FirstName+" Last Name : "+this.LastName+
				"\n Graduation Stream : "+this.GraduationStream+"\nAge : : "+this.age+"\n Year of Graduation : "+this.year;
		return str;
	}
	
	

}
