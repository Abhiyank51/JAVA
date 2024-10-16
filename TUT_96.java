//  Storing Date and time in java

/*
Date in Java is stored in the form of a long number.This long number holds
the number of millisecond passed since 1 jan 1970.

Java assumes that 1900 is the start year which means it calculates years 
passed since 1900 whenever we ask it for years passed.

System.currentTimeMillis() returns the no of milliseconds passed. Once no of ms are 
calculated, we can calculate minutes, seconds and years passed.
*/

// for tut _ 106
/**
 * @author Abhiyank Yadav
 * @version 0.1
 * @since 2004
 * @see Java Docs 
 */

 
public class TUT_96 {
    public static void main(String[] args) {
        // to get millisecond
        System.out.println(System.currentTimeMillis());
        // to get seconds 
        System.out.println(System.currentTimeMillis()/1000);
        // to get hours  
        System.out.println(System.currentTimeMillis()/1000/3600);
        // to get days
        System.out.println(System.currentTimeMillis()/1000/3600/24);
        // to get years 
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
    }
}
