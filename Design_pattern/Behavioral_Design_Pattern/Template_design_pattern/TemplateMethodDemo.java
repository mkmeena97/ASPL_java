package Behavioral_Design_Pattern.Template_design_pattern;

// Client code
public class TemplateMethodDemo {
    public static void main(String[] args) {
        ReportGenerator techReport = new TechnicalReport();
        System.out.println("Generating Technical Report:");
        techReport.generateReport();

        ReportGenerator hrReport = new HRReport();
        System.out.println("Generating HR Report:");
        hrReport.generateReport();
    }
}

