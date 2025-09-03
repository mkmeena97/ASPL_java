package remaining_topics.properties;

import java.io.*;
import java.util.Properties;

public class PropToXML {
    public static void saveProperties(String location) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("name", "Steve");
        prop.setProperty("color", "green");
        prop.setProperty("age", "23");

        File file = new File(location);
        File parentDir = file.getParentFile();
        if (parentDir != null && !parentDir.exists()) {
            parentDir.mkdirs(); // Create directory if it doesn't exist
        }

        if (!file.exists()) {
            file.createNewFile();
        }

        // Save as XML file
        prop.storeToXML(new FileOutputStream(file), "testing properties with xml");
    }

    public static void main(String[] args) throws IOException {
//        saveProperties("config.xml");
        loadProperties("config.xml");
    }
    public static void loadProperties(String location) throws FileNotFoundException, IOException{
        // make new properties instance to load the file into
        Properties prop = new Properties();

        // check to make sure the file exists
        File file = new File(location);
        if (file.exists()){
            // load the file
            prop.loadFromXML(new FileInputStream(file));

            // print out all the properties
            for (String name : prop.stringPropertyNames()){
                System.out.println(name + "=" + prop.getProperty(name));
            }
        } else {
            System.err.println("Error: No file found at: " + location);
        }
    }
}
