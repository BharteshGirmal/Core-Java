package FoodProducts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import PersonSort.MyDate;

public class Grocery 
{
	public static void main(String[] args)
	{
		ArrayList<FoodProduct> list= new ArrayList<FoodProduct>();
		list.add(new FoodProduct("Coca-Cola","Bevrages",new MyDate(25, 1, 2023),30,"Cold Drink",12.5,20.5,122,13.5));
		list.add(new FoodProduct("Fruti","Bevrages",new MyDate(21, 11,2030),20,"Cold Drink",23,31.2,350,35));
		list.add(new FoodProduct("Samosa","Snak",new MyDate(2, 5, 2021),20,"Snak item",18.2,22.2,150,31));
		list.add(new FoodProduct("CAD-B","Ice-cream",new MyDate(31, 11, 2020),80,"Chocklet",18,25,120,52));
		list.add(new FoodProduct("Tea","Breakfast Drink",new MyDate(12, 5, 2025),10,"Soft Drink",10,13.2,155,21));
		
		Scanner sc= new Scanner(System.in);
		int choice=0;
		do
		{
			System.out.println("***************** Grocery Store *****************"
					+ "\n1.Show All Food Products and Names "
					+ "\n2.Show All Food Products Sorted by default Ordering of Expiry Date"
					+ "\n3.Show Products by Fats"
					+ "\n4.Show Products by Protines"
					+ "\n5.Show Products by Cost"
					+ "\n6.Show Products Having Minimum Fats content"
					+ "\n7.Show Products Having Maximum Protine content"
					+ "\n8.Quit"
					+ "\nEnter Your Choice");
			choice= sc.nextInt();
			switch(choice)
			{
			case 1:
				if(list.isEmpty())
					System.out.println("The List is Empty");
				for(FoodProduct P: list)
				{
					System.out.print(P);
				}
				break;
			case 2:
				System.out.println("Sorting by Expiry Date");
				Collections.sort(list);
				for(FoodProduct P: list)
				{
					System.out.print(P);
				}

				break;
			case 3:
				Collections.sort(list , new SortByFat());
				System.out.println(list);
				break;
			case 4:
				Collections.sort(list, new SortByProtine());
				System.out.println(list);
				break;
			case 5:
				Collections.sort(list,new SortByCost());
				System.out.println(list);
				break;
			case 6:
				FoodProduct min=Collections.min(list);
				System.out.println("The Minimum Food Item is :");
				System.out.println(min);
				break;
			case 7:
				FoodProduct max =Collections.max(list);
				System.out.println("The Max Food Item is :");
				System.out.println(max);
				break;
			case 8:
				break;
			default :
				System.out.println("Invalid Choice");
				break;
			}
		}while(choice !=8);
		
		System.out.println("Program Ended Sucessfully.............................");
		
	}//end of main
	
}// end of class

class SortByFat implements Comparator<FoodProduct>
{

	@Override
	public int compare(FoodProduct o1, FoodProduct o2) 
	{
		if(o1.getFats() > o2.getFats()) return 1;
		if(o1.getFats() < o2.getFats()) return -1;
		else
			return 0;
	}
}

class SortByProtine implements Comparator<FoodProduct>
{

	@Override
	public int compare(FoodProduct o1, FoodProduct o2) 
	{
		if(o1.getProtines() > o2.getProtines() ) return 1;
		if(o1.getProtines() < o2.getProtines() ) return -1;
		else
		return 0;
	}
}

class SortByCost implements Comparator<FoodProduct>
{

	@Override
	public int compare(FoodProduct o1, FoodProduct o2)
	{
		if(o1.getCost() > o2.getCost() ) return 1;
		if(o1.getCost() < o2.getCost() ) return -1;
		else
		return 0;
	}
	
}
