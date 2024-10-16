// Inheritance in interfaces 
// Interface can extend another interfaces 
// NOTE: Interface cannot implement another interface, only classes can do that.
interface sampleInterface{
    void meth1();
    void meth2();
}

// Inheritance in interfaces 
// With the help of inheritance of interface class in sampleInterface
// the functions of interface class meth1 and math2 are come in sampleInterface
// class so we also have to define then in Mysampleclass that implements from sampleInterface class.

interface chileSampleInterface extends sampleInterface{
    // void meth1();
    // void meth2();
    void meth3();
    void meth4();
}

class MySampleClass implements chileSampleInterface{
    public void meth3(){
        System.out.println("Meth 3");
    }
    public void meth4(){
        System.out.println("Meth 4");
    }
    public void meth1(){
        System.out.println("Meth 1");
    }
    public void meth2(){
        System.out.println("Meth 2");
    }
}

public class TUT_58 {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
