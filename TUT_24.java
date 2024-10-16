// Break and continue using loops

public class TUT_24 {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(i);
        //     System.out.println("hii");
        //     if(i==2){
        //         System.out.println("Ending the loop");
        //         break;
        //     }
        // }


        // int i = 0;
        // while (i<5) {
        //     System.out.println(i);
        //     System.out.println("hii");
        //     if(i==2){
        //         System.out.println("Ending the loop");
        //         break;
        //     }
        //     i++;
        // }


        // continue statement

        for (int i = 0; i < 5; i++) {
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("hii");
        }
    }
}
