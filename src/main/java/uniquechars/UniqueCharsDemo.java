package uniquechars;

import java.util.*;

public class UniqueCharsDemo {
    public static void main(String[] args) {

        // TOP-DOWN APPROACH


        // 2 types

        // absolute  - / - direct
        // relative  - //- distant
        // <span id="id1" class="sadf">textme</span>
 // tagname = span
        // attribute = id and class
        // tagvalue = textme

        int[] numbers = {1,2,3,4,3,2,5};
        Set<Integer> s1 = new LinkedHashSet<>();
        for(int num : numbers){
            s1.add(num);
        }
        System.out.println(s1);

        int[] uAr = new int[s1.size()];
        int index = 0;
        for(int i : s1){
            uAr[index] = i;
            index++;
        }
        System.out.println(Arrays.toString(uAr));


        Map<Integer, Integer>  numberFreq = new HashMap<>();
        System.out.println("NumberFreq = " +numberFreq);
        for(int num : numbers){
            if(numberFreq.containsKey(num)){
                int value = numberFreq.get(num);
                value =  value+1;
                numberFreq.put(num, value);
            }else{
                numberFreq.put(num, 1);
            }
        }
        System.out.println("NumberFreq = " +numberFreq);
        System.out.println("Unique Numbers: ");
        for(int key : numberFreq.keySet()){
            if(numberFreq.get(key) == 1){
                System.out.println(key);
            }
        }

    }
}
