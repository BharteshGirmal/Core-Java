package IsARelationship.patient;

import IsARelationship.Person;
public class Patient extends Person
{
	private String BloodGroup;
	private String BloodPressure;
	private String Heartrate;
	
	public Patient() 
	{
		this.BloodGroup=null;
		this.BloodPressure=null;
		this.Heartrate=null;
	}
	
	public Patient( String PatientName,String bloodGroup, String bloodPressure, String heartrate) 
	{
		super(PatientName); // here super class is a person
		BloodGroup = bloodGroup;
		BloodPressure = bloodPressure;
		Heartrate = heartrate;
	}
	
	public String toString()
	{
		String str="Patient Name : "+super.toString()+"\nBlood Group : "+this.BloodGroup+"\nBlood Pressure : "+this.BloodPressure
				+"\nHeart rate : "+this.Heartrate;
		str+="\n_________________________";
		return str;
	}
	
	public String getBloodGroup() 
	{
		return BloodGroup;
	}
	public void setBloodGroup(String bloodGroup)
{
		BloodGroup = bloodGroup;
	}
	public String getBloodPressure() 
	{
		return BloodPressure;
	}
	public void setBloodPressure(String bloodPressure)
	{
		BloodPressure = bloodPressure;
	}
	public String getHeartrate() 
	{
		return Heartrate;
	}
	public void setHeartrate(String heartrate)
	{
		Heartrate = heartrate;
	}
	
}
