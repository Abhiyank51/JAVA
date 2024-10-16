// File Handling in Java 

/*
Reading from & writing is an important aspect of any programming language

We can use the File class in Java to create a file object

* createNewFile() mehtod -> creates a file 
* For reading files we can use the same Scanner class and supply it a 
    file object
* To delete a file in Java we can use File object delete() method
*/

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

public class TUT_111 {
    public static void main(String[] args) {

        // Code to create a new file
        // File myFile = new File("Abhiyank111.txt");
        // try {
        //     myFile.createNewFile();
        // } catch (IOException e) {
        //     System.out.println("Unable to create this file");
        //     e.printStackTrace();
        // }

        // code to write to a file
        // try{
        //     FileWriter myFileWriter = new FileWriter("Abhiyank111.txt");
        //     myFileWriter.write("This is our first file from this java course\n ok now byy");
        //     myFileWriter.close();
        // }
        // catch(IOException e){
        //     e.printStackTrace();
        // }


        // reading a file 
        // File myFile = new File("Abhiyank111.txt");
        // try {
        //     Scanner sc = new Scanner(myFile);
        //     while (sc.hasNextLine()) {
        //         String line = sc.nextLine();
        //         System.out.println(line);
        //     }
        //     sc.close();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

        // Deleting the file
        // File myFile = new File("Abhiyank111.txt");
        // if(myFile.delete()){
        //     System.out.println("I hav deleted "+ myFile.getName());
        // }
        // else{
        //     System.out.println("Some problem occured while deleting the file");
        // }
    }
}
