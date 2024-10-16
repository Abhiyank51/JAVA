// Constructors in inheritance

class Base1{
    public int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am a overloaded constructor with values of x as: "+x);
    }
}

class Derived1 extends Base1{
    public int y;
    Derived1(){
        super(0);   // if we want to run constructor of the super class that contains argument then we use super keyword here otherwise derived class constructor is used.
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am a overloaded constructor of Derived with values of b as: "+y);
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }

    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a overloaded constructor of Derived with values of z as: "+z);
    }
}

public class TUT_46 {
    public static void main(String[] args) {
        Base1 b = new Base1();
        b.setX(5);
        System.out.println(b.getX());
        // The below will automatically use the base class constructor
        // If make the own constructor of derived class then base lcass contructor also run with derived class constructor 
        Derived1 d = new Derived1();
        d.setY(6);
        System.out.println(d.getY());
        Derived1 e = new Derived1(4,9);
        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived sc = new ChildOfDerived(12,13,15);
    }
}
