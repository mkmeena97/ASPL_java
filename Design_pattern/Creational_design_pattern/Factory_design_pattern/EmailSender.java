package Creational_design_pattern.Factory_design_pattern;

public class EmailSender implements NotificationSender {
    @Override
    public boolean send(String recipient, String message) {
        System.out.println("Email sent to " + recipient + ": " + message);
        return true;
    }
}

