package Java_8.Stream;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.*;

public class CreatingStreams {
    public static void main(String[] args) {
        System.out.println("== Creating Streams ==");

        // From Collection
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);

        // From Array
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        stream2.forEach(System.out::println);

        // From Primitives
        IntStream intStream = IntStream.range(1, 6);
        intStream.forEach(System.out::println);

        // Using Supplier
        Supplier<Stream<String>> streamSupplier = () -> Stream.of("X", "Y", "Z");
        streamSupplier.get().forEach(System.out::println);
    }
}

