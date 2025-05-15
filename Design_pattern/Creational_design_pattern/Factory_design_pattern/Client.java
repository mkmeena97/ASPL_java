package Creational_design_pattern.Factory_design_pattern;

public class Client {
    public static void notifyUser(String type, String recipient, String message) {
        try {
            NotificationSender sender = NotificationFactory.createSender(type);
            boolean success = sender.send(recipient, message);
            if (success) {
                System.out.println("Notification sent successfully\n");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        notifyUser("email", "mahendra@gmail.com", "Welcome to our platform!");
        notifyUser("sms", "+917665770360", "Your OTP is 4321");
        notifyUser("push", "mkmeena123", "You have a new follower!");
    }
}

