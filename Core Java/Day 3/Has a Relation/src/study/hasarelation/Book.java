
package study.hasarelation;

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
		String str="Book Name :  "+this.BookName+"\nPrice : "+this.price+""
				+ "\nDAte of Publication : "+this.MyDate+"\nAuthor : "+this.Authors;
				return str;
	}
	
	public String getBookName() {
		return BookName;
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
