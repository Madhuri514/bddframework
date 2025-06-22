package collectioninjava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // HashSet = unordered - HashAlgorithm
        // LinkedHashSet = ordered
        // TreeSet = Data sorted
        Set<Integer> s1 = new TreeSet<>();
        s1.add(3);
        s1.add(13);
        s1.add(31);
        s1.add(34);
        s1.add(89);
        s1.add(4);

        //System.out.println(s1);
        for(int i : s1){
            System.out.println(i);
        }

    }
}
