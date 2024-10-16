// Methods/Functions in java

// public class TUT_31 {
//     static int logic(int x, int y){
//         int z;
//         if(x>y){
//             z = x+y;
//         }
//         else{
//             z = (x+y)*5;
//         }
//         return z;
//     }
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 7;
//         int c = logic(a, b);
//         System.out.println(c);
//     }
// }


// Method invocation using object creation
public class TUT_31 {
    int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        // Without writing static , then we have to make a object to call the method
        TUT_31 obj = new TUT_31();
        int c = obj.logic(a, b);
        System.out.println(c);
    }
}