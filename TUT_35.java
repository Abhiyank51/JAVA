// Practice set

/*
Q.1 Write a java method to print multiplication table of a number n.
Q.2 Write a program using functions to print the following pattern-
*
**
***
****
Q.3 Write a recursive funcion to calculate sum of first n natural numbers
Q.4 Write a function to print the following pattern
****
***
**
*
Q.5 Write a function to print nth term of fibonacci series using recursion
Q.6 Write a function to find average of a set of numbers passed as arguments
Q.7 Repeat 4 using recursion
Q.8 Repeat 2 using recursion
Q.9 Write a function to convert celsius to farenheit
Q.10 Repeat 3 using iterative approach
*/


// ANS 1
// public class TUT_35 {
//     static void multiplication(int n){
//         for (int i = 1; i <=10; i++) {
//             int multiply = n*i;
//             System.out.printf("%d x %d = %d\n",n,i,multiply);
//         }
//     }
//     public static void main(String[] args) {
//         multiplication(5);
//     }
// }


// ANS 2
// public class TUT_35{
//     public static void main(String[] args) {
//         for (int i = 0; i<4; i++) {
//             for(int j = 0; j<=i;j++){
//                 System.out.print("*");
//             }System.out.print("\n");
//         }
//     }
// }


// ANS 3
// import java.util.Scanner;
// public class TUT_35{
//     static int sum(int n){
//         int result = 0;
//         for (int i = 1; i<=n ; i++) {
//             result = result+i;
//         }return result;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int num = sc.nextInt();
//         System.out.println("The sum of first "+num+" natural numbers is "+sum(num));
//         sc.close();
//     }
// }


// Recursive function TO SUM N natural numbers
// public class TUT_35{
//     static int sumRec(int n){
//         if (n==1){
//             return 1;
//         }
//         else{
//             return n+sumRec(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         int c = sumRec(6);
//         System.out.println(c);
//     }
// }


// ANS 4
// public class TUT_35{
//     static void pattern(int n){
//         for(int i = n; i>0; i--){
//             for(int j = 0; j<i; j++){
//                 System.out.print("*");
//             }System.out.print("\n");
//         }
//     }
//     public static void main(String[] args) {
//         pattern(5);
//     }
// }


// ANS 5
// import java.util.Scanner;
// public class TUT_35{
//     static int fib(int n){
//         /*if(n==1){
//             return 0;
//         }
//         else if(n==2){
//             return 1;
//         }*/
//         // OR WRITE AS
//         if(n==1 || n==2){
//             return n-1;
//         }
//         else{
//             return fib(n-1) + fib(n-2);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of nth term");
//         int n = sc.nextInt();
//         int result = fib(n);
//         System.out.println(result);
//         sc.close(); 
//     }
// }


// ANS 6
// static float average(float...marks){
//     float total=0;
//     for (float scan:marks){
//         total+=scan;
//     }
//     System.out.println(total/ marks.length);
//     return total;
// }

// public static void main(String[] args) {

//     float sum=average(1,2,3,4);
// }

// ANS 7


// ANS 8
// public class TUT_35{
//     static void pattern_rec(int n){
//         if(n>0){
//             pattern_rec(n-1);
//             for (int i = 0; i < n; i++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         pattern_rec(5);
//     }
// }


// flow of code --->
// pattern_rec(3)
// pattern_rec(2)+3 times star and new line
// pattern_rec(1)+2 times star and new line +3 times star and new line
// pattern_rec(0)+1 times star and new line +2 times star and new line +3 times star and new line
