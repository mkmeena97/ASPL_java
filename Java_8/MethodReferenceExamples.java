package Java_8;

import java.util.*;
import java.util.stream.Collectors;

class Person1 {
    private final String name;
    private final String surname;

    public Person1(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){ return name; }
    public String getSurname(){ return surname; }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}

public class MethodReferenceExamples {

    // Static method
    public static String convertToUpper(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {

        // Create list of people
        List<Person1> people = Arrays.asList(
                new Person1("Alice", "Smith"),
                new Person1("Bob", "Anderson"),
                new Person1("Charlie", "Brown")
        );

        // 1. Instance method reference (to an arbitrary instance of a class)
        List<String> namesUsingMethodRef = people.stream()
                .map(Person1::getName) // Equivalent: person -> person.getName()
                .collect(Collectors.toList());
        System.out.println("Names (method reference): " + namesUsingMethodRef);

        // Equivalent using lambda
        List<String> namesUsingLambda = people.stream()
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println("Names (lambda): " + namesUsingLambda);

        // 2. Instance method reference (to a specific instance)
        System.out.println("Printing people using method reference:");
        people.forEach(System.out::println); // Equivalent: person -> System.out.println(person)

        // Equivalent using lambda
        System.out.println("Printing people using lambda:");
        people.forEach(person -> System.out.println(person));

        // 3. Static method reference
        List<String> lowerCase = Arrays.asList("java", "method", "reference");
        List<String> upperCase = lowerCase.stream()
                .map(MethodReferenceExamples::convertToUpper) // Equivalent: s -> convertToUpper(s)
                .collect(Collectors.toList());
        System.out.println("Uppercase (static method ref): " + upperCase);

        // Equivalent lambda
        List<String> upperCaseLambda = lowerCase.stream()
                .map(s -> convertToUpper(s))
                .collect(Collectors.toList());
        System.out.println("Uppercase (lambda): " + upperCaseLambda);

        // 4. Constructor reference
        List<String> numbersAsStrings = Arrays.asList("1", "2", "3", "4");
        List<Integer> numbers = numbersAsStrings.stream()
                .map(Integer::new) // Equivalent: s -> new Integer(s)
                .collect(Collectors.toList());
        System.out.println("Constructed Integers (constructor ref): " + numbers);

        // Equivalent lambda
        List<Integer> numbersLambda = numbersAsStrings.stream()
                .map(s -> new Integer(s))
                .collect(Collectors.toList());
        System.out.println("Constructed Integers (lambda): " + numbersLambda);

        // 5. Array constructor reference
        String[] stringArray = lowerCase.stream().toArray(String[]::new); // Equivalent: size -> new String[size]
        System.out.println("Array constructed using array constructor reference: " + Arrays.toString(stringArray));
    }
}

