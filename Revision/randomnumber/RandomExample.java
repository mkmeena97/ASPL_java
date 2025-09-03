package remaining_topics.randomnumber;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        int randInt = random.nextInt();
        long randLong = random.nextLong();
        double randDouble = random.nextDouble();
        float randFloat = random.nextFloat();
        byte[] randBytes = new byte[5];
        random.nextBytes(randBytes);
        System.out.println("Int: " + randInt);
        System.out.println("Long: " + randLong);
        System.out.println("Double: " + randDouble);
        System.out.println("Float: " + randFloat);
        System.out.print("Bytes: ");
        for (byte b : randBytes) {
            System.out.print(b + " ");
        }
    }
}
