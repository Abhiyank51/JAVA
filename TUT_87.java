// Exercise 6 - CUSTOM CALCULATOR
/*
Exercise 6: YOU have to create a custom calculator with following operations:
1. + -> Addition
2. - -> Subtraction
3. * -> Multiplication
4. / -> Division
which throws the following exceptions
1. Invalid input exceptions ex: 8 & 9
2. Cannot divide by 0 exception
3. Max Input Exception if any of the inputs is greater that 10000
4. Max Multiplier Reached Exception - Don't allow any miltiplication input to be greater than 7000.  
*/

class InvalidInputException extends Exception{
    public String toString(){
        return "Cannot add 8 and 9";
    }
}

class CannotDivideByZeroException extends Exception{
    public String toString(){
        return "Cannot divide by zero";
    }
}

class MaxInputException extends Exception{
    public String toString(){
        return "Maximum input provided!!!, Not greater than 10000";
    }
}

class MaxMultiplierReachException extends Exception{
    public String toString(){
        return "Max Multiplier less that 7000";
    }
}

class CustomCalculator{
    double add(double a, double b) throws InvalidInputException , MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a==8 || b==9){
           throw new InvalidInputException(); 
        }
        return a+b;
    }
    double sub(double a, double b) throws MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a, double b) throws MaxInputException , MaxMultiplierReachException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        else if(a>7000 || b>7000){
            throw new MaxMultiplierReachException();
        }
        return a*b;
    }
    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException{
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a/b;
    }
}

public class TUT_87 {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplierReachException{
        CustomCalculator c = new CustomCalculator();
        // c.add(8,9);
        // c.divide(2, 0);
        c.multiply(5, 7885);
    }
}
