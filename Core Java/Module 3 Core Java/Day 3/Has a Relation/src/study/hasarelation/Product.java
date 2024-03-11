package study.hasarelation;

public class Product 
{
	private String ProductName;
	private double Cost;
	private MyDate Expiry;
	
	public Product() {}
	
	public Product(String ProductName , double Cost , MyDate Expiry) 
	{
		this.ProductName=ProductName;
		this.Cost=Cost;
		this.Expiry=Expiry;
	}
	
	public String toString()
	{
		String str="Product Name = "+this.ProductName+" Cost = "+this.Cost+" Expiry Date"+this.Expiry;
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

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) 
	{
		Cost = cost;
	}

	public MyDate getExpiry()
	{
		return Expiry;
	}

	public void setExpiry(MyDate expiry) 
	{
		Expiry = expiry;
	}
	
}
