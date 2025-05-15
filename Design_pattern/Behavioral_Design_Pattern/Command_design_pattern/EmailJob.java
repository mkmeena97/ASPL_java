package Behavioral_Design_Pattern.Command_design_pattern;

public class EmailJob implements Job {
    private EmailService emailService;
    private String to;
    private String subject;

    public EmailJob(EmailService service, String to, String subject) {
        this.emailService = service;
        this.to = to;
        this.subject = subject;
    }

    public void execute() {
        emailService.sendEmail(to, subject);
    }
}
