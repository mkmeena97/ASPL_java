package Basic;

import java.util.StringTokenizer;

public class StringDemo {
    public static void main(String[] args) {
        // String (Immutable)
        String str = "Hello";
        str.concat(" World"); // This does not modify str
        System.out.println("String (Immutable): " + str);   //Hello
        
        str = str.concat(" World"); // Assigning the modified value
        System.out.println("After Concatenation: " + str);

        // String Comparison
        String s1 = "Java";
        String s2 = new String("Java");   //stored in heap
        String s3 = "Java";

        System.out.println("Comparing using == : " + (s1 == s2)); // false, different memory references
        System.out.println("Comparing using == : " + (s1 == s3)); // true, same memory reference (string pool)
        System.out.println("Comparing using equals() : " + s1.equals(s2)); // true, compares content

        // Using intern() for memory optimization
        String s4 = new String("Java").intern();  // forcefully storing in string pool
        System.out.println("Comparing interned string using == : " + (s1 == s4)); // true, 

        // StringBuffer (Mutable & Thread-Safe)
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println("StringBuffer (Mutable & Thread-Safe): " + stringBuffer);

        // StringBuilder (Mutable & Not Thread-Safe)
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        System.out.println("StringBuilder (Mutable & Not Thread-Safe): " + stringBuilder);

        // StringTokenizer (Splitting String into Tokens)
        String sentence = "Java, is, fun, to, learn";
        StringTokenizer tokenizer = new StringTokenizer(sentence, ", ");
        System.out.println("StringTokenizer: ");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        // Memory comparison using intern()
        String str1 = new String("Memory").intern();
        String str2 = "Memory";
        System.out.println("Memory Comparison using intern(): " + (str1 == str2)); // true

        // Performance comparison
        int iterations = 100000;

        long startTime = System.nanoTime();
        String testString = "Test";
        for (int i = 0; i < iterations; i++) {
            testString += " Append";
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken by String (Immutable): " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        StringBuffer testBuffer = new StringBuffer("Test");
        for (int i = 0; i < iterations; i++) {
            testBuffer.append(" Append");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        StringBuilder testBuilder = new StringBuilder("Test");
        for (int i = 0; i < iterations; i++) {
            testBuilder.append(" Append");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) / 1e6 + " ms");

   }
}