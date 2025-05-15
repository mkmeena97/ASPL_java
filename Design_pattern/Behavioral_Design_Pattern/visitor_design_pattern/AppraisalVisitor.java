package Behavioral_Design_Pattern.visitor_design_pattern;

// Concrete Visitor 2: Appraisal Evaluator
public class AppraisalVisitor implements Visitor {
    @Override
    public void visit(Developer developer) {
        System.out.println("Appraisal for Developer " + developer.getName() + ": ₹" + (developer.getSalary() * 0.1));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("Appraisal for Manager " + manager.getName() + ": ₹" + (manager.getSalary() * 0.15));
    }
}
