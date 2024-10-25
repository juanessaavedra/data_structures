package dcollections.map;

import java.util.HashMap;
import java.util.Map;

//Don't accept duplicate keys

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(); //String is just a example, we can use whatever type we want

        hashMap.put("A", 1);

        if (hashMap.containsKey("A")) {
            System.out.println("HashMap contains key A. With Value: " + hashMap.get("A"));
        }

        if (hashMap.containsValue(1)) {
            System.out.println("HashMap contains value 1.");
        }

        int aparicionesdeA = hashMap.get("A");
        hashMap.remove("A");

        //Add elements
        hashMap.put("A", 1);
        hashMap.put("E", 12);
        hashMap.put("I", 15);
        hashMap.put("O", 0);
        hashMap.put("U", 0);

        //Print all elements
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
        }


    }
}
