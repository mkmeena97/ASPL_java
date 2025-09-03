package remaining_topics.autoboxing;

public class AutoboxingExample5 {
    public static void main(String[] args) {
        long start, end;

        int sum1 = 0;
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            sum1 += i;
        }
        end = System.nanoTime();
        System.out.println("Primitive int time: " + (end - start) + " ns");

        Integer sum2 = 0;
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            sum2 += i; // Unboxing + Boxing in every iteration
        }
        end = System.nanoTime();
        System.out.println("Boxed Integer time: " + (end - start) + " ns");
    }
}
