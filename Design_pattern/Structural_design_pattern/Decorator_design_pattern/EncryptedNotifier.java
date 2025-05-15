package Structural_design_pattern.Decorator_design_pattern;

public class EncryptedNotifier extends NotifierDecorator {
    public EncryptedNotifier(Notifier notifier) {
        super(notifier);
    }

    private String encrypt(String message) {
        // Simple dummy encryption (reversing the string)
        return new StringBuilder(message).reverse().toString();
    }

    @Override
    public void send(String message) {
        String encryptedMessage = encrypt(message);
        System.out.println("Encrypting message...");
        super.send(encryptedMessage);
    }
}
