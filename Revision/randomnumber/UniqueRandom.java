package remaining_topics.randomnumber;

public class UniqueRandom {
    public static int[] getRandomNumbersWithNoDuplicates(int range, int length) {
        if (length >= range) return null;

        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int remaining = range - i;
            int newSpot = (int) (Math.random() * remaining) + 1;

            for (int num = 1; num <= range; num++) {
                boolean taken = false;
                for (int j = 0; j < i; j++) {
                    if (result[j] == num) {
                        taken = true;
                        break;
                    }
                }
                if (!taken) {
                    newSpot--;
                    if (newSpot == 0) {
                        result[i] = num;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = getRandomNumbersWithNoDuplicates(10, 5);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
