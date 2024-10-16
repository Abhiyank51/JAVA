// The exception class in Java 
/*
We can write over custom exceptions using Exception class in java

public class MyException extends Exception{
    // overridden methods 
}

The exception class has following important methods 
1. String toString() --> executed when sout(e) is run
2. void printStackTrace() --> prints stack trace
3. String getMessage()  --> prints the Exception message 


*/

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        // return super.toString() + "I am toString()";
        return "I am toString()";
    }
    @Override
    public String getMessage(){
        // return super.getMessage() + "I am getMessage()";
        return "I am getMessage()";
    }
}

public class TUT_83 {
    public static void main(String[] args) {
        int a;
        @SuppressWarnings("resource")  // for sc
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
        }System.out.println("Yes Finished");
    }
}
