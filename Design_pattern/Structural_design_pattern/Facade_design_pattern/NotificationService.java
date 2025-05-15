package Structural_design_pattern.Facade_design_pattern;

// Subsystem 3: Notification Service
public class NotificationService {
    public void sendNotification(String customerName, String message) {
        System.out.println("Notification sent to " + customerName + ": " + message);
    }
}
