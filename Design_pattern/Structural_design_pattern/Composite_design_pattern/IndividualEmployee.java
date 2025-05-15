package Structural_design_pattern.Composite_design_pattern;

public class IndividualEmployee implements Employee {
    private String name;
    private String designation;

    public IndividualEmployee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    @Override
    public void showDetails() {
        System.out.println(designation + ": " + name);
    }
}

