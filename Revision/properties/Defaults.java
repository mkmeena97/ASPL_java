<<<<<<< HEAD
package remaining_topics.properties;
=======
package Revision.properties;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

import java.io.InputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Properties;

public class Defaults {
    public static Properties loadDefaults() {
        try (InputStream in = Defaults.class.getResourceAsStream("defaults.properties")) {
            Properties props = new Properties();
            props.load(in);
            return props;
        } catch (IOException e) {
            throw new UncheckedIOException("defaults.properties not loaded", e);
        }
    }
}
