package remaining_topics.enums;

public enum Attendant {
    INSTANCE;
    private Attendant() {
        // perform some initialization routine
    }
    public void sayHello() {
        System.out.println("Hello!");
    }
}
class Main2 {
    public static void main(String... args) {
        Attendant.INSTANCE.sayHello();// instantiated at this point
    }
}