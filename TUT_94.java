// Hashing Technique in Java
// Hashing is a technique that converts the key value pair in form of indices.
/*
Suppose we have the elements x - 72, 39, 11, 18
to get their indexes in array of size 10 we perform x%10 operation of this 
where x is the elements to insert 
so 72%10 = 2 (index)
   39%10 = 9(index)
   11%10 = 1 (index)
   18%10 = 8(index) 
   on these index the particular elements are inserted 

    |   | 11 | 72 |   |   |   |   |   | 18 | 39 |
     0    1    2    3   4   5   6   7    8    9  

    you have to insert some empty spaces in your hash table do if two numbers have 
    same index in x%10 so it can go to that empty index if such situation occurs this is known as hash collision.

    Hash collision is the situation in which the elements that should add to the hash table
    has been assign with same index so this can produce triule to handle collision
    open addressing and chaining technique are used 

    this is open addression technique use to handle collision  --> 
    insert element on next empty space to the element through which it is colliding on same index 


    // Another technique to handel collision is chaining
    -> in this technique the elements that assign same indeces are inserted in linked list that points to that index
    on which both the elements want to insert 

    classes mostly used in java
    1. Hashset
    2. Hashmap
    3. LinkedHashmap
    4. HashTable 
*/


public class TUT_94 {
    public static void main(String[] args) {
        
    }
}
