// Methods tags for generating java documentation

public class TUT_107 {
    /**
     * 
     * @param args   // These are the arguments supplies to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main file");
    }


    /**
     * Hello i want to make this java docs by myself   <-- This is description
     * @param i  // this is the first number to add
     * @param j  // this is the second number to add   
     * @return   //  return sum of both numbers
     * @throws   //  Exception if i is 0
     * @depricated  This methos is depricated please use + operator
     */
    public int add(int i, int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c= i+j;
        return c;
    }
}

// NOTE: Description can be added at the start of javadoc comment