import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Custom Exception
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    // Method to demonstrate checked exception and 'throws'
    public static void readFile(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } // Resources are automatically closed here
    }

    // Method to demonstrate unchecked exception
    public static void divideNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }

    // Method to demonstrate exception propagation
    public static void method1() {
        method2();
    }

    public static void method2() {
        throw new NullPointerException("Exception in method2");
    }

    // Method to demonstrate custom exception
    public static void validateAge(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        // 1. Handling checked exception (IOException)
        try {
            readFile("nonexistent.txt"); // This file does not exist
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }

        // 2. Handling unchecked exception (ArithmeticException)
        try {
            divideNumbers(10, 0); // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // 3. Exception propagation
        try {
            method1();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // 4. Custom exception
        try {
            validateAge(15); // This will throw MyCustomException
        } catch (MyCustomException e) {
            System.out.println("Caught MyCustomException: " + e.getMessage());
        }

        // 5. Finally block
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        // 6. Try-with-resources and suppressed exceptions
        try (BufferedReader br = new BufferedReader(new FileReader("nonexistent.txt"))) {
            throw new IOException("Exception in try block");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
            // Print suppressed exceptions
            for (Throwable t : e.getSuppressed()) {
                System.out.println("Suppressed Exception: " + t.getMessage());
            }
        }

        // 7. Chained exceptions
        try {
            throw new IOException("Original IOException");
        } catch (IOException e) {
            MyCustomException customEx = new MyCustomException("Custom Exception");
            customEx.initCause(e); // Chain the original exception
            System.out.println("Caught Chained Exception: " + customEx.getMessage());
            System.out.println("Original Cause: " + customEx.getCause().getMessage());
        }
    }
}
