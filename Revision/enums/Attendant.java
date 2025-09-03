<<<<<<< HEAD
package remaining_topics.enums;
=======
package Revision.enums;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

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