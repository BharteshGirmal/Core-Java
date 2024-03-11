package study.basics.maths;

public class Opration 
{
	public static int Calculate(int num1,int num2,char ch)
	{
		switch(ch)
		{
		case '+': return(num1+num2);
		case '-': return(num1-num2);
		case '*': return(num1*num2);
		case '/': return(num1/num2);
		case 0 :
			break;
		default :
			System.out.println("Enter the valid choice");
			break;
		}
		return 0;
	}

}
