// Calender class in Java 

import java.util.Calendar;
import java.util.TimeZone;

public class TUT_98 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());  // use gregory calender 

        // to get timezone
        System.out.println(c.getTimeZone());


        // for another timezone
        // Asis/Singapore is the particular id of singapore timezone which is inputed here 
        Calendar d = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(d.getCalendarType());  // use gregory calender 

        // to get timezone
        System.out.println(d.getTimeZone());

        // to get time
        System.out.println(d.getTime());

        // to get id of this time zone 
        System.out.println(d.getTimeZone().getID());
        
    }
}
