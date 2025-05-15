package Behavioral_Design_Pattern.Command_design_pattern;

public class ReportJob implements Job {
    private ReportService reportService;
    private String reportType;

    public ReportJob(ReportService reportService, String reportType) {
        this.reportService = reportService;
        this.reportType = reportType;
    }

    public void execute() {
        reportService.generateReport(reportType);
    }
}
