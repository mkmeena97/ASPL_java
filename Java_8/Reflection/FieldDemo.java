package Java_8.Reflection;

import java.lang.reflect.Field;

class Person2 {
    private String name = "Alice";
    private  String sex="6";
}

public class FieldDemo {
    public static void main(String[] args) throws Exception {
        Person2 person = new Person2();
        Class<?> clazz = person.getClass();

        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true); // Access private field

        // Get field value
        String name = (String) nameField.get(person);
        System.out.println("Name: " + name);

        // Set new value
        nameField.set(person, "Bob");
        System.out.println("Updated Name: " + nameField.get(person));

        Field myField = clazz.getDeclaredField("sex");
        myField.setAccessible(true);
        String sex = (String) myField.get(person);
        System.out.println("SEX: "+sex);
        myField.set(person, "queer");
        String sex1 = (String) myField.get(person);
        System.out.println("Value after set Sex: "+sex1);
    }
}

