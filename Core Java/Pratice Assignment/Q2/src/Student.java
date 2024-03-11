/*Q2.Write a Student class with following attributes.
String studentName,double Percentage,int rollNo,String address
1.Write No-args constructor
2.Constructor with studentName and percentage.
3.Constructor with studentName,double Percentage,int rollNo,String all attributes.
4.Write toString()
5.Other method on your own if needed.
Write a Menu driven program to demonstrate following options using ArrayList of Students.
1.Add Student to list.
2.Remove Student from List
3.Show all Students.
4.Show all students on the basis of percentage.
5.Find a student with student name.
6.save all students details into file.
7.Quit.*/

public class Student implements Comparable<Student>
{
	private String Name;
	private double Percentage;
	private int RollNo;
	private String Address;
	
	public Student() {}
	
	public Student(String name, double percentage, int rollNo, String address) 
	{
		super();
		Name = name;
		Percentage = percentage;
		RollNo = rollNo;
		Address = address;
	}
	
	@Override
	public String toString() 
	{
		String str="Student Name : "+this.Name+"\nPercentage : "+this.Percentage
				+"\nRoll Number : "+this.RollNo+"\nAddrerss : "+this.Address;
		str+="_____________________________________________";
		return str;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPercentage() {
		return Percentage;
	}
	public void setPercentage(double percentage) {
		Percentage = percentage;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public int compareTo(Student o)
	{
		if(this.Percentage > o.Percentage) return 1;
		if(this.Percentage < o.Percentage) return -1;
		else
			return 0;
	} 
}//end of class
