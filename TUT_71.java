// Making thread by METHOD 2
// By using implement  Runnable interface

class MyThreadRunnable1 implements  Runnable{
    public void run(){
        System.out.println("I am thread1 ");
    }
}

class MyThreadRunnable2 implements  Runnable{
    public void run(){
        System.out.println("I am thread2 ");
    }
}

public class TUT_71 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);  // this code is needed to run the start method 
        // just like without bullets gun is of no use as without thread object it should not implemennt Thread methods

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

        // bullet 1 and bullet 2 in Thread() is a runnable you given to Thread
    }
}


/*
LIFE CYCLE OF A THREAD 
    1->2->3->4->5
                      ------Non Runnable------
                      |      (Blocked)        /\
                      |         (4)           |
                      \/                      |
    RUN(1)   ->    RUNNABLE(2)   ->        RUNNING(3)    ->   TERMINATE(5)


1. New -> Instance of thread created which is not yet started by invokin start()
2. Runnable -> After invocation of start() & before it is selected to be
run by the scheduler
3. Running -> After thread scheduler has selected it.
4. Non Runnable -> Thread alive, not eligible to run
5. Terminated -> num() method has exitted
*/