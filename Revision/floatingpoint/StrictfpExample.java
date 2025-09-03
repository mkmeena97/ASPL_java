package remaining_topics.floatingpoint;

public class StrictfpExample {

    public static void main(String[] args) {
        WithoutStrictfp.calc();
        WithStrictfp.calc();
    }
}

class WithoutStrictfp {
    static void calc() {
        double a = 1.0e300;
        double b = 1.0e-300;
        double result = a * b; // Might not be exactly 1.0 on all systems
        System.out.println("Without strictfp: " + result);
    }
}

strictfp class WithStrictfp {
    static void calc() {
        double a = 1.0e300;
        double b = 1.0e-300;
        double result = a * b; // same across platforms
        System.out.println("With strictfp: " + result);
    }
}
