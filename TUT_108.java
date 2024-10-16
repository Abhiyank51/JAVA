// Annotations in Java

/*
Used to provide extra information about a program.
Annotations provides metadata to class/methods.

Following are some common annotations biult into java

1. @Override -> Used to mark Overridden elements in the child classes
2. @SuppressWarnings -> Used to suppress the generated warnings by the compiler
3. @deprecated -> Used to mark deprecated methods
4. @FunctionalInterface -> Used to ensure an interface is a functional interface
*/

// functional interface/ annotation
// @FunctionalInterface
// // a functional interface contains only one method if two method are 
// // in it , it throws erriror
// interface myFunctionalInterface{
//     void thisMethod();
//     void thisMethod2();
// }
// override annotation
// class NewPhone extends Phone {
//     @Override
//     public void showTime(){
//         System.out.println("Time is 8pm");
//     }

// // deprecated annotation
//     @Deprecated
//     public int sum(int a, int b){
    //         return a+b;
    //     }
    // }
    // public class TUT_108 {

// suppresswarning annotation - reduce the error raise by compiler
    // @SuppressWarnings("deprication")
//     public static void main(String[] args) {
//         NewPhone phone = new NewPhone();
//         phone.showTime();
//         phone.sum(5, 9);
//     }
// }
