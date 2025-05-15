package Behavioral_Design_Pattern.visitor_design_pattern;

// Concrete Elements
public class Developer implements Employee {
    String name;
    double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
