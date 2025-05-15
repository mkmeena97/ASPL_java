package Behavioral_Design_Pattern.visitor_design_pattern;

// Client Code
public class VisitorPatternDemo {
    public static void main(String[] args) {
        Employee dev = new Developer("Mahendra", 80000);
        Employee mgr = new Manager("Tejas", 100000);

        Visitor taxVisitor = new TaxVisitor();
        Visitor appraisalVisitor = new AppraisalVisitor();

        System.out.println("=== Tax Calculation ===");
        dev.accept(taxVisitor);
        mgr.accept(taxVisitor);

        System.out.println("\n=== Appraisal Calculation ===");
        dev.accept(appraisalVisitor);
        mgr.accept(appraisalVisitor);
    }
}

