import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateEx2 
{
	public static void main(String[] args) {
		
		Date today= new Date();
		System.out.println(today);
		
		GregorianCalendar today2= new GregorianCalendar();
		System.out.println(today2);
		
		int day= today2.get(Calendar.DAY_OF_MONTH);
		int month= today2.get(Calendar.MONTH)+1;// month starts from 0
		int year= today2.get(Calendar.YEAR);
		System.out.println(day+"/"+month+"/"+year);
		
		GregorianCalendar nextday = new GregorianCalendar(2022,5
				,5);
		
		long todaymillis= today2.getTimeInMillis();
		long nextdaymillis=nextday.getTimeInMillis();
		
		long diff=nextdaymillis -todaymillis; // miliseconds
		
		long days=  ((((diff)/1000)/60)/60)/24;
		
		System.out.println("Days : "+days);
	}

}
