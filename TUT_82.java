// Nested try-catch in java

/*
We can nest multiple try-catch blocks as follows :
try{
    try{
        //code
    }
    catch(Exception e){            ----->Nested try-catch blocks 
        //code 
    }
}
catch(Exception e){
    // code 
    } 
*/

// import java.util.Scanner;

// public class TUT_82 {
//     public static void main(String[] args) {
//         int [] marks = new int[3];
//         marks[0] = 71;
//         marks[1] = 56;
//         marks[2] = 67;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the index");
//         int ind = sc.nextInt();
//         // nested try-catch 
//         try{
//             System.out.println("Try at level 1");
//             try{
//                 System.out.println(marks[ind]);
//                 System.out.println("Try at level 2");
//             }
//             catch(ArrayIndexOutOfBoundsException e){
//                 System.out.println("Sorry this index does not exist in array");
//                 System.out.println("Exception at level 2");
//             }
//         }
//         catch(Exception e){
//             System.out.println("Exception at level 1");
//         }
//         sc.close();
//     }
// }


/*
Quiz - Write a java program that allows you to keep accessing an array until a
    valid index is given by the user.
*/

// BY ME 
// import java.util.Scanner;

// public class TUT_82 {
//     public static void main(String[] args) {
//         int [] marks = new int[3];
//         marks[0] = 71;
//         marks[1] = 56;
//         marks[2] = 67;
//         int ind;
//         for (int i = 0; i <= marks.length; i++) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the index");
//             ind = sc.nextInt();
//             if(ind == marks[i]){
//                 System.out.println(marks[i]);
//             }
//             else{
//                 try{
//                     System.out.println(marks[ind]);
//                 }
//                 catch(Exception e){
//                     System.out.println("Array index in invalid ");
//                 }
//             }sc.close();
//         }
//     }
// }

// BY CWH 
import java.util.Scanner;

public class TUT_82 {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 71;
        marks[1] = 56;
        marks[2] = 67;
        Scanner sc = new Scanner(System.in);
        Boolean flag = true;
        while(flag){
            System.out.println("Enter the index");
            int ind = sc.nextInt();
            // nested try-catch 
            try{
                try{
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index does not exist in array");
                    System.out.println("Exception at level 2");
                }
            }
            catch(Exception e){
                System.out.println("Exception at level 1");
            }
        }sc.close();
        System.out.println("Thanks for using this program");
    }
}
