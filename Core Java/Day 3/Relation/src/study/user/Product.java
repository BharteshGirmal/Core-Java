package study.user;

import study.hasarelation.MyDate;

public class Product 
{
	private String ProductName;
	private String Description;
	private float Cost;
	private MyDate Expiry;
	
	public Product() {}
	
	public Product(String ProductName , String Description,float Cost , MyDate Expiry) 
	{
		this.ProductName=ProductName;
		this.Description=Description;
		this.Cost=Cost;
		this.Expiry=Expiry;
	}
	
	public String toString()
	{
		String str="Product Name = "+this.ProductName+"\nDescription : "+this.Description+ "\nCost = "
					+this.Cost+"\nExpiry Date"+this.Expiry+"\n";
		return str;
	}

	public String getProductName() 
	{
		return ProductName;
	}

	public void setProductName(String productName) 
	{
		ProductName = productName;
	}

	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) 
	{
		this.Description=Description;
	}

	public MyDate getExpiry()
	{
		return Expiry;
	}

	public void setExpiry(MyDate expiry) 
	{
		Expiry = expiry;
	}
	
	public float getCost() 
	{
		return Cost;
	}

	public void setCost(float cost) 
	{
		Cost = cost;
	}

	
}
