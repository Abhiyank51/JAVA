// If else statement in java

import java.util.Scanner;

public class TUT_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("Sorry! You can't drive");
        }
        else{
            System.out.println("Yay! You can drive");
        }
        sc.close();
    }
}
