package stringdemo;

import java.util.Arrays;

public class StringMethodDemo {
    public static void main(String[] args) {
        String s1 = "Hello this is Java Session";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase().trim());
        System.out.println(s1.charAt(3));
        System.out.println(s1.indexOf('J'));
        System.out.println(s1.replace("Hello","Hi"));
        String[] arr  = s1.split(" ");
        System.out.println(arr.length);
    }
}
