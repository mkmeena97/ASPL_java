package collection;

import java.util.Map;
import java.util.WeakHashMap;

// If a key is no longer referenced anywhere else in your program,
// it becomes eligible for garbage collection,
// and the entry will be automatically removed from the map.
public class WeakHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<Object, String> weakMap = new WeakHashMap<>();

        Object key1 = new String("Key1"); // strong reference
        Object key2 = new String("Key2");

        weakMap.put(key1, "Value1");
        weakMap.put(key2, "Value2");

        System.out.println("Before nulling key2: " + weakMap);

        key2 = null; // remove strong reference to "Key2"

        System.gc(); // Request GC

        Thread.sleep(1000); // Give GC time to collect

        System.out.println("After GC and nulling key2: " + weakMap);
    }
}

