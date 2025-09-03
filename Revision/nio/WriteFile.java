package remaining_topics.nio;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("students/Tilak.txt");

        // Single string write
        Files.writeString(path, "Tilak is learning Java NIO");

        // Write multiple lines
        List<String> data = List.of("Tilak loves coding", "Summet is his friend", "Rohan helps them debug");
        Files.write(path, data, StandardOpenOption.APPEND); // Use APPEND to add to existing content

        System.out.println("File writing done!");
    }
}
