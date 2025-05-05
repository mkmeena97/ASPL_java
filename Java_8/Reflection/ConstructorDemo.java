package Java_8.Reflection;

import java.lang.reflect.Constructor;

class Person4 {
    private String name;
    private int age;

    public Person4(String name, int age) {
        this.name = name;
        this.age= age;
    }

    public void show() {
        System.out.println("Name: " + name+" Age: "+age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Person4.class;

        // Get constructor that takes a String
        Constructor<?> constructor = clazz.getConstructor(String.class, int.class);

        // Create object using the constructor
        Person4 person = (Person4) constructor.newInstance("Charlie",85);

        // Call method to verify
        person.show(); // Output: Name: Charlie Age: 85
    }
}

