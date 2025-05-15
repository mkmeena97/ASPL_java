package Structural_design_pattern.Decorator_design_pattern;

public class TimestampNotifier extends NotifierDecorator {
    public TimestampNotifier(Notifier notifier) {
        super(notifier);
    }

    private String addTimestamp(String message) {
        return "[" + java.time.LocalDateTime.now() + "] " + message;
    }

    @Override
    public void send(String message) {
        String timedMessage = addTimestamp(message);
        super.send(timedMessage);
    }
}
