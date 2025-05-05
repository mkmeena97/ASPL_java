package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("Banana");
        set.add("Apple");
        set.add("Mango");

        System.out.println("TreeSet (sorted): " + set);
    }
}

