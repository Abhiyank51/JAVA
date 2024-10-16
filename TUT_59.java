// MOST IMPORTANT TOPIC ---- POLYMORPHISM


interface Camera1{
    void takePicture();
    void recordVideo();
}

interface wifi1{
    String[] getNetworks();
    void connectToNetwork(String network);

    private void greet(){
        System.out.println("Good morning");
    }
    default void recordVideo(){
        greet();
        System.out.println("Recording video as a default function of interface class");
    }
}

// Making a class
class MyCellPhone1{
    void callNumber(int phonenumber){
        System.out.println("Calling "+phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}

class MySmartPhone1 extends MyCellPhone1 implements wifi1, Camera1{
    public void takePicture(){
        System.out.println("Taking picture");
    }
    // we Overriding default function here 
    public void recordVideo(){
        System.out.println("Recoring started...");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of numbers");
        String[] networkList = {"Abhiyank","Bharat","Harsh","Anshul"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
    public void sampleMeth(){
        System.out.println("meth");
    }
}

public class TUT_59 {
    public static void main(String[] args) {
        Camera1 cam1 = new MySmartPhone1();  // this is a smartphone use it as a camera only sa need 
        // cam1.getNetworks();  not work/allowed 
        // cam1.meth();  // not allowed 
        cam1.recordVideo();  // allowed this can only use function of camera 
        MySmartPhone1 phone = new MySmartPhone1();  // we can use all methods on it 
        phone.recordVideo();
        phone.sampleMeth();
        phone.getNetworks();
        phone.connectToNetwork("abhiyank");
    }
}
