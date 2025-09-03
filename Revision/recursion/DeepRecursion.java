<<<<<<< HEAD
package remaining_topics.recursion;
=======
package Revision.recursion;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

public class DeepRecursion {
    public static void recurse(int count) {
        System.out.println("Level: " + count);
        recurse(count + 1);  // Will crash eventually
    }

    public static void main(String[] args) {
        recurse(1);
    }
}
