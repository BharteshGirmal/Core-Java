
package study.HW;

public class Address 
{
	private String City;
	private String Area;
	private String State;
	private String Country;
	private int Pin_Code;
	
	public Address()
	{
		this.Area=null;
		this.City=null;
		this.State=null;
		this.Country=null;
		this.Pin_Code=0;
	}
	
	public Address(String Area,String City,String State,String Country,int Pin_Code)
	{
		this.Area=Area;
		this.City=City;
		this.State=State;
		this.Country=Country;
		this.Pin_Code=Pin_Code;
	}

	public String getCity() 
	{
		return City;
	}

	public void setCity(String city) 
	{
		City = city;
	}

	public String getArea() 
	{
		return Area;
	}

	public void setArea(String area) 
	{
		Area = area;
	}

	public String getState() 
	{
		return State;
	}

	public void setState(String state) 
	{
		State = state;
	}

	public String getCountry() 
	{
		return Country;
	}

	public void setCountry(String country) 
	{
		Country = country;
	}

	public int getPin_Code() 
	{
		return Pin_Code;
	}

	public void setPin_Code(int pin_Code) 
	{
		Pin_Code = pin_Code;
	}
	
	public String toString()
	{
		String str="Area : "+this.Area+"\nCity : "+this.City+"\nState : "+this.State+"\nCountry : "+this.Country;
		return str;
	}
	
	

}
