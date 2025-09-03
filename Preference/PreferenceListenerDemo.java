import java.util.prefs.*;

public class PreferenceListenerDemo {

    private static final String THEME_KEY = "theme";

    public static void main(String[] args) throws Exception {
        Preferences prefs = Preferences.userNodeForPackage(PreferenceListenerDemo.class);

        // Set default theme (only once)
        if (prefs.get(THEME_KEY, null) == null) {
            prefs.put(THEME_KEY, "LIGHT");
        }

        // Add listener for changes in theme
        prefs.addPreferenceChangeListener(evt -> {
            if (evt.getKey().equals(THEME_KEY)) {
                String newTheme = evt.getNewValue();
                System.out.println("Theme changed to: " + newTheme);
                // Call method to apply the theme here
                applyTheme(newTheme);
            }
        });

        System.out.println("Initial Theme: " + prefs.get(THEME_KEY, "LIGHT"));
        System.out.println("Waiting for preference change...");

        // Simulate theme change after some delay
        Thread.sleep(5000);
        System.out.println("Changing theme to DARK");
        prefs.put(THEME_KEY, "DARK");

        Thread.sleep(5000); // Keep program alive to catch events
    }

    private static void applyTheme(String theme) {
        System.out.println("[App is now using " + theme + " theme]");
        // Here you can actually apply theme in UI
    }
}

