package collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Creating an ArrayList(we can also provide initial capacity or collection while creating ArrayList)
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        System.out.println("Initial ArrayList: " + fruits);


        // 3. Inserting element at a specific index
        fruits.add(2, "Mango");
        System.out.println("After inserting Mango at index 2: " + fruits);

        // 4. Accessing elements
        System.out.println("Element at index 1: " + fruits.get(1));

        // 5. Updating an element
        fruits.set(3, "Cherry");
        System.out.println("After updating index 3 with Cherry: " + fruits);

        // 6. Removing elements
        fruits.remove("Banana"); // Remove by value
        fruits.remove(2); // Remove by index
        System.out.println("After removing Banana and index 2 element: " + fruits);

        // 7. Checking if an element exists
        System.out.println("Does the list contain Apple? " + fruits.contains("Apple"));

        // 8. Finding the index of an element
        System.out.println("Index of Grapes: " + fruits.indexOf("Grapes"));

        // 9. Getting the size of the list
        System.out.println("Size of ArrayList: " + fruits.size());

        // 10. Sorting the list
        Collections.sort(fruits);
        System.out.println("Sorted ArrayList: " + fruits);

        // 11. Iterating using a for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 12. Iterating using an iterator
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 13. Converting ArrayList to Array
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("Array from ArrayList: " + Arrays.toString(fruitArray));

        // 14. Clearing all elements
        fruits.clear();
        System.out.println("After clearing, is the list empty? " + fruits.isEmpty());

        //15. CopyOnWriteArrayList(Thread safe and syncronized)
        // "Copy on write"  means that whenever a write operation performed
        // like adding and removing an element
        // instead of directly modifying the existing list
        // A new copy of the list is created, and the modification is applied to that copy
        // This ensure that other threads reading the list while it's being modified are unaffacted.
        // Read operation : fast and Direct 
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        list.add(3);
        list.add(7);
        list.add(5);
        list.add(9);
        list.add(9);

        for(Integer i: list)
        {
            System.out.println(i);
            if(i.equals(9)){
                list.add(0);
                System.out.println("added element while reading");
            }
        }
        System.out.println("updated list"+list);
    }
}
