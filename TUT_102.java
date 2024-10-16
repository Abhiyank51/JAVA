//PRACTICE SET 
/*
Q.1 Create an ArrayList and store names of 10 students inside it. Print it 
using for-each loop.
Q.2 Use the Date class in Java to print time in the following format:
21:47:02
Q.3 Repeat 2 using calender class
Q.4 Repeat 2 using java.time API
Q.5 Create a set in Java . try to store duplicate elements inside this set 
and verify that only one instance is stored in it.
*/



// ANS 1
// import java.util.ArrayList;
// import java.util.Scanner;


// public class TUT_102 {
//     public static void main(String[] args) {
//         ArrayList<String> arr = new ArrayList<>();
//         // for (int i = 0; i <10; i++) {
//         //     Scanner sc = new Scanner(System.in);
//         //     System.out.println("Enter the name");
//         //     String name = sc.nextLine();
//         //     System.out.println(name);
//         //     sc.close();
//         // }
//         // arr.add("Abhiyank");
//         // arr.add("Abhiyank");
//         // arr.add("Abhiyank");
//         // arr.add("Abhiyank");
//         // arr.add("Abhiyank");
//         // arr.add("Abhiyank");
//         // arr.add("Abhiyank");
//         // arr.add("Abhiyank");
//         // arr.add("Abhiyank");
//         // arr.add("Abhiyank");

//         Scanner scanner = new Scanner(System.in);
//         for (int i = 0; i < 10; i++) {
//             System.out.println("Enter the name");
//             String name = scanner.nextLine();
//             arr.add(name);
//         }
//         scanner.close();

//         for (String sc : arr) {
//             System.out.print(sc);
//             System.out.print(",");
//         }
//     }
// }




// ANS 2

// import java.sql.Date;
// import java.sql.Time;

// public class TUT_102 {
//     public static void main(String[] args) {
//         Time d = new Time(System.currentTimeMillis());
//         System.out.println(d);
//     }
// }


// ANS 3

import java.util.Calendar;

public class TUT_102 {
    public static void main(String[] args) {
        Calendar calc = Calendar.getInstance();
        System.out.println(calc.getTime());
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ ":" + c.get(Calendar.MINUTE)+ ":" + c.get(Calendar.SECOND));
    }
}

// import java.util.Calendar;
// import java.text.SimpleDateFormat;

// public class TUT_102 {
//     public static void main(String[] args) {
//         // Create a Calendar instance
//         Calendar calendar = Calendar.getInstance();

//         // Get current time
//         // int hour = calendar.get(Calendar.HOUR_OF_DAY);
//         // int minute = calendar.get(Calendar.MINUTE);
//         // int second = calendar.get(Calendar.SECOND);

//         // Format the time
//         SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//         String formattedTime = sdf.format(calendar.getTime());

//         // Print the formatted time
//         System.out.println("Current Time: " + formattedTime);
//     }
// }




// ANS 4
// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;

// public class TUT_102 {
//     public static void main(String[] args) {
//         // LocalDate d = LocalDate.now();
//         // System.out.println(d);

//         LocalTime t = LocalTime.now();
//         System.out.println(t);

//         // LocalDateTime dt = LocalDateTime.now();
//         // System.out.println(dt);
//     }
// }



// ANS 5

// import java.util.HashSet;

// public class TUT_102 {
//     public static void main(String[] args) {
//         HashSet<Integer> s = new HashSet<>();
//         s.add(5);
//         s.add(9);
//         s.add(6);
//         s.add(9);     // 9 will come only one time in output 
//         System.out.println(s);
//     }
// }