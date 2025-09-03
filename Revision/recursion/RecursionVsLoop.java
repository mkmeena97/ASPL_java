package remaining_topics.recursion;

public class RecursionVsLoop {
    public static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }

    public static int sumLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumRecursive(10));
        System.out.println(sumLoop(10));
    }
}