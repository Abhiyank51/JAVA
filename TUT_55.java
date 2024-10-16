// Abstarct classes vs interfaces

//  In interfaces we have to define the methods it is mendatory otherwise show error.
//  WE can create multiple interface of one class but cannot create multiple extends of one class.

interface Bicycle {
    int a = 45;
    void applyBrake(int decrement);
    void speedup(int increment);
}
// Can implement more than one interface
interface HornBicycle{
    int a = 45;
    void blowHorn1();
    void blowHorn2();
}

class AvonCycle implements Bicycle, HornBicycle{
    int speed = 7;
    public void blowHorn(){
        System.out.println("Beep beep");
    }
    public void applyBrake(int decrement){
        System.out.println("Appplying break");
        speed = speed-decrement;
        System.out.println(speed);
    }
    public void speedup(int increment){
        System.out.println("Increasing speed");
        speed = speed + increment;
        System.out.println(speed);
    }
    public void blowHorn1(){
        System.out.println("Pee pee");
    }
    public void blowHorn2(){
        System.out.println("Poop Poop");
    }
}
public class TUT_55 {
    public static void main(String[] args) {
        AvonCycle cycleAbhiyank = new AvonCycle();
        cycleAbhiyank.applyBrake(1);
        cycleAbhiyank.speedup(5);
        // You can create properties in interfaces 
        // System.out.println(cycleAbhiyank.a);
        // You cannot modify the properties in Interface as they are final
        // cycleAbhiyank.a = 54;   // give error as a is a final keyword of interface
        // System.out.println(cycleAbhiyank.a);

        cycleAbhiyank.blowHorn1();
        cycleAbhiyank.blowHorn2();
    }
}
