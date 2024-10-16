// Dynamic Method Dispatch

class Phone{
    public void name(){
        System.out.println("My name is Java");
    }
    public void greet(){
        System.out.println("Good Morning");
    }
}

class Smartphone extends Phone{
    public void name(){
        System.out.println("My name is java in class two");
    }
    public void Welcome(){
        System.out.println("You are welcome");
    }
}

public class TUT_49 {
    public static void main(String[] args) {
        // Phone obj = new Phone();             //ALLOWED
        // Smartphone smobj = new Smartphone(); //ALLOWED
        // obj.name();

        Phone obj = new Smartphone();      // this can be allowed
        // Super class object can be equal to sub class but sub class object cannot be equal to super class
        obj.greet();
        obj.name();  // smartphone method is run
        // Smartphone obj2 = new Phone();  // can't perform this 
        // obj.welcome();  // gives error as to run this you have 
        // to make object of the Smartphone class like always otherwise 
        // it does not allow to run its own methods
    }
}
