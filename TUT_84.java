// Throw vs Throws 
/*
The throw keyword is used to throw an exception explicitly by the programmer
if(b==0){
    throw new Arithmetic Exception("Div by 0")
}
else{
    return a/b;
}

In a similar manner we can throw user defined exceptions:
throw new MyException("Exception Thrown")


The java throws keyword is used to declare an exception. This gives an information
to the programmer that there might be an exception so, it is better to be 
prepared with a try catch block

public void Calculate(int a, int b) throws 10Exception{
    //code
}
*/

// CUSTOM EXCEPTION
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative";
    }
}
public class TUT_84 {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            int c = divide(6,0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        try{
            double ar = area(6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println(e );
        }
    }
}
