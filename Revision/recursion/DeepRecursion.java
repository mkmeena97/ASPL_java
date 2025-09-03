package remaining_topics.recursion;

public class DeepRecursion {
    public static void recurse(int count) {
        System.out.println("Level: " + count);
        recurse(count + 1);  // Will crash eventually
    }

    public static void main(String[] args) {
        recurse(1);
    }
}
