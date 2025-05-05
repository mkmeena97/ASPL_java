package Java_8.Stream;

import java.util.*;
import java.util.stream.*;

public class StreamReduction {
    public static void main(String[] args) {
        System.out.println("== Stream Reduction ==");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // reduce without identity
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
        sum.ifPresent(s -> System.out.println("Sum: " + s));

        // reduce with identity
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);
    }
}

