package Creational_design_pattern.Factory_design_pattern;

public class SMSSender implements NotificationSender {
    @Override
    public boolean send(String recipient, String message) {
        System.out.println("SMS sent to " + recipient + ": " + message);
        return true;
    }
}

