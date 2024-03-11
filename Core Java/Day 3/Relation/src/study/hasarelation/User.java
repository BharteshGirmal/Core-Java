
package study.hasarelation;

public class User 
{
	public static void main(String[] args) 
	{
		Book B1= new Book();
		B1.setBookName("Core java");
		B1.setPrice(555.98);
		B1.setDateofPublication(new MyDate (22,5,2022));
		B1.setAuthors(new String[] {"Dennies Richie","Kem Thompson"});
		
		Book B2= new Book("Advanced Java", 458.55 ,new MyDate(23,05,2022),new String[] {"Bhartesh","Girmal"});
		System.out.println("Year of Publication of B1 : "+B1.getDateofPublication().getYear());
		System.out.println("Total Authors of B2 : "+B2.getAuthors().length);
		System.out.println("Total Cost of Two Books : "+(B1.getPrice()+B2.getPrice()));
	}

}
 