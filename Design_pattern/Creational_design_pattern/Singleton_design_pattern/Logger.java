package Creational_design_pattern.Singleton_design_pattern;

public class Logger {

    // Step 1: Create a private static instance of the same class
    private static Logger instance;

    // Step 2: Private constructor prevents instantiation from other classes
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Step 3: Public method to provide global access point
//    public static Logger getInstance() {
//        if (instance == null) {
//            // Lazy initialization
//            instance = new Logger();
//        }
//        return instance;
//    }

    //Step:3 Public method to provide global access point
    // If application is multi-threaded, wrap the getInstance() method with synchronized to make it thread-safe
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }


    // Logger functionality
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started");

        Logger logger2 = Logger.getInstance();
        logger2.log("User logged in");

        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton works).");
        } else {
            System.out.println("Different instances (Singleton failed).");
        }
    }
}

