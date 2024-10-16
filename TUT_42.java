// Constructors in Java


class MyMainEmployee{
   private int id;
   private String name;

   public void setName(String n){
      name = n;  
   }
   public String getName(){
      return name;
   }
   public void setId(int i){
      id=i; 
   }
   public int getId(){
      return id; 
   }

   // Making a constructor
   // Constructor overloading
   public MyMainEmployee(){
      id = 0;
      name = "Your Name Here";
   }
   public MyMainEmployee(String Myname){
      id = 45;
      name = "Your Name Here";
   }
   public MyMainEmployee(String Myname, int myId){
      id = myId;
      name = Myname;
   }
}

public class TUT_42 {
   public static void main(String[] args) {

      // Constructor did not want an argument
      // MyMainEmployee Abhiyank = new MyMainEmployee();

      // Now constructor expect an argument 
      MyMainEmployee Abhiyank = new MyMainEmployee("Abhiyank",101);
   
      // If you dont run the below commented line then constructor code will run for that new employee
      // Abhiyank.setName("Abhiyank Yadav");
      // Abhiyank.setId(101);
      // NOTE - Constructors are automatically invoked
      // Its name is same as of main class 
      System.out.println(Abhiyank.getId());
      System.out.println(Abhiyank.getName());
   } 
}
