package collection;

import java.util.Arrays;
import java.util.LinkedList;

class Node{
    public int value;

    public Node next;
}





public class LinkedListExample {

public static void main(String[] args) {
    
    // Node node1= new Node();
    // Node node2= new Node();
    // node1.value=1;
    // node1.next= node2;
    // node2.value=3;
    // node2.next=null;

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
