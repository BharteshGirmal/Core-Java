import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateEx 
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
	}

}
//java.util.GregorianCalendar
//[time=1651905990953,
//areFieldsSet=true,
//areAllFieldsSet=true,
//lenient=true,
//zone=sun.util.calendar.ZoneInfo[id="Asia/Calcutta",
//offset=19800000,
//dstSavings=0,
//useDaylight=false,
//transitions=6,
//lastRule=null],
//firstDayOfWeek=1,
//minimalDaysInFirstWeek=1,
//ERA=1,
//YEAR=2022,
//MONTH=4,WEEK_OF_YEAR=19,
//WEEK_OF_MONTH=1,
//DAY_OF_MONTH=7,
//DAY_OF_YEAR=127,
//DAY_OF_WEEK=7,
//DAY_OF_WEEK_IN_MONTH=1,
//AM_PM=1,
//HOUR=0,
//HOUR_OF_DAY=12,
//MINUTE=16,
//SECOND=30,
//MILLISECOND=953,
//ZONE_OFFSET=19800000,
//DST_OFFSET=0]

