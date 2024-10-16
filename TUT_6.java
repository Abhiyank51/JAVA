/*
Ques: Write a program to calculate percentage of a given student
in CBSE board exam. His marks from 5 subjects must be taken as input from
the keyboard(Marks are out of 100).
 */

 import java.util.Scanner;

 public class TUT_6 {
     public static void main(String args[]){
        Scanner marks = new Scanner(System.in);
        System.out.print("Enter marks in Sub1: ");
        int marks1 = marks.nextInt();
        System.out.print("Enter marks in Sub2: ");
        int marks2 = marks.nextInt();
        System.out.print("Enter marks in Sub3: ");
        int marks3 = marks.nextInt();
        System.out.print("Enter marks in Sub4: ");
        int marks4 = marks.nextInt();
        System.out.print("Enter marks in Sub5: ");
        int marks5 = marks.nextInt();
        float sum = marks1+marks2+marks3+marks4+marks5;
        float TotalMarks = 500;
        float precentage = (sum/TotalMarks)*100;
        System.out.print("THe percentage of student is: ");
        System.out.println(precentage);
        marks.close();
     }
 }
 