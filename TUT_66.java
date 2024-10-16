// Access modifiers in java
/*
are of 4 types
1. Public
2. Protected
3. Private
4. Default 
*/

/*
MODIFIER         CLASS          PACKAGE           SUBCLASS         WORLD
public              Y               Y               Y               Y
protected           Y               Y               Y               N
default(no)         Y               Y               N               N
private             Y               N               N               N
*/

class C1{
    // public access modifier
    public int x = 5;
    // protected access modifier
    protected int y = 45;
    // default access modifier 
    int z = 7;
    // private int modifier
    private int a = 78;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class TUT_66 {
    public static void main(String[] args) {
        C1 c = new C1();   // within the same class we can use any access modifier
        c.meth1();

        // System.out.println(c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        // System.out.println(c.a);  //  could not access private modifier inside a same packgae 
    }
}
