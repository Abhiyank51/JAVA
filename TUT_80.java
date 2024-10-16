// Try Catch Block in java

/*
An exception is an event that occurs when a program is executed disruppting 
the normal flow of instructions.
There are mainly two types of exceptions in java
1. Checked Exception    -> Compilt time exceptions(Handled by compiler)
2. Unchecked Exception  -> Runtime executions
*/

public class TUT_80 {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        // Without try
        // int c = a/b;
        // System.out.println("Thre result is "+c);


        // With try
        // trying that this code will run
        try{
            int c = a/b;
            System.out.println("Thre result is "+c);
        }
        // catching up the exception
        catch(Exception e){
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
