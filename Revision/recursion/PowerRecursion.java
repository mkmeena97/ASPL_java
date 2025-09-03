<<<<<<< HEAD
package remaining_topics.recursion;
=======
package Revision.recursion;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

public class PowerRecursion {
    public static int power(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
