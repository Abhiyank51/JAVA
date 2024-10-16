// STRING
// A string is a sequence of characters 
// A string is instantiated as follows:
// String name;
// name = new String("Abhiyank Yadav");
// String are immutable, cannot be chaged

import java.util.Scanner;
public class TUT_13 {
    public static void main(String[] args) {
        // String name = new String("Abhiyank");
        // or we can write it as due to special support of java in string
        // String name = "Abhiyank";
        // System.out.println(name);

        // int a = 6;
        // float b = 5.78f;
        // System.out.printf("The value of a is %d and the value of b is %f ",a,b);
        /*
        %d for int 
        %s for string
        %f for float
        %c for char
        */

        Scanner sc = new Scanner(System.in);
        // String st = sc.next();
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        System.out.println(st);
        sc.close();
    }
}
