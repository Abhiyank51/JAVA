// Inheritance in java

class Base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in base setting x now");
        this.x = x;
    }
    void printMe(){
        System.out.println("I am a programmer");
    }
}

// With the help of extend keyword the things that are available in Base class is now get in derived class
class Derived extends Base{
    int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}

public class TUT_45 {
    public static void main(String[] args) {

        // Creating an object of base class
        Base b = new Base();
        /* instead of base if you make a derived class object then also
         you can access the same function of base class due to extend */
        //  Derived b = new Derived();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());
        d.setY(3);
        System.out.println(d.getY());
    }
}

// Java does not support multiple inheritance i.e you cannot make a subclass
// from two super class
