
public class StringOpration 
{
	public static void LengthOfString(String Name)
	{
		System.out.println("Length of String : "+Name.length());
	}
	
	public static void SubString(String Name)
	{
		System.out.println("SubString : "+Name.substring(2));
		System.out.println("SubString With End Index : "+Name.substring(2));
	}
	
	public static void Pallindrome(String Name)
	{
		StringBuffer str= new StringBuffer(); 
		StringBuffer str1= new StringBuffer(Name);
		int j=0;
		char ch;
		for(int i=Name.length()-1;i>=0;i--)
		{
			j=0;
			str.append(Name.charAt(i)); // Appending Each Character in reverse order
		}
		System.out.println("String : "+str); // Reverse Order
		if(Name.equals(str.toString()))
		{
			System.out.println("String is Pallindrome");
		}
		else
		{
			System.out.println("String is not Pallindrome");
		}
	}
	
	public static void CountString(String Name)
	{
		char ch;
		int DigitCount=0;
		int VowelCount=0;
		int WhiteSpace=0;
		StringBuffer str= new StringBuffer(Name); // Taking in a String Buffer
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(Character.isWhitespace(ch))
			{
				WhiteSpace++;
			}
			if(ch>=48 && ch<=57)
			{
				DigitCount++;
			}
			if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U')
			{
				VowelCount++;
			}
			System.out.println("White Spaces in String : "+WhiteSpace);
			System.out.println("Number of Digit Count : "+DigitCount);
			System.out.println("Number of Vowel Count : "+VowelCount);
		}
	}

}
