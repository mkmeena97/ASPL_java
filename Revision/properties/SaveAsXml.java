package remaining_topics.properties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SaveAsXml {
    public void saveProperties(String path) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("name", "Steve");
        prop.setProperty("color", "green");
        prop.setProperty("age", "23");
        File file = new File(path);
        if (!file.exists()) file.createNewFile();
        prop.storeToXML(new FileOutputStream(file), "test");
    }
}
