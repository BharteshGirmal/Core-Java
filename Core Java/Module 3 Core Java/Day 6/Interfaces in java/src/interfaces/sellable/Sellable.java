package interfaces.sellable;
import java.util.zip.CRC32;

public interface Sellable 
{
	String GetProductInfo(); // by default each method is public abstract
	//or

	public abstract double GetSellingPrice();
}

class Toy implements Sellable , Packable //Multiple Inheritance
{
	private String name;
	private double cost,discount;


	public Toy(String name, double cost, double discount) 
	{
		super();
		this.name = name;
		this.cost = cost;
		this.discount = discount;
	}

	@Override
	public String toString() 
	{
		return super.toString();
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getCost() 
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public double getDiscount()
	{
		return discount;
	}

	public void setDiscount(double discount) 
	{
		this.discount = discount;
	}

	@Override
	public String GetProductInfo() 
	{
		return "\nName : "+name+"\nCost : "+cost;
	}

	@Override
	public double GetSellingPrice() 
	{
		double SP=cost - (discount*cost/100);
		return SP;
	}

	@Override
	public String PackingDetails() 
	{
		return "\nCardBoard Packing";
	}

}

class Laptop implements Sellable , Packable
{
	private String Brand ,RAM ,CPU, SSD ,HDD;
	private double cost,GST;

	public Laptop(String brand, String rAM, String cPU, String sSD, String hDD, double cost, double gST) {
		super();
		Brand = brand;
		RAM = rAM;
		CPU = cPU;
		SSD = sSD;
		HDD = hDD;
		this.cost = cost;
		GST = gST;
	}

	public String getBrand() 
	{
		return Brand;
	}
	public void setBrand(String brand)
	{
		Brand = brand;
	}
	public String getRAM() 
	{
		return RAM;
	}
	public void setRAM(String rAM)
	{
		RAM = rAM;
	}
	public String getCPU() 
	{
		return CPU;
	}
	public void setCPU(String cPU) 
	{
		CPU = cPU;
	}
	public String getSSD()
	{
		return SSD;
	}
	public void setSSD(String sSD)
	{
		SSD = sSD;
	}
	public String getHDD()
	{
		return HDD;
	}
	public void setHDD(String hDD)
	{
		HDD = hDD;
	}
	@Override
	public String GetProductInfo() 
	{
		return "\nBrand Name :"+Brand+"\nRAM : "+RAM+"\nCPU : "
		+CPU+"\nSSD : "+SSD+"\nHDD : "+HDD+"\nCost : "+cost+"\nGST : "+GST;
	}

	@Override
	public double GetSellingPrice() 
	{
		double sp= cost - (GST*cost/100);
		return sp;
	}

	@Override
	public String toString() 
	{
		String str="\nBrand Name : "+Brand+"\nRam : "+RAM+"\nCpu : "
				+CPU+"\nSSD : "+SSD+"\nHDD : "+HDD+"\nCost : "+cost+" "+"\nPacking Method : "+PackingDetails();
		return str;
	}

	@Override
	public String PackingDetails() 
	{
		return "\nCushning used in a Carboard Box for Packing";
	}

}

class Ice_Cream implements Sellable ,Packable
{
	private String type;
	private String Flavour;
	private double cost;
	
	
	
	public Ice_Cream(String type, String flavour, double cost) 
	{
		super();
		this.type = type;
		Flavour = flavour;
		this.cost = cost;
	}
	public String getType() 
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getFlavour() 
	{
		return Flavour;
	}
	public void setFlavour(String flavour)
	{
		Flavour = flavour;
	}
	public double getCost()
	{
		return cost;
	}
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	@Override
	public String PackingDetails()
	{
		return "\nPacked/Wrapped in a Plastic Conatiner";
	}
	@Override
	public String GetProductInfo() 
	{
		return "\nIce-Cream Type : "+type+"\nFlavour : "+Flavour;
	}
	@Override
	public double GetSellingPrice() 
	{
		return cost;
	}
}

class Clothes implements Sellable , Packable
{
	private String cloth;
	private String size;
	private double cost;

	public Clothes(String cloth, String size, double cost) 
	{
		super();
		this.cloth = cloth;
		this.size = size;
		this.cost = cost;
	}

	public String getCloth() 
	{
		return cloth;
	}

	public void setCloth(String cloth)
	{
		this.cloth = cloth;
	}

	public String getSize() 
	{
		return size;
	}

	public void setSize(String size) 
	{
		this.size = size;
	}

	public double getCost() 
	{
		return cost;
	}

	public void setCost(double cost) 
	{
		this.cost = cost;
	}

	@Override
	public String PackingDetails() 
	{
		return "\nPacked in a cloth or Plastic Bag" ;
	}

	@Override
	public String GetProductInfo() 
	{
		return "\nCloth Type : "+cloth+"\nSize : "+size;
	}

	@Override
	public double GetSellingPrice() 
	{
		return cost;
	}
	
}