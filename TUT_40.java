/*Access modifiers->
Specifies where a property/method is accessible 
There are 4 types of access modifiers in java
1. Private
2. Default
3. Protected
4. Public
getters-> Returns the values (accessors)
setters-> Sets/Updates the value (mutators)
*/


class MyEmployee{
    // We make these attributes private this helps in sensitive data hiding.
    // Now they can't be access directly 
    private int id;
    private String name;

    public void setName(String n){
        name = n;  // with the help of this we van access private members
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

}
public class TUT_40 {
    public static void main(String[] args) {
        MyEmployee Abhiyank = new MyEmployee();
        // Below commented line throws errow b/c due to private asscess modifier
        // Abhiyank.id = 45;
        // Abhiyank.name = "Abhiyank Yadav";\
        Abhiyank.setName("Abhiyank Yadav");
        System.out.println(Abhiyank.getName());
        Abhiyank.setId(101);
        System.out.println(Abhiyank.getId());
    }
}
