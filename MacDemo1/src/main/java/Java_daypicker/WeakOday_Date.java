package Java_daypicker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class WeakOday_Date {
	 
    public static void main(String[] args) {
    	
    	
//    	----------------Day----------------------------
 
        Date todayDay = new Date();
 
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
        String DayName0=simpleDateformat.format(todayDay);
        System.out.println(DayName0);
 
        simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        String DayName = simpleDateformat.format(todayDay);
        System.out.println(DayName);
 
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(todayDay);
        int DayName1 =calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(DayName1); // the day of the week in numerical format
 
        
        
//        ------------------------Date-------------
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 0);//insted of 0 we can use +-1 to indrease or decrease current date.
		String dateFinal = df.format(cal.getTime());
        
        System.out.println(dateFinal);
        
        
        
        
    }
}

