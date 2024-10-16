// String methods in java

public class TUT_14 {
    public static void main(String[] args) {
        // Make a string
        String name = "Abhiyank";
        System.out.println(name);

        // Length of string
        // int value = name.length();
        // System.out.println(value);

        // // To lower/Upper case
        // String value1 = name.toLowerCase();
        // String value2 = name.toUpperCase();
        // System.out.println(value1);
        // System.out.println(value2);

        // // trim- remove all spaces in forward and backward in string
        // String sentence = "         Abhiyank is a good coder       ";
        // String value3 = sentence.trim();
        // System.out.println(value3); 

        // Substring - print string strating from particular index as input in substring method
        // System.out.println(name.substring(3));
        // // include begin index word but exclude end index word
        // System.out.println(name.substring(3,5));

        // replace 
        // System.out.println(name.replace('h', 'a'));
        // System.out.println(name.replace("hiy", "aol"));

        // Startswith
        // return boolean true or false
        // System.out.println(name.startsWith("a"));
        // System.out.println(name.startsWith("Abhi"));

        // endswith()
        // System.out.println(name.endsWith("ank"));

        // charAt()
        // System.out.println(name.charAt(2));

        // indexof()
        // return first index if was a string
        // System.out.println(name.indexOf("hi"));

        // search string y from index 3
        // System.out.println(name.indexOf("y",3));

        // lastindexof()
        // start search of index from last 
        // System.out.println(name.lastIndexOf("a"));

        // equals()
        // Return boolean true or false
        System.out.println(name.equals("Abhiyank"));
        // ignore lower/upper case
        System.out.println(name.equalsIgnoreCase("abhiyank"));
        
    }
}
