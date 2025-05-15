package Creational_design_pattern.Singleton_design_pattern;

//Bill Pugh Singleton Implementation (Lazy and Thread-Safe)
//Uses a static inner helper class
//The instance is created only when getInstance() is called.
//Thread-safe without synchronized.
public class ConfigurationManager {

    // Private constructor
    private ConfigurationManager() {
        System.out.println("Loading configuration...");
    }

    // Static inner helper class - loaded only when needed
    private static class Holder {
        private static final ConfigurationManager INSTANCE = new ConfigurationManager();
    }

    // Public method to provide access
    public static ConfigurationManager getInstance() {
        return Holder.INSTANCE;
    }

    public String getProperty(String key) {
        // Simulate fetching configuration
        return switch (key) {
            case "app.name" -> "Hackathon Portal";
            case "app.version" -> "1.0.0";
            default -> "Unknown";
        };
    }

    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        System.out.println("App Name: " + config.getProperty("app.name"));
        System.out.println("Version: " + config.getProperty("app.version"));
    }

}

