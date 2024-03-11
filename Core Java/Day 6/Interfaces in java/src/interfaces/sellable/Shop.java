
package interfaces.sellable;

public interface Shop 
{
	public static void main(String[] args) 
	{
		Sellable[] arr = new Sellable[5];
		arr[0]= new Toy("Honda",25500,24);
		arr[1]= new Laptop("HP","8 GB","Intel","256 GB","1TB",68000,18);
		arr[2]= new Toy("Activa",24151,15);
		arr[3]= new Ice_Cream("Cone","ButterScotch", 65);
		arr[4]= new Clothes("Shirt", "XL", 1200);
		ShowBill(arr);
	}
	
	public static void ShowBill(Sellable[] purchaes)  
	{
		System.out.println(purchaes[1]);// calling the toString
		double total=0;
		for(Sellable SS:purchaes)
		{
			double SP=SS.GetSellingPrice();
			System.out.println(SS.GetProductInfo()+"\nSelling Price : "+SP+"\nPackaging Method : ");
			
			total+=SP;
		}
		
		
	}

}
