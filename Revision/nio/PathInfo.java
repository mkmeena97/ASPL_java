<<<<<<< HEAD
package remaining_topics.nio;
=======
package Revision.nio;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

import java.nio.file.*;

public class PathInfo {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        Path path = Paths.get("students/Tilak.txt");
=======
        Path path = Paths.get("students/Mahendra.txt");
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

        System.out.println("Absolute Path: " + path.toAbsolutePath());
        System.out.println("Exists?: " + Files.exists(path));
        System.out.println("Readable?: " + Files.isReadable(path));
        System.out.println("Writable?: " + Files.isWritable(path));
        System.out.println("Hidden?: " + Files.isHidden(path));
    }
}
