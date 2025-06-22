package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;

public class CheckedDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(new File(""));
        }catch(Exception e){

        }
    }
}
