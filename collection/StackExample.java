package collection;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(2);

        System.out.println(stack);

        Integer RemovedElement = stack.pop();

        System.out.println(stack);

        stack.add(3);
        Integer peekElement  = stack.peek();

        //also can use vactor inteface methods
        stack.add(3, 4);
    }
}
