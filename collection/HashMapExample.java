package collection;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        // Not synchronized and thread-safe
        HashMap<Integer, String> map = new HashMap<>();

        // 1. Put elements into the map
        map.put(1, "Neha");
        map.put(2, "Shinigami");
        map.put(3, "Virat");
        map.put(4, "Rahul");
        // map.put(null, "Priya");

        // 2. Get value by key
        System.out.println("Value for key 2: " + map.get(2));

        // 3. Check if map contains a specific key
        System.out.println("Contains key 1? " + map.containsKey(1));

        // 4. Check if map contains a specific value
        System.out.println("Contains value 'Neha'? " + map.containsValue("Neha"));

        System.out.println("\n--------- Iterating over map using keySet() ---------");
        
        // 5. Iterate using keySet()
        for (int key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        System.out.println("\n--------- Iterating and modifying values using entrySet() ---------");
        
        // 6. Iterate and modify values using entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println("Key: " + entry.getKey() + ", Modified Value: " + entry.getValue());
        }

        // 7. Remove an entry
        boolean isRemoved = map.remove(3, "Virat");  // Removes only if key-value pair matches
        System.out.println("\nIs key 3 removed? " + isRemoved);

        System.out.println("\n--------- Final Map Entries ---------");
        
        // Printing final entries in the map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
