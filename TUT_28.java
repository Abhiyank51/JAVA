// Multidimensional array - array of arrays
// An array of elements in which each elements points to another array

public class TUT_28 {
    public static void main(String[] args) {
        // int [] marks;     // 1-D array
        // int [][] flats;   // 2-D array

        int [][] flats;
        flats = new int[2][3];
        // Storing values
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 104;
        flats[1][1] = 105;
        flats[1][2] = 106;

        // System.out.println("Simple printing");
        // System.out.println(flats[1][1]);
        // for 2d array we use 2 loops, for 3d array we use 3 loops and so on....
        
        System.out.println("Display 2-D array using loops");
        for(int i = 0; i<flats.length; i++){
            for(int j = 0; j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}
