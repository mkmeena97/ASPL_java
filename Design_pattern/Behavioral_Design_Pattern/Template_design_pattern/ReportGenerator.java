package Behavioral_Design_Pattern.Template_design_pattern;

// Abstract class (template)
public abstract class ReportGenerator {
    // Template method
    public final void generateReport() {
        fetchData();
        analyzeData();
        formatReport();
        printReport();
    }

    // Steps that may vary
    protected abstract void fetchData();
    protected abstract void analyzeData();
    protected abstract void formatReport();

    // Common step
    protected void printReport() {
        System.out.println("Printing the report...\n");
    }
}
