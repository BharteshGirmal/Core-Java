package CollectionsSort;
public class MyDate implements Comparable<MyDate>
{
	private int day;
	private  int month;
	private  int year;
	
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() 
	{
		String str="\nDate : "+day+"/"+month+"/"+year;
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

	@Override
	public int compareTo(MyDate o) 
	{
		if(this.year > o.year) return 1;
		if(this.year < o.year) return -1;
		else
		{
			if(this.month > o.month) return 1;
			if(this.month < o.month) return -1;
			else
			{
				if(this.day > o.day) return 1;
				if(this.day < o.day) return -1;
				else
				{
					return 0;
				}
			}
		}
	}
	

}
