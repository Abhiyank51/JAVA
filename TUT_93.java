// Array Deque <-> Deque - Double ended queue
// Insertion and deletion shouls be perform from both ends from starting ans
// from ending also 

import java.util.ArrayDeque;

public class TUT_93 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();

        // adding element in ArrayDeque 
        ad1.add(3);
        ad1.add(5);
        ad1.add(7);

        // add elements at first
        ad1.addFirst(8);

        // to get first element 
        // System.out.println(ad1.getFirst());

        // // to get last element 
        // System.out.println(ad1.getLast());

        // printing the deque 
        for(Integer element : ad1){
            System.out.println(element);
        }
    }
}
