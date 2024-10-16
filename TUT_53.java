// Abstract class & Abstract Methods 
// -> A method that is declared without an implementation 
// abstract void moveTo(double X, double Y)
// Abstract class
// -> If a class includes abstract methods, then the class itself must be declared abstract, as in:
// -> simply an abstract class is a class that contains any abstract method.
// An abstract method make a whole class abstract
/*
public abstract class PhoneModel{
    abstract void SwitchOff();
    // more code 
}
*/
// If a class includes abstract methods, then the class itself must be declares abstract, as in:
abstract class Parent{
    // Constructor
    public Parent(){
        System.out.println("I am the constructor of Base class");
    }
    public void greet(){
        System.out.println("Hello Good Morning");
    }
    // Abstract method here we don't give it's implementation that's why it is an abstract data type
    abstract public void greeting();
    abstract public void greeting2();

}

class Child extends Parent{
    @Override
    public void greeting(){
        System.out.println("Good night");
    }
    @Override
    public void greeting2(){
        System.out.println("Good Afternoon");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("Hello");
    }
}
public class TUT_53 {
    public static void main(String[] args) {
        // We cant make an object of abstract class
        // Parent p = new Parent();  //  Not possible 
        Child c = new Child();
        c.greet();
        // Child2 p = new Child2();  // not possible as chile2 is an abstract class
    }
}

// NOTE 
/*
It is possible to create reference of an abstract class
It is not possible to create an object of an abstract class
*/