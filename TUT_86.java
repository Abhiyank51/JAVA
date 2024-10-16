// PRACTICE SET
/*
Q.1 Write a Java program to demonstrate syntax, logical and numeric errors
Q.2 Write a Java program that prints "Hello" during Arithmetic exception
and "HII" during an Illegal argument exception
Q.3 Write a program that allows you to keep accessing an array until a valid 
index is given. If max retries exceed 5 print "Error"
Q.4 Modify program in Q3 to throw a custom Exception if max retries are reached
Q.5 Wrap the program in Q3 inside a method which throws you custom Exception 
*/


// ANS 1
// public class TUT_86 {
//     public static void main(String[] args) {
//         // Syntax error - int a = 7  (no semicolon)

//         // int age = 78;
//         // int year_born = 2000-78;  // logical error as we cant find our current age 
//         // with this method

//         //Numeric error
//         // System.out.println(9/0);   // invalid 
//     }
// }


// ANS 2
// public class TUT_86 {
//     public static void main(String[] args) {
//         try{
//             int a = 666/0;  // exception here 
//         }
//         catch(IllegalArgumentException e){
//             System.out.println("Hello ");
//         }
//         catch(ArithmeticException e){
//             System.out.println("Hii");
//         }
//     }
// }



// ANS 3

import java.util.Scanner;

public class TUT_86 {
    public static void main(String[] args) {
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 71;
        marks[1] = 56;
        marks[2] = 67;
        Scanner sc = new Scanner(System.in);
        int index;
        int i  = 0;
        while (flag && i < 5) {
            try{
                System.out.println("Enter the value of index: ");
                index = sc.nextInt();
                System.out.println("The value of marks is: "+marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i>5){
            System.out.println("Error");
        }
        sc.close();
    }
}



// public class TUT_86 {
//     public static void main(String[] args) {
        
//     }
// }



// public class TUT_86 {
//     public static void main(String[] args) {
        
//     }
// }

// For Question 4 ->
// Make a custom class for the error ->
// class Exceptiononretry extends Exception{
//     @Override
//     public String getMessage(){
//         return "Error";
//     }

// }

// In the main function->
// if(i>=5){
//                 try{
//                     throw new Exceptiononretry();
//                 }
//                 catch(Exceptiononretry e){
//                     System.out.println("\n"+e.getMessage());
//                 }
//             }

// For question 5 ->
// Using the above custom class make this function->
// public static void throwexception(int i) throws Exceptiononretry{
//         if (i<=5){
//             throw new Exceptiononretry();
//         }
//     }

// In the main function ->
// if(i>=5){
//                 try{
//                     throwexception(i);
//                 }
//                 catch(Exceptiononretry e){
//                     System.out.println("\n"+e.getMessage());
//                 }
//             }