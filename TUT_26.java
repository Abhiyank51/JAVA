// Arrays in java

public class TUT_26 {
    public static void main(String[] args) {

        // Array make name marks
        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 70;
        marks[2] = 77;
        marks[3] = 90;
        marks[4] = 89; 
        // we can also overwrite the elements in an array
        // as now value of marks[4] is 80
        marks[4] = 80;  
        System.out.println(marks[4]);


        // 3 Ways to make an array

        // int [] marks;          <- Declaration
        // marks = new int[5];    <- Memory allocation

        // int [] marks = new int[5];    <- Declaration + memory allocation

        // int [] marks = {100,70,88,85,89}  <- Declare + initialize
    }
}
