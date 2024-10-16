// GregorianCalender class 
/*
Calender is an abstract class that provides calender related methods in java

Calender.getInstance -> returns a calender instance based on current time

Calender a = Calender.getInstance();
        a.getTime() -> prints time
*/


/*
Gregorian Calender class
This class is used to create an instance of gregorain calender
We can change the year ,month and date using set method.
*/

/*
Time Zone
TimeZone class is used to create Time Zones in Java Some of the important 
methods of TimeZone class are:

getAvailableIDs() -> get all the available IDs supported
getDefault()  -> get the default timezone
getID() -> get THE ID of a Timezone 
*/



import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;

public class TUT_99 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        // to get date/hour/second/minute/hour_of_day/ full time
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":"+ c.get(Calendar.SECOND));

        // making instance of gregorial calender
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2024));


        // to get ids of all time zone available 
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        
        // Loop through the set of time zone IDs
        for (String zoneId : zoneIds) {
            System.out.println(zoneId);
        }
    }
}
