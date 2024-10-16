// Handling Specific Exception in Java
/*
In java we can handle specific exception by typing multiple catch block

try{
    //code
}
catch(IoException e){                ---->Handles all Exception of type ToException
    //code
}
catch(Arithmetic Exception e){      ---->Handle all Exception of type Arithmetic Expression
    //code 
}
catch(Exception e){                 ----> Handles all other Exceptions 
    //code
}
*/

import java.util.Scanner;

public class TUT_81 {
    public static void main(String[] args) {
        // Producing exception
        int [] marks = new int[3];
        marks[0] = 71;
        marks[1] = 56;
        marks[2] = 67;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number to which you divide ");
        int number = sc.nextInt();

        try{
            System.out.println("The value at array index entered is: "+marks[ind]);
            System.out.println("The value of array value/number is: "+marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);  // to prnting the exception
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);  // to prnting the exception
        }
        catch(Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);  // to prnting the exception
        }
        sc.close();
    }
}
