package Behavioral_Design_Pattern.Observer_design_pattern;

// Concrete Observer 1
public class PayrollSystem implements Observer {
    @Override
    public void update(String employeeName, String status) {
        System.out.println("Payroll System: Updating payroll records for " + employeeName + " with status: " + status);
    }
}
