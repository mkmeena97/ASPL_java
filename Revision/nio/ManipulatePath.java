<<<<<<< HEAD
package remaining_topics.nio;
=======
package Revision.nio;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

import java.nio.file.Path;
import java.nio.file.Paths;

public class ManipulatePath {
    public static void main(String[] args) {
<<<<<<< HEAD
        Path path = Paths.get("students", "tilak", "assignments", "file.txt");
=======
        Path path = Paths.get("students", "Mahendra", "assignments", "file.txt");
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

        System.out.println("File Name: " + path.getFileName());
        System.out.println("Parent: " + path.getParent());
        System.out.println("Root: " + path.getRoot());
        System.out.println("Name Count: " + path.getNameCount());
        System.out.println("Subpath (0,2): " + path.subpath(0, 2));
    }
}
