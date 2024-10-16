// Syntax errors, Runtime errors & Logical Errors in Java

import java.util.Scanner;

public class TUT_79 {
    public static void main(String[] args) {
        // Example of Syntax Errror
        // int a = 0   (semicolon not present)
        // b = 8   (data type not present or not declared the variable b)


        // Example of Logical error
        // Write a program to print all prime number between 1 to 10
        // Here we put up the wrong logic for prime number
        // System.out.println(2);
        // for (int i = 1; i < 5; i++) {
        //     System.out.println(2*i+1);
        // }


        // Example of Runtime error -> Your input is exception
        // you provide such a input that your program does not run for long time and interrupt.
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("100 divided by k is_ "+ 1000/k);
        sc.close();

        // if input is 0 then this through error
        
    }
}
