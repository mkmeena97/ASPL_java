package Behavioral_Design_Pattern.Command_design_pattern;

public class EmailService {
    public void sendEmail(String to, String subject) {
        System.out.println("Sending Email to " + to + ": " + subject);
    }
}
