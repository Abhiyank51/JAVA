// Java Anonymous classes & Lambda Expressions
/*
Added in Java 8
* Lambda expressions let us express instances of single method classes more compactly
* Anonymous classes are used to implement a base class without giving it a name.
* For class with a single method, even enonymous classes get slightly 
  excessive & cumbersome
*/

@FunctionalInterface
interface DemoAno{
    int x = 45;
    void meth1(int a);
    // void meth2();
}


// Lamda expression
// class AbhiyankFunc implements DemoAno{
//     @Override
//     public void meth1(){
//         System.out.println("This is method 1");
//     }
// }



// DUE TO ANONYMOUS CLASS WE DO NOT HAVE TO WRITE THIS WHOLE CODE 
// class AnonyDemo implements DemoAno{
//     public void display(){
//         System.out.println("Hello");
//     }
//     @Override
//     public void meth1(){
//         System.out.println("I am meth1");
//     }
//     @Override
//     public void meth2(){
//         System.out.println("I am meth2");
//     }
// }


public class TUT_109 {
    public static void main(String[] args) {
        // AnonyDemo obj = new AnonyDemo();
        // obj.meth1();

        // we don't have to make a full class for it we can directly make it by make it as anonymous class
        // here we declare class and instantiate the object at the same time in it this is anonymous class
        // DemoAno obj = new DemoAno() {
        //     @Override
        //     public void meth1(){
        //         System.out.println("I am meth1");
        //     }
        //     @Override
        //     public void meth2(){
        //         System.out.println("I am meth2");
        //     }
        // };
        // obj.meth1();


        // Lambda Expression
        // DemoAno obj = new AbhiyankFunc();
        // obj.meth1();

        // this is lambda expression  --> helps to increase compatibility(make code compact and consise) of code by not typing more code for defininng obj and overriding it.
        DemoAno obj = (a)->{
            System.out.println("I am method 1 " + a);
        };
        obj.meth1(9);
    }
}
