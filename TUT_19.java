// Practice set 
/*
Q.1 What will be the output of this program
Q.2 Write a program to find out whether a student is pass or fail; if it requies total 40%
and at least 33% in each sub to pass, assume 3 sub's and take marks as an input from the user.
Q.3 Calculate income tax paid by an employee to the government as per the slabs mentioned below
    Income slab      Tax
    2.5L-5.0L         5%
    5.0L-10.0L        20%
    Above 10.0L       30% 
Q.4 Write a java program to find out the day of the week given the number
[1 for monday, 2 for tuesday....and so on]
Q.5 Write a java program to find whether a year entered by the user is leap year or not.
Q.6 Write a program to find out the type of website from the url
.com -> commercial website
.org -> organization website
.in -> indian website
 */

// import java.util.Scanner;
public class TUT_19 {
    public static void main(String[] args) {
        // ANS 1
        // ERROR AS we use assignment operator in if statement
        // int a = 10;
        // if(a = 11){
        //     System.out.println("I am 11");
        // }
        // else{
        //     System.out.println("Iam not 11");
        // }

        // ANS 2
        // Scanner sc = new Scanner((System.in));
        // System.out.println("Enter marks of sub 1");
        // float sub1marks = sc.nextFloat();
        // System.out.println("Enter marks of sub 2");
        // float sub2marks = sc.nextFloat();
        // System.out.println("Enter marks of sub 3");
        // float sub3marks = sc.nextFloat();
        // float totalmarks = 300.0f;
        // float subtotalmarks = sub1marks+sub2marks+sub3marks;
        // float percentage = (((subtotalmarks)/totalmarks))*100;
        // System.out.println("Your percentage are: "+ percentage+"%");

        // if(percentage<33){
        //     System.out.println("Sorry! You are fail");
        // }
        // else{
        //     System.out.println("You are pass");
        // }
        // sc.close();


        // BY CWH
        // we take byte here as our marks are come under 100
        // byte m1, m2, m3;
        // Scanner sc = new Scanner((System.in));

        // System.out.println("Enter your marks in physics ");
        // m1 = sc.nextByte();

        // System.out.println("Enter your marks in chemistry ");
        // m2 = sc.nextByte();

        // System.out.println("Enter your marks in maths ");
        // m3 = sc.nextByte();
        
        // float avg = (m1+m2+m3)/3.0f;
        // System.out.println("Percentage is: "+ avg);
        // if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
        //     System.out.println("You are pass");
        // }
        // else{
        //     System.out.println("You are fail");
        // }
        // sc.close();


        // ANS 3
        // Scanner sc = new Scanner((System.in));
        // System.out.println("Enter your Income in lakhs per annum");
        // float tax = 0;
        // float income = sc.nextFloat();
        // if(income<2.5){
        //     tax = tax+0;
        // }
        // else if(income>2.5 && income<=5f){
        //     tax = tax + 0.05f *(income - 2.5f);
        // }
        // else if(income>5f && income<=10.0f){
        //     tax = tax + 0.05f *(5.0f - 2.5f);
        //     tax = tax + 0.2f *(income - 5f);
        // }
        // else if(income>10.0f){
        //     tax = tax + 0.05f *(5.0f - 2.5f);
        //     tax = tax + 0.2f *(10.0f - 2.5f);
        //     tax = tax + 0.3f *(income - 10.0f);
        // }
        // System.out.println("Total tax paid by the employee is "+ tax);
        // sc.close();


        // ANS 4
        // We use enhanced switch case here
        // Scanner sc = new Scanner(System.in);
        // int day = sc.nextInt();
        // switch(day){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        // }
        // sc.close();


        // ANS 5
        // int y;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the year 'y' to be checked:");
        // y = sc.nextInt();
        // int year = ((y%4==0&&y%100!=0)||(y%400==0))?1:0;
        // if(year==1)
        // {
        //     System.out.print("y is a leap year");
        // }
        // else
        // {
        //     System.out.print("y is not a leap year");
        // }
        // sc.close();


        // ANS 6
        // Scanner sc= new Scanner(System.in);
        // String website = sc.next();
        // if(website.endsWith(".org")){
        //     System.out.println("This is an organizational website");
        // }
        // else if(website.endsWith(".com")){
        //     System.out.println("This is an commercial website");
        // }
        // if(website.endsWith(".in")){
        //     System.out.println("This is an indian website");
        // }sc.close();
    }
}
