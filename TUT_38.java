// OOPS IN JAVA 
// WATCH TUT 36,37 FOR GOOD UNDERSTANDING


// Create class
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class TUT_38 {
    public static void main(String[] args) {
        // System.out.println("This is our custom class");

        // Create an object from Employee class
        // Instantiating a new employee object
        Employee Abhiyank = new Employee();
        Employee Harsh = new Employee();

        // Setting attributes for Abhiyank
        Abhiyank.id = 101;
        Abhiyank.salary = 100000;
        Abhiyank.name = "Abhiyank Yadav";

        // Setting attributes for Harsh
        Harsh.id = 102;
        Harsh.salary = 150000;
        Harsh.name = "Harsh Kanoje";

        // Printing the attributes
        // System.out.println(Abhiyank.id);
        // System.out.println(Abhiyank.name);
        Abhiyank.printDetails();
        Harsh.printDetails();
        int salary = Harsh.getSalary();
        System.out.println(salary);
    }
}
