package Java_8.Stream;

import java.util.*;
import java.util.stream.*;

public class TerminalOperations {
    public static void main(String[] args) {
        System.out.println("== Terminal Operations ==");

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // forEach()
        numbers.stream().forEach(System.out::println);

        // collect()
        List<Integer> doubled = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println("Doubled: " + doubled);

        // count()
        long count = numbers.stream().count();
        System.out.println("Count: " + count);

        // min & max
        numbers.stream().min(Integer::compareTo).ifPresent(min -> System.out.println("Min: " + min));
        numbers.stream().max(Integer::compareTo).ifPresent(max -> System.out.println("Max: " + max));

        // match
        System.out.println("Any Even: " + numbers.stream().anyMatch(n -> n % 2 == 0));
        System.out.println("All Positive: " + numbers.stream().allMatch(n -> n > 0));
        System.out.println("None Negative: " + numbers.stream().noneMatch(n -> n < 0));
    }
}

