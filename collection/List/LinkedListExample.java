package collection;

import java.util.Arrays;
import java.util.LinkedList;
public class LinkedListExample {

public static void main(String[] args) {

    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(9);
    linkedList.add(5);
    linkedList.add(4,13);
    linkedList.get(3);    //O(n)
    linkedList.addFirst(9);
    linkedList.addLast(8);

    linkedList.getFirst();
    linkedList.getLast();

    linkedList.removeIf(x->x%2==0);
    System.out.println(linkedList);

    LinkedList<String> animals = new LinkedList<>(Arrays.asList("Dog","Cat","Elephant"));
    LinkedList<String> animalToRemove= new LinkedList<>(Arrays.asList("Dog","Cat"));
    animals.removeAll(animalToRemove);
    System.out.println(animals);
   
}
    
}
