package Behavioral_Design_Pattern.Template_design_pattern;

// Concrete class for HR Report
public class HRReport extends ReportGenerator {
    @Override
    protected void fetchData() {
        System.out.println("Fetching employee attendance and performance data...");
    }

    @Override
    protected void analyzeData() {
        System.out.println("Analyzing leave patterns, appraisals, and onboarding status...");
    }

    @Override
    protected void formatReport() {
        System.out.println("Formatting HR report in tabular and chart formats.");
    }
}
