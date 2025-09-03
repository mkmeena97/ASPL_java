<<<<<<< HEAD
package remaining_topics.randomnumber;
=======
package Revision.randomnumber;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomExample {
    public static void main(String[] args) {
        int min = 20;
        int max = 50;
        int result = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println("20-50 Random: " + result);
    }
}
