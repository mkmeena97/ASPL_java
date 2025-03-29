package Java_8.Stream;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

public class FrequencyMapExample {
    public static void main(String[] args) {
        Map<String, Long> frequencyMap = Stream.of("apple", "orange", "banana", "apple")
                .collect(Collectors.groupingBy(
                        Function.identity(), // classifier: the word itself
                        Collectors.counting() // downstream: count how many times each appears
                ));

        frequencyMap.entrySet().forEach(System.out::println);
    }
}

