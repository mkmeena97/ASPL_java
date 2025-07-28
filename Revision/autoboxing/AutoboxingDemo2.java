package Revision.autoboxing;

public class AutoboxingDemo2 {
    public static void main(String[] args) {
        Integer num = null;
        try {
            int value = num; // Unboxing null -> NPE
            System.out.println(value);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred during unboxing!");
        }
    }
}
