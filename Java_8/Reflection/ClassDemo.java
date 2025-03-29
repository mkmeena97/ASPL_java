package Java_8.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person1 {
    private String name;
    public void sayHello() {
        System.out.println("Hi!");
    }
    private  void secret(){
        System.out.println("don't tell anyone");
    }
}

public class ClassDemo {
    public static void main(String[] args) {
        Class<?> clazz = Person1.class;

        // Print class name
        System.out.println("Class Name: " + clazz.getName());

        // List all declared methods
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }

        // List all declared fields
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println("Field: " + f.getName());
        }
    }
}

