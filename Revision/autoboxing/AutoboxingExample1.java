package remaining_topics.autoboxing;

public class AutoboxingExample1 {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;  // Autoboxing
        int c = b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
