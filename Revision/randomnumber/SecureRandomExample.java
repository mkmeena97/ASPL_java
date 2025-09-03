package remaining_topics.randomnumber;

import java.security.SecureRandom;
import java.util.Arrays;

public class SecureRandomExample {
    public static void main(String[] args) {
        SecureRandom rng = new SecureRandom();
        byte[] randomBytes = new byte[16];
        rng.nextBytes(randomBytes);

        System.out.println("Secure Bytes: " + Arrays.toString(randomBytes));
    }
}
