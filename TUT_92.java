// Linked list in java

import java.util.*;

public class TUT_92 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();


        // most of the methods of linked list and array list are similar
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

        // LINKEDLIST addlast(), addFirst() method 
        l1.addLast(10);
        l1.addFirst(25);

        System.out.println(l1.contains(43));

        // returns index of the inputed element 
        System.out.println(l1.indexOf(4));

        System.out.println(l1.lastIndexOf(6));

        // printing the array 
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}
 