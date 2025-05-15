package Creational_design_pattern.Factory_design_pattern;

public class NotificationFactory {
    public static NotificationSender createSender(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return new EmailSender();
            case "sms":
                return new SMSSender();
            case "push":
                return new PushSender();
            default:
                throw new IllegalArgumentException("Unsupported notification type: " + type);
        }
    }
}

