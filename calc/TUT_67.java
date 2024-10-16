// PRACTICE SET 
/*
Q.1 Create three classes Calculator, ScCalculator and HybridCalculator and 
    group them into a package.
Q.2 Use a built-in package in java to write a class which displays a message
    (by using sout) after taking input from the user
Q.3 Create a package in class with three package levels folder, folder1, floder2
    folder------
               folder1------
                            folder2
Q.4 Prove that you cannot access default property but can access protected
    property from the subclass.
*/



// ANS 1
package calc;

class Calculator{
    public void calculate(int a , int b){
        System.out.println("Your result is: "+ a+b);
    }
}

class ScCalculator{
    public void calculate(int a, int b){
        System.out.println("Your result is: "+Math.sin(a+b));
    }
}

class HybridCalculator{
    public void calculate(int a, int b){
        System.out.println("Your result is: "+ a+b);
        System.out.println("Your result is: "+Math.sin(a+b));
    }
}

public class TUT_67 {
    public static void main(String[] args) {
        System.out.println("I am main method");
    }
}
// /*
// // Write in terminal 
// javac -d . TUT_67.java
// java TUT_67
// java/cala/TUT_67 
// */


// import java.util.Scanner;

// class Take_Input{
//     public void input(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string: ");
//         String input = sc.nextLine();
//         System.out.println(input);
//         sc.close();
//     }
// }
// public class TUT_67{
//     public static void main(String[] args) {
//         Take_Input TK  =new Take_Input();
//         TK.input();
//     }
// }