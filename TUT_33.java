// Variable arguments(VarArgs) in Java

public class TUT_33 {
    // static int sum(int a, int b){
    //     return a+b;
    // }
    // static int sum(int a, int b, int c){
    //     return a+b+c;
    // }
    // static int sum(int a, int b, int c, int d){
    //     return a+b+c+d;
    // }

    // We dont have to write these much method instead of this we use
    // triple dot used in varags here all arguments give to sum methods in main function are packed to an array
    static int sum(int ...arr){
        // Available as int[] arr;
        int result = 0;
        for (int a : arr) {
            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varags tutorial");
        // Here for every addition contains more elements we have to make a new method
        // to make it simpler or to resolve this problem we use varags

        // It become an empty array now return 0
        System.out.println("The sum of nothing is: "+sum());
        
        System.out.println("The sum of 4 and 5 is: "+ sum(4,5));
        System.out.println("The sum of 4 ,3 and 5 is: "+ sum(4,3,5));
        System.out.println("The sum of 4 ,3 ,5 and 6 is: "+ sum(4,3,5,6));
    }
}
