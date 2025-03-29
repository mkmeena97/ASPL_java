package Java_8.Reflection;

import java.lang.reflect.Method;

class Person3 {
    public void greet(String msg) {
        System.out.println("Greeting: " + msg);
    }

    public  void goodbye(){
        System.out.println("chlo niklo");
    }
}

public class MethodDemo {
    public static void main(String[] args) throws Exception {
        Person3 person = new Person3();
        Class<?> clazz = person.getClass();

        // Get method with one String parameter
        Method greetMethod = clazz.getMethod("greet", String.class);

        // Call the method with an argument
        greetMethod.invoke(person, "Welcome to reflection!");

        //call the method without an argument
        Method goodbye = clazz.getMethod("goodbye");
        goodbye.invoke(person);

    }
}
