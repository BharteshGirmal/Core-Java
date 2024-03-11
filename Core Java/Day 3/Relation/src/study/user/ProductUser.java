package study.user;

import java.util.Scanner;

import study.hasarelation.MyDate;

public class ProductUser 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Product[] array = new Product[10];
		array[0]=new Product("Java","Programming",500,new MyDate(22,05,2022));
		array[1]=new Product("C Programming","Programming",600,new MyDate(23,05,2022));
		array[2]=new Product("Core Java","Programming",700,new MyDate(24,05,2022));
		array[3]=new Product("Advanced Java","Programming",800,new MyDate(25,05,2022));
		array[4]=new Product("Microsoft DotNet","Programming",900,new MyDate(26,05,2022));
		array[5]=new Product("Database Technolgoies","Programming",1000,new MyDate(27,05,2022));
		array[6]=new Product("MySQL Server","Programming",1100,new MyDate(28,05,2022));
		array[7]=new Product("Java-Script","Programming",1220,new MyDate(29,05,2022));
		array[8]=new Product("C++","Programming",2500,new MyDate(30,05,2022));
		array[9]=new Product("Angular","Programming",5500,new MyDate(31,05,2022));

		int choice;
		do
		{
			System.out.println("\nSelect the Following Option"
					+ "\n1.Modify a Product"
					+ "\n2.Show All Products"
					+ "\n3.Show Names of All Products"
					+ "\n4.Show Total Cost of All Products"
					+ "\n5.Remove A Product"
					+ "\n6.Quit"
					+ "\nEnter Your Choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the index number of Product to Modify");
				int i=sc.nextInt();
				int ch;
					System.out.println("Select the follwig=ng option Which you want to change"
							+ "\n1.Product Name"
							+ "\n2.Product Decrption"
							+ "\n3.Product Expiry Date"
							+ "\n4.Exit");
					ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						System.out.println("Enter Product Name");
						sc.nextLine();
						String n=sc.nextLine();
						array[i].setProductName(n);
						break;
					case 2:
						System.out.println("Enter the Description");
						sc.nextLine();
						String d=sc.nextLine();
						array[i].setDescription(d);
						break;
					case 3:
						System.out.println("Enter the Expiry Date");
						System.out.println("Enter Day");
						int dd=sc.nextInt();
						System.out.println("Enter Month");
						int mm = sc.nextInt();
						System.out.println("Enter Year");
						int yy=sc.nextInt();
						array[i].getExpiry().setDay(dd);
						array[i].getExpiry().setMonth(mm);
						array[i].getExpiry().setYear(yy);
						break;
					case 4:
						System.exit(0);
					default :
						System.out.println("Invalid Choice");
						break;
					}
				
				break;
			case 2:
				PrintProduct(array);
				break;
			case 3:
				PrintNames(array);
				break;
			case 4:
				CalTotalCost(array);
				break;
			case 5:
				System.out.println("Enter the index of product to Remove");
				int n=sc.nextInt();
				array[n].setProductName(null);
				array[n].setDescription(null);
				array[n].setCost(0);
				array[n].getExpiry().setDay(0);
				array[n].getExpiry().setMonth(0);
				array[n].getExpiry().setYear(0);
				break;
			case 6:
				System.exit(0);
				break;
			default :
				System.out.println("InValid Choice");
				break;
			}

		}while(choice != 6);
		
		sc.close();

	} // end of main
	
	public static void PrintProduct (Product []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static void PrintNames (Product []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getProductName());
		}
		System.out.println();
	}
	
	public static void CalTotalCost (Product []arr)
	{
		float sum=0.0f;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i].getCost();
		}
		System.out.println("TotalCost : "+sum);
	}
	
}
