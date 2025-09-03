package remaining_topics.recursion;

public class TypesOfRecursion {

    // Tail recursion
    public static void tailRec(int n) {
        if (n == 0) return;
        System.out.println(n);
        tailRec(n - 1);
    }

    // Head recursion
    public static void headRec(int n) {
        if (n == 0) return;
        headRec(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        tailRec(3);
        headRec(3);
    }
}
