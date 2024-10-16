// Practice set on arrays

/*
Q.1 Create an array of 5 floats and calculate their sum.
Q.2 Write a program to find out whether a given integer is
present in an array or not.
Q.3 Calculate the average marks form an array containing marks of all students
in physics using for-each loop.
Q.4 Create a java program to add two matrices of size 2 X 3.
Q.5 Write a java program to reverse an array
Q.6 Write a java program to find the maximum element in an array
Q.7 Write a java program to find the minimum element in an array
Q.8 Write a java program to find whether an array is sorted or not.
*/

// import java.util.Scanner;
public class TUT_29 {
    public static void main(String[] args) {
        // ANS 1
        // int [] array = {1,2,3,4,7};
        // int sum = 0;
        // for (int i = 0; i <array.length; i++) {
        //     sum += array[i];
        // }System.out.println(sum);


        // ANS 2
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int n = sc.nextInt();
        // boolean present = false;
        // int [] array = {1,2,3,4,5,6};
        // for (int i=0; i<array.length; i++) {
        //     if(array[i] == n){
        //         present = true;
        //         break;
        //     }
        // }
        // if(present){
        //     System.out.println("YES PRESENT");
        // }
        // else{
        //     System.out.println("NOT PRESENT");
        // }
        // sc.close();


        // ANS 3
        // float [] marks = {79.f,45.f,89.f,99.f,87.f,54.f,56.f};
        // for (float i : marks) {
        //     int sum = 0;
        //     for (int j = 0; j <marks.length; j++) {
        //         sum += marks[j];
        //     }
        //     float average = sum/marks.length;
        //     System.out.println(average);
        // }


        // ANS 4
        // int [][] matrix1;
        // matrix1 = new int[2][3];
        // int [][] matrix2;
        // matrix2 = new int[2][3];

        // // Elements in matrix 1
        // matrix1[0][0] = 1;
        // matrix1[0][1] = 2;
        // matrix1[0][2] = 3;
        // matrix1[1][0] = 4;
        // matrix1[1][1] = 5;
        // matrix1[1][2] = 6;

        // // Elements in matrix 2
        // matrix2[0][0] = 1;
        // matrix2[0][1] = 2;
        // matrix2[0][2] = 3;
        // matrix2[1][0] = 4;
        // matrix2[1][1] = 5;
        // matrix2[1][2] = 6;

        // int [][] newmatrix = new int[2][3];

        // System.out.println("Sum of matrices is");
        // for (int i = 0; i < 2; i++) {
        //     for(int j = 0; j< 3; j++){
        //         newmatrix[i][j] = matrix1[i][j] + matrix2[i][j];
        //         System.out.print(newmatrix[i][j] + " ");
        //     }System.out.print("\n");
        // }


        // ANS 5 
        // int [] array = {1,2,3,4,5};
        // for (int i = array.length-1; i>=0; i--) {
        //     System.out.print(array[i]);
        //     System.out.print(" ");
        // }

        // ANS 6
        // int [] array = {1,2,3,4,5};
        // int max = array[0];
        // for (int i = 1; i < array.length; i++) {
        //     if(array[i]>max){
        //         max = array[i];
        //     }
        // }System.out.println(max);


        // ANS 7
            // int [] array = {1,0,3,4,5};
            // int min =array[0];
            // for (int i = 0; i < array.length; i++) {
            //     if(array[i]<min){
            //         min = array[i];
            //     }
            // }System.out.println(min);


        // ANS 8
        // int [] array = {3,1,4,2,5};    // Unsorted
        // int [] array2 = {1,2,3,4,5};   // Sorted
        // boolean sorted = true;
        // for (int i = 0; i <array2.length-1; i++) {
        //     if(array2[i]>array2[i+1]){
        //         sorted = false;
        //         break;
        //     }
        // }
        // if(sorted){
        //     System.out.println("Array is sorted");
        // }
        // else{
        //     System.out.println("Array is not sorted");
        // }
    }
}
