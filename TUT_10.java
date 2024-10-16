// Data types of Expressions & Increment/Decrement Operators

public class TUT_10 {
    public static void main(String[] args) {
        // int a = 654 + 6;  // whats the datatype of this expression - int
        // float b = 6.54f + 4; //  - float

    /* 
        b = byte,f = float, s = short, d = double, i = integer, c = character, l = long
        R = b+s -> int
        R = s+i -> int
        R = l+f -> float
        R = i+f -> float
        R = c+i -> int
        R = c+s -> int
        R = l+d -> double
        R = f+d -> double
    */
    // byte x = 5;
    // int y = 6;
    // short z = 8;
    // int a = y+z;  // return int
    // float b = 6.45f + x; // return float
    // System.out.println(b);

    // Increment/Decrement operator
    // a++, ++a = Increment operator
    // a--, --a = Decrement operator
    // These are operate on all data types except boolean

    int i = 56;
    System.out.println(i++);  // first print then increment
    System.out.println(i);
    System.out.println(++i);  // first increment then print
    System.out.println(i);

    int y = 7;
    int x = ++y * 8;
    System.out.println(x);

    char a =  'B';
    char t = a++;
    System.out.println(t);
    System.out.println(a); // B increment to C
    }
}
