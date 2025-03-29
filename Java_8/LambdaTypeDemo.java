package Java_8;

import java.util.function.Predicate;
import java.util.List;

public class LambdaTypeDemo {

    // 1. Returning a lambda from a method
    public static Predicate<String> getEmptyChecker() {
        return s -> s.isEmpty(); // type inferred from return type
    }

    public static void main(String[] args) {

        // 2. Direct assignment
        Predicate<String> myPredicate = s -> s.isEmpty();
        System.out.println("Direct assignment: " + myPredicate.test("")); // true

        // 3. Passing as a parameter to a method expecting a functional interface
        List<String> list = List.of("hello", "", "world", "");
        List<String> filtered = list.stream()
                .filter(s -> s.isEmpty()) // lambda type inferred as Predicate<String>
                .toList();
        System.out.println("Filtered empty strings: " + filtered); // ["", ""]

        // 4. Returning from a method
        Predicate<String> emptyChecker = getEmptyChecker();
        System.out.println("From method return: " + emptyChecker.test("not empty")); // false

        // 5. Casting the lambda explicitly
        Object obj = (Predicate<String>) (s -> s.isEmpty());
        Predicate<String> castedPredicate = (Predicate<String>) obj;
        System.out.println("After casting: " + castedPredicate.test("")); // true
    }
}

