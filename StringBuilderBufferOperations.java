public class StringBuilderBufferOperations {
    public static void performStringBuilderOperations() {
        // Initializing StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // 1. Appending
        sb.append(" World!");
        System.out.println("Append: " + sb);

        // 2. Inserting
        sb.insert(5, " Java");
        System.out.println("Insert: " + sb);

        // 3. Replacing
        sb.replace(6, 10, "Python");
        System.out.println("Replace: " + sb);

        // 4. Deleting
        sb.delete(6, 12);
        System.out.println("Delete: " + sb);

        // 5. Deleting a single character
        sb.deleteCharAt(5);
        System.out.println("Delete Char at index 5: " + sb);

        // 6. Reversing
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // 7. Finding Length & Capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        // 8. Ensuring Capacity
        sb.ensureCapacity(50);
        System.out.println("Ensured Capacity (50): " + sb.capacity());

        // 9. Converting to String
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }

    public static void performStringBufferOperations() {
        // Initializing StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // 1. Appending
        sb.append(" World!");
        System.out.println("Append: " + sb);

        // 2. Inserting
        sb.insert(5, " Java");
        System.out.println("Insert: " + sb);

        // 3. Replacing
        sb.replace(6, 10, "Python");
        System.out.println("Replace: " + sb);

        // 4. Deleting
        sb.delete(6, 12);
        System.out.println("Delete: " + sb);

        // 5. Deleting a single character
        sb.deleteCharAt(5);
        System.out.println("Delete Char at index 5: " + sb);

        // 6. Reversing
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // 7. Finding Length & Capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        // 8. Ensuring Capacity
        sb.ensureCapacity(50);
        System.out.println("Ensured Capacity (50): " + sb.capacity());

        // 9. Converting to String
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }

    public static void main(String[] args) {
        System.out.println("===== StringBuilder Operations =====");
        performStringBuilderOperations();
        
        System.out.println("\n===== StringBuffer Operations =====");
        performStringBufferOperations();
    }
}

