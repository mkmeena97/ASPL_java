<<<<<<< HEAD
package remaining_topics.properties;
=======
package Revision.properties;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadXml {
    public static void loadProperties(String path) throws IOException {
        Properties prop = new Properties();
        File file = new File(path);
        if (file.exists()) {
            prop.loadFromXML(new FileInputStream(file));
            for (String name : prop.stringPropertyNames()) {
                System.out.println(name + "=" + prop.getProperty(name));
            }
        } else {
            System.err.println("No file found at: " + path);
        }
    }
}
