package Creational_design_pattern.AbstractFactory_design_pattern;

// Main.java
public class Client {
    public static void main(String[] args) {
        GUIFactory factory;

        String os = detectOS(); // Let's assume this determines OS
        if (os.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }

    // Simulated OS detection
    private static String detectOS() {
        return "Mac"; // Try changing this to "Windows"
    }

}

