<<<<<<< HEAD
package remaining_topics.randomnumber;
=======
package Revision.randomnumber;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

import java.util.Random;

public class RandomRange {
    public static void main(String[] args) {
        Random random = new Random();

        int from0To999 = random.nextInt(1000);
        int from10To109 = 10 + random.nextInt(100);

        System.out.println("0-999: " + from0To999);
        System.out.println("10-109: " + from10To109);
    }
}
