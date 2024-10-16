// this & super keyword

class class1{
    int a;
    public int returnone(){
        return 1;
    }
    public int getA(){
        return a;
    }
    class1(int v){
        // a = v;
        // this.a = a;  -> this is a reference to current object
        a = v;
    }
}
class class2 extends class1{
    class2(int c){
        super(c);   // with the help of this super() keyword we don't have to make a default constructor for this class
        System.out.println("I am a constructor");
    }
}
public class TUT_47 {
    public static void main(String[] args) {
        class1 e = new class1(65);
        class2 a = new class2(5);
        System.out.println(a.getA());
        System.out.println(e.getA());
    }
}


/*
this is a way use to reference an object of the class which
is being created/referenced 

this.area = 2 -> this is a reference to current object
*/


/*
A refernece variable used to refer immediate parent class object
-> Can be used to refer immediate parent class instance variable
-> Can be used to invoke parent class methods
-> Can be used to invoke parent class constructors
*/

