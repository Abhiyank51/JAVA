// Thread priorities.
/*
Types of priorities
MIN_PRIORITY = 1
NORM_PRIORAITY = 5
MAX_PRIORITY = 10 
*/


class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<600){
            System.out.println("Thank you "+this.getName());
            i++;
        }
    }
}

public class TUT_74 {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Abhiyank");
        MyThr1 t2 = new MyThr1("Bharat");
        MyThr1 t3 = new MyThr1("Anshul");
        MyThr1 t4 = new MyThr1("Harsh (MOST IMPORTANT)");     // suppose it is most important
//                                                    so we have to increase its priority
        MyThr1 t5 = new MyThr1("Prakhar");
        t4.setPriority(Thread.MAX_PRIORITY);    // Giving t4 the max priority
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
