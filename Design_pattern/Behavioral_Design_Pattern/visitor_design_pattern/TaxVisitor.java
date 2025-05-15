package Behavioral_Design_Pattern.visitor_design_pattern;

// Concrete Visitor 1: Tax Calculator
public class TaxVisitor implements Visitor {
    @Override
    public void visit(Developer developer) {
        System.out.println("Tax for Developer " + developer.getName() + ": ₹" + (developer.getSalary() * 0.2));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("Tax for Manager " + manager.getName() + ": ₹" + (manager.getSalary() * 0.25));
    }
}
