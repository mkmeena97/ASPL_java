package Java_8;

import java.util.*;
import java.util.function.Function;

class Person {
    private final String name;
    private final String surname;

    public Person(String name, String surname){
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

public class PersonComparatorDemo {

    public static void main(String[] args) {
        List<Person1> people = new ArrayList<>();
        people.add(new Person1("Alice", "Smith"));
        people.add(new Person1("Bob", "Anderson"));
        people.add(new Person1("Charlie", "Brown"));

        // 1. Using Lambda to sort by name
        people.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("Sorted by name using lambda:");
        people.forEach(System.out::println);

        // 2. Using Method Reference to sort by surname
        people.sort(Comparator.comparing(Person1::getSurname));
        System.out.println("\nSorted by surname using method reference:");
        people.forEach(System.out::println);

        // 3. BONUS: Using method reference with Function explicitly
        Function<Person1, String> byName = Person1::getName;
        people.sort(Comparator.comparing(byName));
        System.out.println("\nSorted by name again using Function and method reference:");
        people.forEach(System.out::println);
    }
}

