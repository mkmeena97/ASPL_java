package Revision.nio;

import java.nio.file.*;

public class PathInfo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("students/Mahendra.txt");

        System.out.println("Absolute Path: " + path.toAbsolutePath());
        System.out.println("Exists?: " + Files.exists(path));
        System.out.println("Readable?: " + Files.isReadable(path));
        System.out.println("Writable?: " + Files.isWritable(path));
        System.out.println("Hidden?: " + Files.isHidden(path));
    }
}
