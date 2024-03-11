
package inheritance;

import Equals.Equals;

public class Book 
{
	private static final String MyDate = null;
	private String BookName;
	private double price;
	private MyDate DateofPublication;
	private String[] Authors;
	
	public Book()
	{
		
	}
	
	public Book(String BookName , double price , MyDate DateofPublication ,String[]arr)
	{
		this.BookName=BookName;
		this.price=price;
		this.DateofPublication=DateofPublication;
		this.Authors=arr;
	}
	
	public String toString()
	{
		String str1="";
		for(int i=0;i<Authors.length;i++)
		{
			str1=str1+Authors[i];
			str1+="  ,";
		}
		String str="Book Name :  "+this.BookName+"\nPrice : "+this.price+""
				+ "\nDate of Publication : "+this.DateofPublication+"\nAuthors : "+str1;
				return str;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Book)
		{
			Book temp=(Book)obj;
			if(this.BookName.equals(temp.BookName) && this.price==temp.price 
					&&this.DateofPublication.equals(temp.DateofPublication)
				&&CompareAuthors(temp.Authors))
			{
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
	

	private boolean CompareAuthors(String[] authors2) 
	{
		if(this.Authors.length ==authors2.length )
		{
			for(int i=0;i<this.Authors.length;i++)
			{
				if(this.Authors[i].equals(authors2[i]))
					return true;
				else
					return false;
			}
		}
		return false;
	}

	public String getBookName() {
		return BookName;
	}
	
	public boolean EqualsAuthor(String[] arr)
	{
		for(int i=0;i<this.Authors.length;i++)
		{
			if(arr[i].equals(arr))
				return true;
			else
				return false;
		}
			return false;
	}
	

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public MyDate getDateofPublication() {
		return DateofPublication;
	}

	public void setDateofPublication(MyDate dateofPublication) {
		DateofPublication = dateofPublication;
	}

	public String[] getAuthors() {
		return Authors;
	}

	public void setAuthors(String[] authors) {
		Authors = authors;
	}

}
