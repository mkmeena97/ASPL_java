package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("Banana");
        set.add("Apple");
        set.add("Mango");

        System.out.println("LinkedHashSet (insertion order): " + set);
    }
}

