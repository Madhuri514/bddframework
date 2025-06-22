package collectioninjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        // key value pairs
        // key cant be duplicate , value can be duplicate

        // Dictionary

        Map<String,String> mp  = new HashMap<>();
        mp.put("name","vaibhav");
        mp.put("country","India");

        // key is always saved in Set

        Set<String> keys = mp.keySet();
        for(String key :  keys){
            System.out.println(key + " = " + mp.get(key));
        }

        //System.out.println(mp.get("name"));
        //System.out.println(mp.containsKey("name"));



    }
}
