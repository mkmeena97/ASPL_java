<<<<<<< HEAD
package remaining_topics.properties;
=======
package Revision.properties;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

import java.io.*;
import java.util.Properties;

public class PropToXML {
    public static void saveProperties(String location) throws IOException {
        Properties prop = new Properties();
<<<<<<< HEAD
        prop.setProperty("name", "Steve");
        prop.setProperty("color", "green");
        prop.setProperty("age", "23");
=======
        prop.setProperty("name", "Mahendra");
        prop.setProperty("color", "Blcak");
        prop.setProperty("age", "27");
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

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
<<<<<<< HEAD
//        saveProperties("config.xml");
        loadProperties("config.xml");
=======
        saveProperties("config.xml");
//        loadProperties("config.xml");
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247
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
