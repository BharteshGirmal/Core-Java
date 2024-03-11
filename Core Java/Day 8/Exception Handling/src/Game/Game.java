package Game;

import java.util.Random;

public class Game 
{
	int HiddenNO;
	int Attempts;
	
	public Game(Random R)
	{
		this.HiddenNO= R.nextInt(10); // taking any random number
		this.Attempts=5; // Maxmum % Attempts are Allowed
	}

	public int getHiddenNO() 
	{
		return HiddenNO;
	}

	public void setHiddenNO(Random number) 
	{
		HiddenNO = number.nextInt();
	}

	public int getAttempts() 
	{
		return Attempts;
	}

	public void setAttempts(int attempts)
	{
		Attempts = attempts;
	}
	
	public int If_Matching(int num)
	{
		if(HiddenNO > num)
			return 1; // true
		if(HiddenNO < num)
			return -1; // true
		else
		return 0;
	}

}
