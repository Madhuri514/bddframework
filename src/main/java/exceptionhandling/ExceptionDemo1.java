package exceptionhandling;



import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            myCalculator();
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("We have some issue in code.");
        }
    }

    public static void myCalculator()throws Exception{
        Scanner scan = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Enter your First Number");
                int i = scan.nextInt();
                System.out.println("Enter your Second Number");
                int j = scan.nextInt();
                int k = i + j;
                System.out.println("Your Sum = " + k);

                int[] arr = new int[2];
                arr[0] = i;
                arr[1] = j;
                System.out.println("Which index you want as 0");
                int index = scan.nextInt();
                arr[index] = 0;
                System.out.println("your array is updated.");
                System.out.println("database close");
            }catch(Exception e){
                System.out.println("You have entered something wrong. plz try again");
                scan = new Scanner(System.in);
            }finally {
                System.out.println("i will execute always");
            }

            System.out.println("Want to Continue");
            String continueString= scan.next();
            if(continueString.equalsIgnoreCase("n")){
                break;
            }
        }
        System.out.println("Thanks for using calculator");

    }
}
