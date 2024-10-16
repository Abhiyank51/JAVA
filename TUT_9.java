// Associativity/Precedence of operators in Java

public class TUT_9 {
    public static void main(String[] args) {
        // Precedence and associativity
        // (+.-) has less Precedence then (*,/)
        // int a = 6*5-34/2;
        /*
        = 30-34/2
        = 30-17
        = 13
         */

        // here precedence of / and * are equel so here we check associativoty of them
        // associativity of / and * is left to right

        // int b = 60/5-34*2;
        /*
        = 12 - 34*2
        = 12-68
        = -56
         */

        // System.out.println(a);
        // System.out.println(b);

        // Quick Quiz
        // Writing expressions
        // (x-y)/2 , ((b**2)-4*a*c)/2*a, ((v**2)-(u**2)) , (a*b)-d

        // int x = 6;
        // int y = 1;
        // int k = x * y/2;
        int b = 1;
        int c = 4;
        int a = 5;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);
    }
}
