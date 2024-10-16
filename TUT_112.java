// PRACTICE SET 
/*
Q.1 Create javadoc from a java program using and without using 
Intellij idea
Q.2 Create alass and add a method with deprecated annotation. What 
is its effect on program execution.
Q.3 Suppress the generated warning form 2
Q.4 Create an interface and generate an instance from it.
Q.5 Write a program to generate multiplication table of a given number
and write it to a file.
Q.6 Repeat 5 with numbers from 2-9 and save all these multiplication 
tables to a folder.
*/


// ANS 2
// class MyDeprecated{
//     @Deprecated
//     void meth1(){
//         System.out.println("I am method 1");
//     }
// }

// public class TUT_112 {
//     public static void main(String[] args) {
//         MyDeprecated d = new MyDeprecated();
//         d.meth1();
//     }
// }



// ANS 4
// interface MyInt{
//     void display();
// }

// public class TUT_112 {
//     public static void main(String[] args) {
//         MyInt i = () -> System.out.println("I am display");
//         i.display();
//     }
// }


// ANS 5
import java.io.FileWriter;
import java.io.IOException;

public class TUT_112 {
    public static void main(String[] args) {
        int i = 19;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}