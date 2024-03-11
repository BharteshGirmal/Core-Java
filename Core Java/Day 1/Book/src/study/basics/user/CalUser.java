package study.basics.user;
import study.basics.maths.Opration;
import java.util.Scanner;


public class CalUser 
{
	public static void main(String[] args) 
	{.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first Number ");
		int num1=sc.nextInt();
		System.out.println("Enter the second Number ");
		int num2=sc.nextInt();
		System.out.println("Enter the Oprator ( +,-,*,/ ) ");
		char ch=sc.next().charAt(0);
		int res=Calculate(num1,num2,ch);
		System.out.println(num1+" "+ch+" "+num2+" = "+res);
		sc.close();
		
	}

}
