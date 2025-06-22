package collectioninjava;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(95);
        ls.add(48);
        ls.add(37);
        ls.add(90);
        ls.add(145);
        // 1000 records
        // 100th index - remove
        //  removal - 100  - 1
        // index shifting - 900
        // add at index 100th

        // pros - iteration - fastest iteration
        // cons - very costly when we update data in middle of index or remove data based on index

        System.out.println(ls);
        ls.add(3,78);
        System.out.println(ls);
        System.out.println(ls.get(3));
        // data - index
        // Linked List

        // 1 -> 95 -> 48 -> 37 -> 90 -> 145
        // 1 -> 95 -> 48 -> 37 -> 90 -> 145
        // remove -
        // index 5 -


    }
}
