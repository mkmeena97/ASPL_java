import java.util.*;

public class VactorExample {
    
    public static void main(String[] args) {
        
        Vector<Integer> vector = new Vector<>(); // can provide initial capacity and collection also
        System.out.println(vector.capacity());
    
        Vector<Integer> vector1 = new Vector<>(3, 3);  // increment capacity by 3

        vector1.add(1);
        vector1.add(3);
        vector1.add(2);
        vector1.add(4);
        System.out.println(vector1.capacity());

        vector.clear();
        vector.get(2);
        vector.set(2,4);
        vector.remove(3);  //remove element from 3rd index
        vector.size();
        vector.isEmpty();
        vector.contains(vector1);
        
        


    }

}
