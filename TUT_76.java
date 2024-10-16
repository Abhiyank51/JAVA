// PRACTICE SET

/*
Q.1 Write a program to print "good morning" and "welcome" continuously on the 
screen in Java using Threads.
Q.2 Add a sleep method in welcome thread of question 1 to delay its execution 
for 200 ms 
Q.3 Demonstrate getPriority and setPriority() methods in Java Threads.
Q.4 How do you get state of a given Thread in Java.
Q.5 How do you get reference to the current thread in Java.
*/


// ANS 1
// class Thread1 extends Thread{
//     public void run(){
//         int i = 0;
//         while (i<500) {
//             System.out.println("Good Morning");
//             i++;
//         }
//     }
// }

// class Thread2 extends Thread{
//     public void run(){
//         int i = 0;
//         while (i<500) {
//             System.out.println("Welcome");
//             i++;
//         }
//     }
// }

// public class TUT_76 {
//     public static void main(String[] args) {
//         Thread1 t1 = new Thread1();
//         Thread2 t2 = new Thread2();
//         t1.start();
//         t2.start();
//     }
// }


// ANS 2
// class Thread1 extends Thread{
//     public void run(){
//         int i = 0;
//         while (i<500) {
//             System.out.println("Good Morning");
//             i++;
//         }
//     }
// }

// class Thread2 extends Thread{
//     public void run(){
//         int i = 0;
//         while (i<500) {
//             System.out.println("Welcome");
//             try{
//                 Thread.sleep(200);
//             }
//             catch(Exception e){
//                 e.printStackTrace();
//             }
//             i++;
//         }
//     }
// }

// public class TUT_76 {
//     public static void main(String[] args) {
//         Thread1 t1 = new Thread1();
//         Thread2 t2 = new Thread2();
//         try {
//             t2.join();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//         t1.start();
//         t2.start();
//     }
// }



// ANS 3 , ANS 4
class Thread1 extends Thread{
    public void run(){
        int i = 0;
        while (i<500) {
            System.out.println("Good Morning");
            i++;
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        int i = 0;
        while (i<500) {
            System.out.println("Welcome");
            i++;
        }
    }
}

// Default priority without setting any is 5 (Normal Priority).
public class TUT_76 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.setPriority(6);

        Thread2 t2 = new Thread2();
        t2.setPriority(9);

        // To Get Priority
        System.out.println(t1.getPriority());   //6
        System.out.println(t2.getPriority());   //9


        // To Get State
        System.out.println(t1.getState());
        System.out.println(t2.getState());

        // To Get Reference of the thread 
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread());

        t1.start();
        t2.start();
    }
}
