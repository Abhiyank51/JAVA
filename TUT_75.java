// Thread Methods


class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(i<600){
            System.out.println("Thank you ");
            try {
                Thread.sleep(455);   // thread t1 will be sleep for 455 millisecond 
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread{
    public void run(){
        int i = 0;
        while(i<600){
            System.out.println("namaste");
            i++;
        }
    }
}

public class TUT_75 {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        // if you want that t2 does not start until t1 is not finished
        // try{
        //     t1.join();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        t2.start();
    }
}
