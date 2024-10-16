// Relational and logical operators in java

public class TUT_17 {
    public static void main(String[] args) {

        // && AND OPERATOR
        System.out.println("For logical AND....");
        // both value have to be true to return true in and
        boolean a = true;
        boolean b = false;
        // boolean b = true;
        boolean c = true;
        if(a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }


        // OR || OPERATOR
        System.out.println("For logical or....");
        // Any value is true return true
        if(a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }


        // NOT ! OPERATOR
        // true become false, false become true
        System.out.println("For logical NOT....");
        System.out.println("NOT(a) is ");
        System.out.println(!a);
        System.out.println("NOT(b) is ");
        System.out.println(!b);
    }
}
