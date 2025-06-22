package stringdemo;

public class StringDemo {
    public static void main(String[] args) {
        // immutable objects   /  Objects in String Pool
        String s1 = "Java";    //   1   // litral way
        String s2 = "Java";    //   1
        String s5 = new String("Java");  // object way
        String s6 = new String("Java");

        // ==  operator   , compares references
        System.out.println(s1 == s2); // true
        System.out.println(s2 == s5); // false
        System.out.println(s5 == s6);  // false

        // equals = compare values
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s5));
        System.out.println(s5.equals(s6));




    }
}
