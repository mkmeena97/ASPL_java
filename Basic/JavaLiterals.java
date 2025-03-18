package Basic;

public class JavaLiterals {
    public static void main(String[] args) {
        // 1 Integer Literals (Decimal, Binary, Octal, Hexadecimal)
        int decimalNum = 100;        // Decimal (Base 10)
        int binaryNum = 0b1010;      // Binary (Base 2, prefix `0b`)
        int octalNum = 0123;         // Octal (Base 8, prefix `0`)
        int hexNum = 0x1A;           // Hexadecimal (Base 16, prefix `0x`)
        long longNum = 100000L;      // Long literal (Suffix `L`)

        // 2 Floating-Point Literals
        float floatNum = 3.14f;      // Float literal (Suffix `f`)
        double doubleNum = 2.718;    // Double literal (Default type)

        // 3 Character Literals
        char letter = 'A';           // Single character
        char unicodeChar = '\u0041'; // Unicode representation ('A')
        char escapeChar = '\n';      // Escape sequence (Newline)

        // 4 String Literal
        String message = "Hello, Java!"; // String (Sequence of characters)

        // 5 Boolean Literals
        boolean isJavaFun = true;
        boolean isTough = false;

        // 6 Null Literal (Only for reference types)
        String myString = null;

        // Printing values to demonstrate literals
        System.out.println("Integer Literals:");
        System.out.println("Decimal: " + decimalNum);
        System.out.println("Binary: " + binaryNum);
        System.out.println("Octal: " + octalNum);
        System.out.println("Hexadecimal: " + hexNum);
        System.out.println("Long: " + longNum);

        System.out.println("\nFloating-Point Literals:");
        System.out.println("Float: " + floatNum);
        System.out.println("Double: " + doubleNum);

        System.out.println("\nCharacter Literals:");
        System.out.println("Char: " + letter);
        System.out.println("Unicode Char: " + unicodeChar);
        System.out.println("Escape Char (New Line) printed above ⬆");

        System.out.println("\nString Literal:");
        System.out.println("Message: " + message);

        System.out.println("\nBoolean Literals:");
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Is Java Tough? " + isTough);

        System.out.println("\nNull Literal:");
        System.out.println("Null String: " + myString);
    }
}
