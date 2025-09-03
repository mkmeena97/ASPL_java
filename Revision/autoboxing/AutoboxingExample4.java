package remaining_topics.autoboxing;

import java.util.ArrayList;

public class AutoboxingExample4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);    // Autoboxing int -> Integer
        int val = list.get(0); // Unboxing Integer -> int

        System.out.println("Value from list: " + val);

        Integer x = 20;
        int y = x + 10; // x unboxed, then added to 10
        System.out.println("y = " + y);
    }
}
