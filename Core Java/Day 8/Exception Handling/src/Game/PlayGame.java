package Game;

import java.util.Random;
import java.util.Scanner;

public class PlayGame 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Game G =null;
		int Count=0;
		
		while(true)
		{
			if(Count == 0)
				G= new Game(new Random()); // passing random number
			
			System.out.println("Enter Your Number");
			int num=sc.nextInt();
			int number= G.If_Matching(num); // it will returns 1 , -1 , or 0
			Count++; // chances
			
			if(number == -1)
			{
				System.out.println("Wrong input.... !  number must be less than the current number");
			}
			else if(number == 1)
			{
				System.out.println("Wrong input.... !  number must be Greater than the current number");
			}
			else
			{
				System.out.println("___________________ Congratulation you Won the Game ___________________ ");
			}
			
			if(Count == G.getAttempts())
			{
				System.out.println("You Attempted the 5 Chnaces");
				System.out.println("Do You Want to Play Again .....? \n1.yes\n2.no\nPlease Enter Your Choice [ Y/N ] ");
				char ch = sc.next().charAt(0);
				if(ch == 'y' || ch == 'Y')
				{
					Count=0; // chances =0;
					continue;
				}
				else
				{
					System.out.println("**************** Game Over ****************");
					break;
				}
			}			
			
		}
		
		
	}

}
