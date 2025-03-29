package Java_8.Stream;

import java.util.function.Function;
import java.util.stream.*;

public class CombiningStreams {
    public static void main(String[] args) {
        System.out.println("== Combining Streams ==");

        Stream<String> streamA = Stream.of("Apple", "Banana");
        Stream<String> streamB = Stream.of("Cherry", "Date");

        // Merging two streams
        Stream<String> merged = Stream.concat(streamA, streamB);
        merged.forEach(System.out::println);

        // Merging multiple streams
        Stream<String> streamC = Stream.of("Elderberry", "Fig");
        Stream<String> combined = Stream.of(Stream.of("Apple"), streamB, streamC)
                .flatMap(Function.identity());
        combined.forEach(System.out::println);
    }
}

