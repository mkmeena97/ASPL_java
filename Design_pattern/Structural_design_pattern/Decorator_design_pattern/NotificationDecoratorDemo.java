package Structural_design_pattern.Decorator_design_pattern;

public class NotificationDecoratorDemo {
    public static void main(String[] args) {
        Notifier notifier = new BasicNotifier();

        // Decorating the notifier dynamically
        Notifier encryptedNotifier = new EncryptedNotifier(notifier);
        Notifier loggedEncryptedNotifier = new LoggingNotifier(encryptedNotifier);
        Notifier fullyDecoratedNotifier = new TimestampNotifier(loggedEncryptedNotifier);

        fullyDecoratedNotifier.send("Hello, Mahendra! This is your notification.");
    }
}
