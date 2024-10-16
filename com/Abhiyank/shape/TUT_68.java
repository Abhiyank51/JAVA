// Creating a custom package 

/*
You have to create a package named com.Abhiyank.shape
This package should have individula classes for Rectangle, Square, Circle, Cylinder, Sphere
These classes chould use inheritance to properly manage the code
Include methods like volume, surface area and getters/setters for dimensions.
*/

package com.Abhiyank.shape;

class shape{
    int radius; 
    int length;
    int bredth;
    int side;
    int height;

    public void setRadius(int r){
        radius = r;
    }
    public void setLength(int l){
        length = l;
    }
    public void setBredth(int b){
        bredth = b;
    }
    public void setgheight(int h){
        height = h;
    }
    public void setSide(int s){
        side = s;
    }
} 

class Rectangle extends shape{
    public int area(){
        return length*bredth;
    }
    public int perimeter(){
        return 2*(length + bredth);
    }
}

class Square extends shape{
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Circle extends shape{
    public float area(){
        return 3.14f * radius * radius;
    }
    public float circumference(){
        return 2 *3.14f*radius;
    }
}
class Cylinder extends shape{
    public float area(){
        return 2f *3.14f*radius*height + 2*3.14f*radius*radius;
    }
    public float volume(){
        return 3.14f * radius * radius * height;
    }
}
class Sphere extends shape{
    public float area(){
        return 4f * 3.14f * radius;
    }
    public float voulme(){
        return 1.33f * 3.14f * radius* radius * radius;
    }
}

public class TUT_68 {
    public static void main(String[] args) {
        Cylinder ch = new Cylinder();
        System.out.println("Area and volume of cylinder");
        ch.setRadius(5);
        ch.setgheight(6);
        System.out.println(ch.area());
        System.out.println(ch.volume());

        Rectangle Rect = new Rectangle();
        System.out.println("Area and volume of rectangle");
        Rect.setBredth(3);
        Rect.setLength(4);
        System.out.println(Rect.area());
        System.out.println(Rect.perimeter());

        Circle circ = new Circle();
        System.out.println("Area and circumference of circle");
        circ.setRadius(5);
        circ.setgheight(6);
        System.out.println(circ.area());
        System.out.println(circ.circumference());

        Sphere sph = new Sphere();
        System.out.println("Area and volume of sphere");
        sph.setRadius(5);
        System.out.println(sph.area());
        System.out.println(sph.voulme());

        Square sq = new Square();
        System.out.println("Area and volume of square");
        sq.setSide(4);
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
