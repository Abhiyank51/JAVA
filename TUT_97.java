// The date class in java
/*
DATE CLASS
Date d = new Date();
System.out.println(d);
*/

// Quick quiz - Is it safe to store the no. of millisecond in a variable of type long.

import java.sql.Date;

public class TUT_97 {
    public static void main(String[] args) {
        // Ans of quick quiz
        // firstly print max value of long 
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());

        /*
        9223372036854775807  <- long size 
        1707645244902        <- millisecond till today(11/02/24 | 03:25 PM)
        The long number is too big and now ms is small as compare both
        so we can store upto lakhs ms in long 
        so it is safe to store ms in long type variable 
        */

        // DATE CLASS CODE
        // date comes from millisecond also just like time-hours,years,sec 
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d);

        Date n = new Date(0);  // gives date methid in java starting year
        System.out.println(n);

        System.out.println(d.getTime());   // give in millisecond to today since jan1 1970

        // System.out.println(d.getYear());   // 2024-1900 = 124 years 

    }
}
