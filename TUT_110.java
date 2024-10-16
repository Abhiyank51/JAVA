import java.util.ArrayList;

// Making a generic class

// in generic we supply classes to already defined classes
class Mygeneric<T1>{
    int val;
    private T1 t1;
    public Mygeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }
    public T1 getT1() {
        return t1;
    }
    public void setT1(T1 t1) {
        this.t1 = t1;
    }
    
}
public class TUT_110 {
    public static void main(String[] args) {
        // ArrayList aList = new ArrayList<>();
        ArrayList<Integer> aList = new ArrayList<>();
        // aList.add("str1");
        aList.add(54);
        aList.add(476);

        // typecasting -> (int)
        // int a = (int) aList.get(2);

        // now do not need to write (int) beacuse we declare ArrayList as integer
        int a = aList.get(2);
        System.out.println(a);

        // Mygeneric<String> g1 = new Mygeneric(23, "Mystring");
        // String str = g1.getT1();
        // System.out.println(str);
 
    }
}
