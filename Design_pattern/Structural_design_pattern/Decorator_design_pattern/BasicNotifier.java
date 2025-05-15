package Structural_design_pattern.Decorator_design_pattern;

public class BasicNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending notification: " + message);
    }
}
