
import java.util.Scanner;

public class NEW {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int i = scan.nextInt();
            Double d = scan.nextDouble();
            String s = scan.nextLine();

            // Write your code here.

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
    }
}