package IsARelationship;
public class MyDate extends Person 
{
	int day;
	int month;
	int year;
	
	public MyDate(int day,int month,int year) 
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public String toString()
	{
		String str= this.day+"/"+this.month+"/"+this.year;
		str+="\n";
		return str;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
