// Constructors from thread class in java
/*
Below ate the commonly used constructors of Thread class:
1. Thread()
2. Thread(String name)
3. Thread(Runnable r)
4. Thread(Runnable r, String name)
*/

// getId() method give you the id of the Thread 
// now threadId() method is used instead of getId() to get id of thread because getId() is not now in java version.

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        // int i = 0;
        // while(i<400){
        //     System.out.println("I am a thread");
        //     i++;
        // }
        int i = 34;
        System.out.println(i);
    }
}

public class TUT_73 {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Abhiyank");  // thread name 
        MyThr t2 = new MyThr("Bharat");
        t1.start();   // to start the thread
        t2.start();
        System.out.println("The id of the thread is: "+ t1.threadId());
        System.out.println("The name of the thread is: "+t1.getName());
        
        System.out.println("The id of the thread is: "+ t2.threadId());
        System.out.println("The name of the thread is: "+t2.getName());
    }
}
