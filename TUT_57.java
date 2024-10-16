// Default methods in java

// Making interfaces
interface Camera{
    void takePicture();
    void recordVideo();
}

interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);

    private void greet(){
        System.out.println("Good morning");
    }
    
    // Default methods 
    // With this default method now we dont need to write again a recordvideo method in interface
    // as interface give error if we not implement the given method but this is solve with help of default methods
    default void recordVideo(){
        greet();
        System.out.println("Recording video as a default function of interface class");
    }
}
// Making a class
class MyCellPhone{
    void callNumber(int phonenumber){
        System.out.println("Calling "+phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
// here we make mysmartphone with help of mycellphone that implements methods like wifi and camera with help of interface
class MySmartPhone extends MyCellPhone implements wifi, Camera{
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
}

public class TUT_57 {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.recordVideo();
        // ms.greeet();  // give error as greet is a private method
        String[] st = ms.getNetworks();
        for (String item  : st) {
            System.out.println(item);
        }
    }
}
