// Exercise and Practice Questions on Inheritance
/*
Q.1 Create a class circle and use inheritance to create another class 
cylinder from it.
Q.2 Create a class rectangle and use inheritance to create another class cuboid.Try to keep it as close to real world scenarion if possible.
Q.3 Create methods for area and volume in 1
Q.4 Create methods for area and volume in 2. Also create getters and setters
Q.5 What is the order of constructor execution for the following ineritance hierarchy.
                   Base
                    |
                    |
                 Derived1
                    |
                    |
                 Derived2
Derived2 obj = new Derived2();
Which constructor(s) will be executed & in what order?
*/


// ANS 1
// class Circle{
//     public int radius;

//     public double area(){
//         return Math.PI * radius * radius;
//     }
//     // Constructor
//     Circle(int r){
//         System.out.println("I am circle parameterized constructor");
//         radius = r;
//     }
// }
// // inherited cylinder class
// class Cylinder extends Circle{
//     // Constructor
//     Cylinder(int r, int h){
//         // radius = r;
//         // height = h;
//         super(r);
//         System.out.println("I am cylinder parameterized constructor");
//         height = h;
//     }
//     public int height;
//     public double volume(){
//         return Math.PI * radius * radius * height;
//     }
// }
// public class TUT_52 {
//     public static void main(String[] args) {
//         // Circle objc = new Circle(12);
//         Cylinder obj = new Cylinder(12,4);
//     }
// }



// ANS 2
// Create a class rectangle and use inheritance to create another class cuboid.

// import java.util.Scanner;


// class Rectangle{
//     int length;
//     int bredth;
//     int width;
//     // public void setParameters(){
//     //     Scanner sc = new Scanner(System.in);
//     //     System.out.print("Enter the length of rectangle: ");
//     //     length = sc.nextInt();
//     //     System.out.print("Enter the bredth of rectangle: ");
//     //     bredth = sc.nextInt();
//     //     System.out.print("Enter the width of rectangle: ");
//     //     width = sc.nextInt();
//     //     sc.close();
//     // }
//     public void setlength_bredth(int l, int b){
//         length = l;
//         bredth = b;
//     }
//     public void  perimeter(){
//         int perimeter =  2*(length + bredth);
//         System.out.println("The perimeter of rectangle with length "+length+ " and bredth "+ bredth+ " is "+perimeter);
//     }
//     public void area(){
//         int area =  length*bredth;
//         System.out.println("The perimeter of rectangle with length "+length+ " and bredth "+ bredth+ " is "+area);
//     }
// }


// class Cuboid extends Rectangle{
//     // Scanner sc = new Scanner(System.in);
//     // int height = sc.nextInt();
//     int height;

//     public void setheight(int h){
//         height = h;
//     }

//     public int volume(){
//         System.out.println("Volume of cuboid is: ");
//         return length*bredth*height;
//     }
//     public void area(){
//         System.out.println("Area of cuboid is: ");
//         int area =  2*(length*bredth + bredth*height + height*length);
//         System.out.println("The perimeter of rectangle with length "+length+ " and bredth "+ bredth+"ans height "+height+ " is "+area);
//     }
// }

// public class TUT_52{
//     public static void main(String[] args) {
//         Rectangle Rect = new Rectangle();
//         // Rect.setParameters();
//         Rect.setlength_bredth(5,7);
//         Rect.perimeter();
//         Rect.area();

//         Cuboid cuboid = new Cuboid();
//         cuboid.setheight(7);
//         cuboid.volume();
//         cuboid.area();
//     }
// }




// ANS 5
// Order is same as in absence of any super keyword in any of the deived class 
// If super keyword exist than according to it the order will change 
// BASE ---> DERIVED1---->DERIVED2