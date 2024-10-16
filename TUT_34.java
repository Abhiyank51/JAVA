// Recursion in Java
// A function in java that can call itself. Such calling of function by itself is called recursion.

import java.util.Scanner;

public class TUT_34 {
    // BY RECURSIVE APPROACH
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    // BY ITERATIVE APPROACH
    static int factorial_iterative(int n){
        if(n<=1){
            return 1;
        }
        else{
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }return product;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of "+num+" is "+factorial(num));
        System.out.println("Factorial of "+num+" is "+factorial_iterative(num));
        sc.close();
    }
}

// Fibonacci sequence
// import java.util.Scanner;

// public class Fibonacci {
//     public static void main(String[] args){
//         int firstterm = 0;
//         int secondterm = 1;
//         int i = 1;
//         System.out.println("Enter the number of terms you need: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println("Prinitng fibonacci sequence: ");
//         while (i<=n) {
//             System.out.print(firstterm+ ", ");
//             int sum = firstterm + secondterm;
//             firstterm = secondterm;
//             secondterm = sum;
//             i++;
//         }sc.close();
//         }   
//     }
