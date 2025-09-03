<<<<<<< HEAD
package remaining_topics.recursion;
=======
package Revision.recursion;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

public class BasicRecursion {
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // Output: 120
    }
}
