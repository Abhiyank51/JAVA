// Take input from the user with the help of java scanner class
import java.util.Scanner;

public class TUT_5 {
    public static void main(String args[]){
        // Directly type sout to get printing statement
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);  // taking input from keyboard
        System.out.println("Enter number 1: ");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2: ");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.println("The sum of these numbers is: ");
        System.out.println(sum);
        sc.close(); // optional as sc give an error line comment out to see

        // check if the input is integer literal
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);

        // check if the input is string literal
        // String str = sc.next();  // only read a word not whitespaces
        // String str = sc.nextLine();  // read whole sentence
        // System.out.println(str);
    }
}
