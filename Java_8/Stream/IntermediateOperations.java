package Java_8.Stream;

import java.util.*;
import java.util.stream.*;

public class IntermediateOperations {
    public static void main(String[] args) {
        System.out.println("== Intermediate Operations ==");

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Anna", "John");

        // filter()
        names.stream().filter(name -> name.startsWith("J")).forEach(System.out::println);

        // map()
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        // sorted()
        names.stream().sorted().forEach(System.out::println);

        // distinct()
        names.stream().distinct().forEach(System.out::println);

        // limit()
        names.stream().limit(3).forEach(System.out::println);

        // skip()
        names.stream().skip(2).forEach(System.out::println);
    }
}

