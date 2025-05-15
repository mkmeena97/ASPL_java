package Creational_design_pattern.Factory_design_pattern;

public class PushSender implements NotificationSender {
    @Override
    public boolean send(String recipient, String message) {
        System.out.println("Push notification sent to " + recipient + ": " + message);
        return true;
    }
}

