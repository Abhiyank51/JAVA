// ArrayList In Java: Demo & Methods 

import java.util.*;     // import all packages of java 
public class TUT_91 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        // make another array and set it's initial capacity to 5
        ArrayList<Integer> l2 = new ArrayList<>(5);

        // adding elements in array list l1
        l1.add(6);
        l1.add(2);
        l1.add(4);
        l1.add(5);
        l1.add(3);
        // add 6 at index 0
        l1.add(0,6);
        // add 1 on index 0
        l1.add(0,1);

         // adding elements in array list l2
        l2.add(4);
        l2.add(15);
        l2.add(9);

        // adding l2 to l1 (addAll) function
        l1.addAll(l2);  // add from ending

        // if want to add from beginning or any particular index type index in brackets
        // l1.addAll(0,l2);


        // l1.clear();  // remove all the elements of an array

        // to check if particular element is present in the array or not 
        // using contains() method returns true or false
        System.out.println(l1.contains(43));

        // returns index of the inputed element 
        System.out.println(l1.indexOf(4));

        // if we have two same elements in aray as 6 and another 6
        // index of method returns the first element index 
        // if you want to returns second 6 element index then use this
        System.out.println(l1.lastIndexOf(6));

        // remove element of the array by providing index number 
        l1.remove(5);

        // set method() -> set 566 on index 1 
        l1.set(1, 566);

        // printing the array 
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}
