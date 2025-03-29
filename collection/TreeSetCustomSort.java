package collection;

import java.util.*;

public class TreeSetCustomSort {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(Comparator.reverseOrder());

        set.add("Banana");
        set.add("Apple");
        set.add("Mango");

        System.out.println("TreeSet with custom comparator (reverse): " + set);
    }
}

