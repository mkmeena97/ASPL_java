<<<<<<< HEAD
package remaining_topics.nio;
=======
package Revision.nio;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public static void main(String[] args) throws IOException {
<<<<<<< HEAD
        Path path = Paths.get("students/Tilak.txt");

        // Single string write
        Files.writeString(path, "Tilak is learning Java NIO");

        // Write multiple lines
        List<String> data = List.of("Tilak loves coding", "Summet is his friend", "Rohan helps them debug");
=======
        Path path = Paths.get("students/Mahendra.txt");

        // Single string write
        Files.writeString(path, "Mahendra is learning Java NIO");

        // Write multiple lines
        List<String> data = List.of("Mahendra loves coding", "Tilak is his friend", "Tilak helps them debug");
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247
        Files.write(path, data, StandardOpenOption.APPEND); // Use APPEND to add to existing content

        System.out.println("File writing done!");
    }
}
