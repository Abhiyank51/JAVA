// Method over-riding 

class A{
    public int a;
    public int number(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}   
class B extends A{
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
    // Now the meth2 of class B is run b/c we makw its personal function meth2()
    // for class B now he did not run meth2() function of class A this is called method over-riding
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
}
public class TUT_48 {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
