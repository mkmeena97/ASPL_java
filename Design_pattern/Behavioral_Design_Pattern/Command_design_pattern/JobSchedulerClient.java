package Behavioral_Design_Pattern.Command_design_pattern;

public class JobSchedulerClient {
    public static void main(String[] args) {
        // Services
        EmailService emailService = new EmailService();
        ReportService reportService = new ReportService();

        // Jobs (Commands)
        Job emailJob = new EmailJob(emailService, "mahendra@audilytics.com", "Weekly Update");
        Job reportJob = new ReportJob(reportService, "Performance");

        //Jobs(commands)
        Job emailJob1 = new EmailJob(emailService, "mahendra@audilytics.com", "Monthly Update");
        Job reportJob1 = new ReportJob(reportService, "Wifi Bill");

        // Queue (Invoker)
        JobQueue queue = new JobQueue();
        queue.addJob(emailJob);
        queue.addJob(reportJob);
        queue.addJob(emailJob1);
        queue.addJob(reportJob1);

        // Process all jobs
        queue.processJobs();
    }
}
