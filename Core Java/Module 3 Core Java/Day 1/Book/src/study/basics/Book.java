package study.basics;

public class Book 
{
	private int Id;
	private String BookName;
	private double price;
	
	public Book() {}
	
	public Book(int Id ,String BookName,double price) 
	{
		this.Id=Id;
		this.BookName=BookName;
		this.price=price;
	}
	
	public int getId() 
	{
		return Id;
	}

	public void setId(int id) 
	{
		this.Id = id;
	}

	public String getBookName() 
	{
		return BookName;
	}

	public void setBookName(String bookName) 
	{
		BookName = bookName;
	}

	public float getPrice() 
	{
		return price;
	}

	public void setPrice(double d) 
	{
		this.price = d;
	}

	public String toString()
	{
		String str="BookId : "+this.Id+"   , Book Name : "+this.BookName+"  ,Price : "+this.price;
		return str;
	}

}
