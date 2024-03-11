package FoodProducts;

import java.util.Comparator;

import PersonSort.MyDate;

public class FoodProduct implements Comparable<FoodProduct>
{
	private String Brand;
	private String Name;
	private MyDate ExpiryDate;
	private double Cost;
	private String Desciption;
	private double fats;
	private double Protines;
	private double Carbohydrates;
	private double claries;
	
	public FoodProduct() {}
	
	public FoodProduct(String brand, String name, MyDate expiryDate, double cost, String desciption, double fats,
			double protines, double carbohydrates, double claries) 
	{
		
		Brand = brand;
		Name = name;
		ExpiryDate = expiryDate;
		Cost = cost;
		Desciption = desciption;
		this.fats = fats;
		Protines = protines;
		Carbohydrates = carbohydrates;
		this.claries = claries;
	}
	
	@Override
	public String toString() 
	{
		String str="Product Name : "+this.Name+"\nBrand : "+this.Brand+"\nExpiry Date : "+this.ExpiryDate+
				"\nCost : "+this.Cost+"\nDescription : "+this.Desciption+"\nFats : "+this.fats+"\nProtines : "+this.Protines+"\nCarbohydrates : "
				+this.Carbohydrates+"\nCalries : "+this.claries;
		str+="\n_______________________________________________\n";
		return str;
	}
	
	@Override
	public int compareTo(FoodProduct o) //comaparing food products by expiry date
	{
			return this.ExpiryDate.compareTo(o.ExpiryDate);
	}
	
	public String getBrand()
	{
		return Brand;
	}
	public void setBrand(String brand)
	{
		Brand = brand;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}
	public double getCost() 
	{
		return Cost;
	}
	public void setCost(double cost) 
	{
		Cost = cost;
	}
	public String getDesciption()
	{
		return Desciption;
	}
	public void setDesciption(String desciption)
	{
		Desciption = desciption;
	}
	public double getFats()
	{
		return fats;
	}
	public void setFats(double fats)
	{
		this.fats = fats;
	}
	public double getProtines() 
	{
		return Protines;
	}
	public void setProtines(double protines) 
	{
		Protines = protines;
	}
	public double getCarbohydrates() 
	{
		return Carbohydrates;
	}
	public void setCarbohydrates(double carbohydrates)
	{
		Carbohydrates = carbohydrates;
	}
	public double getClaries() 
	{
		return claries;
	}
	public void setClaries(double claries)
	{
		this.claries = claries;
	}

	public MyDate getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(MyDate expiryDate) {
		ExpiryDate = expiryDate;
	}
}//end of class











