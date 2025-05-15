package Behavioral_Design_Pattern.visitor_design_pattern;

// Element Interface
public interface Employee {
    void accept(Visitor visitor);
}
