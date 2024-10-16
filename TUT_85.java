// Java finally block
/*
Finally block contains the code which is always executed whether the exception
is handled or not, It is used to execute code containing instruction to 
release the system resources, close a connection etc.
*/

public class TUT_85 {
    public static int greet(){
        try{
            int a = 50;
            // int b = 2;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch(Exception e){
         System.out.println(e);
        } 
        // this code will execute in every situation
        finally{
            // System.out.println("This is the end of the program");
            System.out.println("Cleaning up resources....This is the end of the program");
        }
        return 0;
    }

    public static void main(String[] args) {
        // making a program that throws exception
        int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while (true) {
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b =" +b);
            }
            b--;

            // we can use try with finally/catch block seperately but cant use try alone
            try{
                System.out.println(5/0);
            }
            finally{
                System.out.println("Yes i am using with try block seperately");
            }
        }
    } 
}
