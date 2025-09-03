package remaining_topics.floatingpoint;

import java.text.DecimalFormat;

public class FloatingPointExamples {

    public static void compareFloatingPoints() {
        double oneThird = 1.0 / 3.0;
        double one = oneThird * 3;
        System.out.println(one == 1.0);

        float floatVal = 0.1f;
        double doubleVal = 0.1;
        double doubleValCopy = floatVal;
        System.out.println(floatVal);
        System.out.println(doubleVal);
        System.out.println(doubleValCopy);
        System.out.println(floatVal == doubleVal);
        System.out.println(doubleVal == doubleValCopy);

        double[] doubles = {1.0, 1.0001, 1.0000001, 1.000000001, 1.0000000000001};
        double[] deltas = {0.01, 0.00001, 0.0000001, 0.0000000001, 0};
        for (int j = 0; j < deltas.length; j++) {
            double delta = deltas[j];
            System.out.println("delta: " + delta);
            for (int i = 0; i < doubles.length - 1; i++) {
                double d1 = doubles[i];
                double d2 = doubles[i + 1];
                boolean result = Math.abs(d1 - d2) < delta;
                System.out.println(d1 + " == " + d2 + " ? " + result);
            }
            System.out.println();
        }

        double a = 1.0;
        double b = 1.0001;
        System.out.println(Double.compare(a, b));
        System.out.println(Double.compare(b, a));
    }

    public static void overflowUnderflow() {
        float f = 3.4e38f;
        float fRes = f * 2;
        System.out.println(fRes);

        f = 1e-45f;
        fRes = f / 1000;
        System.out.println(fRes);

        double d = 1e308;
        double dRes = d * 2;
        System.out.println(dRes);

        d = 4.8e-323;
        dRes = d / 1000;
        System.out.println(dRes);
    }

    public static void formattingExamples() {
        String format1 = String.format("%.2f", 1.2399);
        System.out.println(format1);

        String format2 = String.format("%.3f", 1.2399);
        System.out.println(format2);

        String format3 = String.format("%.2f", 1.2);
        System.out.println(format3);

        String format4 = String.format("%.2f", 3.19999);
        System.out.println(format4);

        String format5 = new DecimalFormat("0.#").format(4.3200);
        System.out.println(format5);

        String format6 = new DecimalFormat("0.##").format(1.2323000);
        System.out.println(format6);

        double dv = 123456789;
        System.out.println(dv);
        String format7 = new DecimalFormat("0").format(dv);
        System.out.println(format7);
    }

    public static strictfp class StrictOps {
        public static strictfp double div(double dividend, double divisor) {
            return dividend / divisor;
        }
    }

    public static void main(String[] args) {
        compareFloatingPoints();
        overflowUnderflow();
        formattingExamples();
        System.out.println(StrictOps.div(10.0, 3.0));
    }
}
