package study.HW;

import java.util.Scanner;

public class User 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Message[] arr= new Message[5];

		arr[0]=new Message("Sender 1","Reciver 1","Hiiii",new Address("Shahupuri","Kolhapur","Maharashtra","India",413701));
		arr[1]=new Message("Sender 2","Reciver 2","Hello",new Address("Yadrav","Ichalkaranji","Maharashtra","India",111111));
		arr[2]=new Message("Sender 3","Reciver 3","Good Morning",new Address("Swarget","Pune","Maharashtra","India",222222));
		arr[3]=new Message("Sender 4","Reciver 4","Good Afternoon",new Address("Ashta","Sangli","Maharashtra","India",333333));
		arr[4]=new Message("Sender 5","Reciver 5","Good Night",new Address("Jaysingpur","Kolhapur","Maharashtra","India",444444));
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		String place;
		System.out.println("Enter City Name");
		place=sc.next();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getReceiverAddress().getCity().equalsIgnoreCase(place))
			{
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}

}
