package Java_8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//order does not maintain
//use when data is independent and ordering not necessary
public class ParallelStreams {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");

        System.out.println(" Original List:");
        words.forEach(System.out::println);

        System.out.println("\n Parallel Stream - Uppercase and Filter (length > 3):");
        List<String> filteredWords = words.parallelStream()
                .filter(word -> word.length() > 3)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        filteredWords.forEach(System.out::println);

        System.out.println("\n Compare Performance (Sequential vs Parallel):");

        // initializing the list using IntStream
        List<Integer> bigList = IntStream.rangeClosed(1, 1_000_000)
                .boxed()
                //.collect(Collectors.toList());
                .toList();

        long startSequential = System.currentTimeMillis();
        long sumSequential = bigList.stream()
                .mapToLong(i -> i * 2)
                .sum();
        long endSequential = System.currentTimeMillis();

        long startParallel = System.currentTimeMillis();
        long sumParallel = bigList.parallelStream()
                .mapToLong(i -> i * 2)
                .sum();
        long endParallel = System.currentTimeMillis();

        System.out.println("Sequential sum: " + sumSequential + ", Time: " + (endSequential - startSequential) + " ms");
        System.out.println("Parallel sum: " + sumParallel + ", Time: " + (endParallel - startParallel) + " ms");
    }
}



