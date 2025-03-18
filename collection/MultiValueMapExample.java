package collection;

import java.util.*;

public class MultiValueMapExample {
    public static void main(String[] args) {
        Map<String, List<String>> multiMap = new HashMap<>();

        // Adding multiple values for the same key
        multiMap.put("A", new ArrayList<>(Arrays.asList("Apple", "Avocado")));
        multiMap.put("B", new ArrayList<>(Arrays.asList("Banana", "Blueberry")));

        // Adding another value to the same key
        multiMap.get("A").add("Apricot");

        // Printing the Map
        System.out.println(multiMap);
    }
}

