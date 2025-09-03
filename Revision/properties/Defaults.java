package remaining_topics.properties;

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
