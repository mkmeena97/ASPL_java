package remaining_topics.randomnumber;

import java.util.Random;

public class SeededRandom {
    public static void main(String[] args) {
        Random random1 = new Random(12345L);
        System.out.println("Seeded Int: " + random1.nextInt());
    }
}
