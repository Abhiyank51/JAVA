// Practice set

/*
Q.1 Create a class cylinder and use getters and setters to set its 
radius and height
Q.2 Use 1 to calculate surface area and volume of the cylinder
Q.3 Use a constructor and repeat 1
Q.4 Overload a constructor to initialize a rectangle of length 4 and bredth 5\
for using custom parameters
Q.5 Repeat 1 for sphere
*/

//  ANS 1

// class cylinder{
//     private int radius;
//     private int height;
//     public void setRadius_height(int r,int h){
//         radius = r;
//         height = h;
//     }
//     public int getRadius(){
//         return radius;
//     }
//     public int getHeight(){
//         return height;
//     }
// }
// public class TUT_44 {
//     public static void main(String[] args) {
//         cylinder A = new cylinder();
//         A.setRadius_height(5,4);
//         System.out.println("Radius of cylinder is "+ A.getRadius());
//         System.out.println("Height of cylinder is "+ A.getHeight());
//     }
// }



// ANS 2

// class cylinder{
//     private int radius;
//     private int height;
//     public void setRadius_height(int r,int h){
//         radius = r;
//         height = h;
//     }
//     // public int getRadius(){
//     //     return radius;
//     // }
//     // public int getHeight(){
//     //     return height;
//     // }
//     float pi = 3.14f;
//     public void surfacearea(){
    // Write Mths.PI instead of pi
//         float area = 2.f * pi *radius*height;
//         System.out.println("Area with radius "+radius+" and height "+height+" is "+area);
//     }
//     public void volume(){
//         float volume = pi*radius*radius*height;
//         System.out.println("Volume with radius "+radius+" and height "+height+" is "+volume);
//     }   
// }
// public class TUT_44{
//     public static void main(String[] args) {
//         cylinder A = new cylinder();
//         A.setRadius_height(4,5);
//         A.surfacearea();
//         A.volume();
//     }
// }



// ANS 3

// class cylinder{
//     private int radius;
//     private int height;

//     // public void setRadius_height(int r,int h){
//     //     radius = r;
//     //     height = h;
//     // }
//     public int getRadius(){
//         return radius;
//     }
//     public int getHeight(){
//         return height;
//     }
//     // Constructor
//     public cylinder(int r, int h){
//         radius = r;
//         height = h;
//     }
// }
// public class TUT_44 {
//     public static void main(String[] args) {
//         // cylinder A = new cylinder();

//         // By constructor help
//         cylinder A = new cylinder(4,5);
//         // A.setRadius_height(5,4);
//         System.out.println("Radius of cylinder is "+ A.getRadius());
//         System.out.println("Height of cylinder is "+ A.getHeight());
//     }
// }


// ANS 4

// class rectangle{
//     int length;
//     int bredth;

//     public rectangle(){
//         length = 4;
//         bredth = 5;
//     }
//     public rectangle(int l, int b){
//         length = l;
//         bredth = b;
//     }
//     public int getlength(){
//         return length;
//     }
//     public int getbredth(){
//         return bredth;
//     }
// }
// public class TUT_44 {
//     public static void main(String[] args) {
//         rectangle A = new rectangle(2, 3);
//         rectangle B = new rectangle();
//         System.out.println("The length of A is "+A.getlength());
//         System.out.println("The bredth of A is "+A.getbredth());
//         System.out.println("The length of B is "+B.getlength());
//         System.out.println("The bredth of B is "+B.getbredth());
//     }
// }


// ANS 5
class sphere{
    private int radius;
    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public float area(){
        return 4*3.14f*radius*radius;
    }
    public float volume(){
        return (4f/3f)*3.14f*radius*radius*radius;
    }
}
public class TUT_44 {
    public static void main(String[] args) {
        sphere A = new sphere();
        A.setRadius(5);
        System.out.println("Radius of sphere is "+ A.getRadius());
        float area = A.area();
        float volume = A.volume();
        System.out.println("Area of spher is: "+area);
        System.out.println("Volume of sphere is:"+volume);
    }
}