package Behavioral_Design_Pattern.visitor_design_pattern;

// Visitor Interface
public interface Visitor {
    void visit(Developer developer);
    void visit(Manager manager);
}
