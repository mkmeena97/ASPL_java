<<<<<<< HEAD
package remaining_topics.randomnumber;
=======
package Revision.randomnumber;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

import java.util.Random;

public class SeededRandom {
    public static void main(String[] args) {
        Random random1 = new Random(12345L);
        System.out.println("Seeded Int: " + random1.nextInt());
    }
}
