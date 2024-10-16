// Practice set
/*
Q.1 Write a program to print the following pattern
****
***
**
*
Q.2 Write a program to sum first n even numbers using while loop
Q.3 Write a program to print multiplication table of a given number n
Q.4 Write a program to print multiplication table of 10 in reverse order
Q.5 Write a program to find factorial of a given number using for loop
Q.6 Repeat 5 using while loop
Q.7 Repeat 1 using for/while loop
Q.8 What can be dne using one type of loop can also be done using the other two types
of loops - True or False
Q.9 Write a program to calculate the sum of the numbers occuring in the 
multiplication table of 8.
Q.10 A do while loop is executed
    1> At least once
    2> At least twice
    3> At most once
Q.11 Repeat 2 usinf for loop
 */

//  import java.util.Scanner;
public class TUT_25 {
    public static void main(String[] args) {
        
        //ANS 1
        // int n = 4;
        // for (int i = n; i > 0; i--) {
        //     for(int j = 0; j<i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        // ANS 2

        // first 4 even numbers 0,2,4,6 = 12
        // int sum = 0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of n");
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     sum = sum + (2*i);
        // }
        // System.out.println("Sum of even numbers is: ");
        // System.out.println(sum);
        // sc.close();


        // ANS 3
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter which table you want");
        // int n = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     System.out.printf("%d X %d = %d",n,i,n*i);
        //     System.out.println("\n");
        // }sc.close();


        // ANS 4
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter which table you want");
        // int n = sc.nextInt();
        // for (int i = 10; i >= 1; i--) {
        //     System.out.printf("%d X %d = %d",n,i,n*i);
        //     System.out.println("\n");
        // }sc.close();


        // ANS 5
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter which factorial you want");
        // int n = sc.nextInt();
        // int fact = 1;
        // for (int i = 1; i <=n; i++) {
        //     fact = fact*i;
        // }
        // System.out.println(fact);
        // sc.close();


        // ANS 6
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter which factorial you want");
        // int n = sc.nextInt();
        // int fact = 1;
        // int i =1;
        // while (i<=n) {
        //     fact = fact*i;
        //     i++;
        // }
        // System.out.println(fact);
        // sc.close();


        // ANS 7
        // int n = 4;
        // int i = n;
        // while (i > 0) {
        // int j = 0;
        // while (j < i) {
        //     System.out.print("*");
        //     j++;
        // }System.out.print("\n");
        // i--;
        // }


        // ANS 8
        // TRUE

        // ANS 9
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter which table you want to sum");
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= 10; i++) {
        //     sum += n*i;
        // }System.out.println(sum);
        // sc.close();

        // ANS 10
        // At least once

        // ANS 11
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number upto you want to sum");
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 0;
        // while (i<=n) {
        //     sum += i;
        //     i++;
        // }
        // System.out.println(sum);
        // sc.close();
    }
}
