package Behavioral_Design_Pattern.Template_design_pattern;

// Concrete class for Technical Report
public class TechnicalReport extends ReportGenerator {
    @Override
    protected void fetchData() {
        System.out.println("Fetching technical data from system logs and databases...");
    }

    @Override
    protected void analyzeData() {
        System.out.println("Analyzing system performance, errors, and code metrics...");
    }

    @Override
    protected void formatReport() {
        System.out.println("Formatting technical report with graphs and logs summary.");
    }
}
