package Structural_design_pattern.Decorator_design_pattern;

public class LoggingNotifier extends NotifierDecorator {
    public LoggingNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("Logging: Sending a notification...");
        super.send(message);
    }
}
