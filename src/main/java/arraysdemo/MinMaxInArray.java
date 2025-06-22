package arraysdemo;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] ar = {11,3,5,12,9,7};
        int min = ar[0];
        int minIndex = 0;
        int IndexCounter = 0;
        for(int a : ar){
            if(a < min){
             min = a;
             minIndex = IndexCounter;
            }
            IndexCounter++;
        }
        System.out.println("Min Value is " + min);
        System.out.println("Min Value index is " + minIndex);

        // Assignments
        // 1 - Reverse Array {3,6,7}  => {7,6,3}
        // 2  - Sort Array {3,1,2}  => {1,2,3}


    }
}
