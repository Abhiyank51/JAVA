// Method overloading in java


// When we dont want to return anything, we use void as the return type.
public class TUT_32 {
    
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void telljoke(){
        System.out.println("I invented a new word\n" + "Plagiarism");
    }



    // Method overloading
    static void greet(){
        System.out.println("Good morning");
    }
    // In this function with same name but here we pass a parameter
    static void greet(int a){
        System.out.println("Good morning "+a+" bro!");
    }
    static void greet(int a, int b){
        System.out.println("Good morning "+a+" bro!");
        System.out.println("Good morning "+b+" bro!");
    }


    
    public static void main(String[] args) {
        // telljoke();

        
        // CASE 1 -- Changing the integer
        // int x = 45;
        // change(x);
        // Output is 45 because change function gets the copy of original variable
        // a change in its copy does not affect the value of x.
        // System.out.println("The value of x after running change is: "+ x);
        
        
        // CASE 2 -- Changing the array
        // int [] marks = {12,54,76,45,76};
        // // In this case the value is changed because wepass reference here not the copy of an object.
        // change2(marks);
        // System.out.println("The value of marks after running change is: "+marks[0]);


        // METHOD OVERLOADING
        greet();
        greet(300);
        greet(30,40);
    }
}
