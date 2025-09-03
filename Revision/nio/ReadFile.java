package remaining_topics.nio;

import java.nio.file.*;
import java.util.List;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("students/mahendra.txt");

        // Line-by-line read
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            System.out.println(line);
        }

        // OR Read whole file as one string
        String content = Files.readString(path);
        System.out.println("Full File Content:\n" + content);
    }
}
