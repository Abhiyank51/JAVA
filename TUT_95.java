// HashSet in Java 

import java.util.HashSet;

public class TUT_95 {
    public static void main(String[] args) {
        // initial HashSet capacity is 16 we can also change it by writing in method 
        // you can add both initial capacity and load factor in bracket 
        // HashSet<Integer> myHashSet = new HashSet<>();
        // load factor is float you have to define its datatype here other wise give error 
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(19);
        // 11 will add only one time because Hashset is a type of set that contains only unique elements
        // no similar elements are allowed in set or Hashset 
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);
        // easy in searchine element as compared to array as use hashing technique 
    }
}
