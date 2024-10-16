// DATE TIME FORMATTER IN JAVA 

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TUT_101 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();   // This is the date 
        System.out.println(dt);

        // FORMAT-1
        // formatting our date time as need usinf DateTimeFormatter
        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");  // This is the format
        // String myDate = dt.format(df);  // Creating date string using date and formatter
        // System.out.println(myDate);


        // FORMAT-2
        // DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;  // prdefined
        // String myDate = dt.format(df2);  // Creating date string using date and formatter
        // System.out.println(myDate);


        // FORMAT-3
        // DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");  // This is the format
        // String myDate = dt.format(df3);  // Creating date string using date and formatter
        // System.out.println(myDate);

        // FORMAT-4 (day in week with help of E and (am/pm) by a)
        DateTimeFormatter df4 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E a");  // This is the format
        String myDate = dt.format(df4);  // Creating date string using date and formatter
        System.out.println(myDate);
    }
}
