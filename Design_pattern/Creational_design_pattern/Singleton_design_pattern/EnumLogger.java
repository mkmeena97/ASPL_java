package Creational_design_pattern.Singleton_design_pattern;

// Enum-based Singleton (Most Robust & Simple & recommended way by Joshua Bloch (Effective Java) for singletons.)
//Thread-safe
//Serialization-safe
//Reflection-safe
public enum EnumLogger {
    INSTANCE;

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }

    public static void main(String[] args) {
        EnumLogger logger = EnumLogger.INSTANCE;
        logger.log("Enum-based logger initialized");

        EnumLogger anotherLogger = EnumLogger.INSTANCE;
        anotherLogger.log("Still using the same instance");

        System.out.println("Are both instances the same? " + (logger == anotherLogger));
    }
}
