// THREAD CLASS MAKING AND SEE USE 

// BY METHOD 1 
// By extending Thread class

class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My thread1 is running");
            System.out.println("Finally!");
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My thread2 is running");
            System.out.println("Good Job!");
        }
    }
}
public class TUT_70 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();   // start is a thread method and many more other methods are available in thread 
        t2.start();
    }
}
