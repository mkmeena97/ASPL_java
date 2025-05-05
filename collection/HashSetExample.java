package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        set.add("Apple"); // duplicate

        System.out.println("HashSet: " + set);
    }
}

