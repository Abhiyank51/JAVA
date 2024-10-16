// PRACTICE SET
/*
Q.1 Create an abstract class pen with methods write() and refill()
    as abstract methods
Q.2 Use the pen class from Q1 to create a concrete class FountainPen 
    with additional method changeNib()
Q.3 Create a class Monkey with jump() and bite() methods, Create a class human which 
    inherits this Monkey class and implements BasicAnimal interface with eat() and sleep() methods.
Q.4 Create a class TelePhone with ring(),lift() and disconnect() methods as abstract methods 
    Create another class SmartTelephone and demonstrate polymorphism
Q.5 Demonstrate polymorphism using monkey class from Q3
Q.6 Create an Interface TVRemote and use it to inherit another interface SmartTVRemote.
Q.7 Create a class TV which implements TVRemote interface form Q6
)
*/

//ANS 1 
// abstract class pen{
//     abstract public void Write();
//     abstract public void Refill();
// }
// class newpen extends pen{
//     public void Write(){
//         System.out.println("Now we are writing...");
//     }
//     public void Refill(){
//         System.out.println("We are re-filling....");
//     }
// }
// public class TUT_60 {
//     public static void main(String[] args) {
//         pen p = new newpen();
//         p.Write();
//         p.Refill();
//     }
// }


// ANS 2
// abstract class pen{
//     abstract public void Write();
//     abstract public void Refill();
// }
// class FountainPen extends pen{
//     public void ChangeNib(){
//         System.out.println("Changing NIB ....");
//     }
//     public void Write(){
//         System.out.println("Now we are writing...");
//     }
//     public void Refill(){
//         System.out.println("We are re-filling....");
//     }
// }
// public class TUT_60 {
//     public static void main(String[] args) {
//         FountainPen p = new FountainPen();
//         p.Write();
//         p.Refill();
//         p.ChangeNib();
//     }
// }



// ANS 3
// class Monkey{
//     public void jump(){
//         System.out.println("Jumping....");
//     }
//     public void bite(){
//         System.out.println("Biting....");
//     }
// }
// interface BasicAnimal{
//     public void eat();
//     public void sleep();
// }

// class Human extends Monkey implements BasicAnimal{
//     public void sleep(){
//         System.out.println("Sleeping");
//     }
//     public void eat(){
//         System.out.println("Eating...");
//     }
//     public void speak(){
//         System.out.println("Sleeping");
//     }
// }
// public class TUT_60 {
//     public static void main(String[] args) {
//         Human h = new Human();
//         h.bite();
//         h.speak();
//         h.eat();
//         h.jump();

//         // Polymorphism for ques 5 use Human as monkey just like using phone as camera.
//         Monkey m1 = new Human();
//         m1.bite();
//         m1.jump();
//         // m1.speak();  // Not possible as monkey cant speak
//         // -> cannot use speak method because the reference is monkey which does not have speak method

//         // Here vasic animal can only eat and sleep
//         BasicAnimal b = new Human();
//         b.eat();
//         b.sleep();
//         // b.speak();  -> give error as speak method is not made for it 
//     }
// }


// ANS 4
// abstract class TelePhone{
//     abstract public void ring();
//     abstract public void lift();
//     abstract public void disconnect();
// }

// class SmartTelephone extends TelePhone{
//     public void ring(){
//         System.out.println("Ringing....");
//     }
//     public void lift(){
//         System.out.println("Lifting...");
//     }
//     public void disconnect(){
//         System.out.println("Disconnecting the call.....");
//     }
// }
// public class TUT_60 {
//     public static void main(String[] args) {
//         // Demonstrating polymorphism as here we use SmartTelephone as a Telephone
//         TelePhone phone = new SmartTelephone();
//         phone.disconnect();
//         phone.lift();
//         phone.ring();
//     }
// }

//  For ans five uncomment see in ans 3 code
// ANS 5


// ANS 6
// interface TVRemote{
//     void Change_channel();
//     void volume_up_down();
// }
// interface SmartTVRemote extends TVRemote{
//     void Smart_Control();
//     void Smart_screen();
// }
// class TV implements SmartTVRemote{
//     public void Change_channel(){
//         System.out.println("Changing channel..");
//     }
//     public void volume_up_down(){
//         System.out.println("Volume ++++ / Volume ----");
//     }
//     public void Smart_Control(){
//         System.out.println("Smart control");
//     }
//     public void Smart_screen(){
//         System.out.println("Smart screen");
//     }
// }
// public class TUT_60{
//     public static void main(String[] args) {
//         TV Television = new TV();
//         Television.Change_channel();
//         Television.volume_up_down();
//         Television.Smart_Control();
//         Television.Smart_screen();
//     }
// }

// ANS 7 already done in ANS 6