package arraysdemo;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        // subject marks, 3 students
        // math, science, arts, english, language

        int[][] marks = {
                        {1,2,3,4,5},
                        {6,7,8,9,10},
                        {34,23,45,48,34}
                       };

    for( int[] ar  : marks){
        for(int a : ar){
            System.out.println(a);
        }
    }

//        for(int i = 0 ; i < marks.length ; i++){
//            int[] ar = marks[i];
//            for(int j = 0; j < ar.length ; j++) {
//                System.out.println(ar[j]);
//            }
//        }

 // foreach loop

        //System.out.println(marks[2][4]);

//        int[] s1Marks = {12,45,23,56,10};
        // entire collection iteration
//        for(  int a :   s1Marks ){
//            System.out.println(a);
//        }

       // System.out.println(s1Marks[2]);

        //System.out.println(s1Marks.length);
        // upper bound - max index
        // upperbound is always length-1

//        for(int i = 0; i < s1Marks.length ; i++){
//            System.out.println(s1Marks[i]);
//        }

    }
}
