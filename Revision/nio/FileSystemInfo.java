package remaining_topics.nio;

import java.nio.file.FileSystems;
import java.nio.file.FileSystem;

public class FileSystemInfo {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();

        System.out.println("File System Separator: " + fs.getSeparator());
        System.out.println("Root Directories:");
        fs.getRootDirectories().forEach(System.out::println);

        System.out.println("Supported File Attribute Views:");
        fs.supportedFileAttributeViews().forEach(System.out::println);
    }
}
