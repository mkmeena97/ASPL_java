import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // 1. Length of a string
        System.out.println("Length of first string: " + str1.length());

        // 2. Concatenation
        String concatenated = str1.concat(str2);
        System.out.println("Concatenated string: " + concatenated);

        // 3. Comparison (case-sensitive and case-insensitive)
        System.out.println("Are the strings equal? " + str1.equals(str2));
        System.out.println("Are the strings equal (ignoring case)? " + str1.equalsIgnoreCase(str2));

        // 4. Substring extraction
        if (str1.length() >= 3) {
            System.out.println("Substring (first 3 chars of first string): " + str1.substring(0, 3));
        }

        // 5. Character extraction
        if (str1.length() > 0) {
            System.out.println("First character of first string: " + str1.charAt(0));
        }

        // 6. Replace characters
        String replaced = str1.replace('a', '@'); // Replacing 'a' with '@'
        System.out.println("String after replacing 'a' with '@': " + replaced);

        // 7. Splitting a string
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // 8. Trimming whitespace
        System.out.print("Enter a string with leading and trailing spaces: ");
        String spacedStr = scanner.nextLine();
        System.out.println("Trimmed string: " + spacedStr.trim());

        // 9. Case conversion
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 10. Reverse a string
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println("Reversed string: " + reversed);

        // 11. Check if the string is a palindrome
        if (str1.equalsIgnoreCase(reversed)) {
            System.out.println("The first string is a palindrome.");
        } else {
            System.out.println("The first string is NOT a palindrome.");
        }

        scanner.close();
    }
}
