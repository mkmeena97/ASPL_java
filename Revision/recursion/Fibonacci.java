<<<<<<< HEAD
package remaining_topics.recursion;
=======
package Revision.recursion;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

public class Fibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(6)); // Output: 8
    }
}
