// For each loop in java and array declarations in various data types

public class TUT_27 {
    public static void main(String[] args) {
        // int [] marks = {98, 45, 79, 99, 80};
        // System.out.println(marks[1]);
        // // To find length of an array
        // System.out.println(marks.length);
        
        // Floating point array
        // float [] marksnew = {98.1f, 45.4f, 79.4f, 99.0f, 80.1f};
        // System.out.println(marksnew.length);
        // System.out.println(marksnew[2]);
        
        // // Array of string 
        // String [] students =  {"Abhiyank","Bharat","Harsh","Anshul"};
        // System.out.println(students[3]);
        // System.out.println(students.length);

        int [] marks = {98, 45, 79, 99, 80};
        // Display an array
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // In reverse order
        System.out.println("In reverse order");
        for (int i = marks.length-1; i >=0; i--) {
            System.out.println(marks[i]);
        }


        // For each loop (Display array)
        System.out.println("Using for each loop");
        for (int i : marks) {
            System.out.println(i);
        }
    }
}
