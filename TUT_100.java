// java.time package 

/*
Available from Java 8 onwards
Capable of storing even nanoseconds

Following are some of the most commonly used classes from java.time package
LocalDate -> Represents a date
LocalTime -> Represents a time
LocalDateTime-> Represents a Date + Time
DateTimeFormatter -> Formatter for displaying & parsing date-time objects 
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TUT_100 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
