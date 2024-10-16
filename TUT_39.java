// Practice set 

/*
Q.1 Create a class Employee with following properties
Salary(property)(int)
getSalary(mathod returning int)
name(property)(string)
gatName(method returning string)
setName(method Changing name)
Q.2 Create a class cellphone with methods to print "ringing...","vibrating..."etc.
Q.3 Create a class square with a method to initialize its side, calculate area, perimeter etc.
Q.4 Create a class rectangle and repeat 3 
Q.5 Create a class TommyVecetti for Rockstar Games capable of hitting
(print hitting....),runnig, firing etc.
Q.6 Repeat 4 for circle
*/



// ANS 1
// class Employee{
//     String name;
//     int Salary;
//     public int getSalary(){
//         return Salary;
//     }
//     public void setName(String n){
//         name = n;
//     }
//     public String getName(){
//         return name;
//     }
// }

// public class TUT_39 {
//     public static void main(String[] args) {

//         Employee Abhiyank = new Employee();

//         Abhiyank.setName("Abhiyank Yadav");
//         System.out.println(Abhiyank.getName());

//         Abhiyank.Salary = 100000;
//         System.out.println(Abhiyank.getSalary());
//     }
// }




// ANS 2
// class cellphone{
//     public void ring(){
//         System.out.println("Ringing....");
//     }
//     public void vibrate(){
//         System.out.println("Vibrating....");
//     }
//     public void CallFriend(){
//         System.out.println("Calling friend....");
//     }
// }
// public class TUT_39{
//     public static void main(String[] args) {
//         cellphone samsung = new cellphone();
//         samsung.vibrate();
//         samsung.ring();
//         samsung.CallFriend();
//     }
// }


// ANS 3
// class Square{
//     int side;
//     public int area(){
//         return side*side;
//     }
//     public int perimeter(){
//         return 4*side;
//     }
// }
// public class TUT_39{
//     public static void main(String[] args) {
//         Square sq = new Square();
//         sq.side = 4;
//         System.out.println(sq.area());
//         System.out.println(sq.perimeter());
//     }
// }


// ANS 4 
// class rectangle{
//     int length;
//     int bredth;
//     public int area(){
//         return length*bredth;
//     }
//     public int perimeter(){
//         return 2*(length+bredth);
//     }
// }
// public class TUT_39{
//     public static void main(String[] args) {
//         rectangle rect = new rectangle();
//         rect.length = 5;
//         rect.bredth = 3;
//         System.out.println(rect.area());
//         System.out.println(rect.perimeter());
//     }
// }



// ANS 5 
// class TommyVecetti{
//     public void hit(){
//         System.out.println("Hitting....");
//     }
//     public void Run(){
//         System.out.println("Running...");
//     }
//     public void Fire(){
//         System.out.println("Firing...");
//     }
// }
// public class TUT_39{
//     public static void main(String[] args) {
//         TommyVecetti Rockstar_Games = new TommyVecetti();
//         Rockstar_Games.hit();
//         Rockstar_Games.Run();
//         Rockstar_Games.Fire();
//     }
// }


// ANS 6
// class circle{
//     int radius;
//     double pi = 3.14;
//     public double area(){
//         return 3.14 * radius*radius;
//     }
//     public double perimeter(){
//         return 2*3.14*radius;
//     }
// }
// public class TUT_39{
//     public static void main(String[] args) {
//         circle cir = new circle();
//         cir.radius = 5;
//         System.out.println(cir.area());
//         System.out.println(cir.perimeter());
//     }
// }
