package remaining_topics.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ManipulatePath {
    public static void main(String[] args) {
        Path path = Paths.get("students", "tilak", "assignments", "file.txt");

        System.out.println("File Name: " + path.getFileName());
        System.out.println("Parent: " + path.getParent());
        System.out.println("Root: " + path.getRoot());
        System.out.println("Name Count: " + path.getNameCount());
        System.out.println("Subpath (0,2): " + path.subpath(0, 2));
    }
}
