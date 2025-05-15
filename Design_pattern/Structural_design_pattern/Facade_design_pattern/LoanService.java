package Structural_design_pattern.Facade_design_pattern;

// Subsystem 2: Loan Processing
public class LoanService {
    public void applyForLoan(String customerName, double amount) {
        System.out.println("Loan application for $" + amount + " submitted by " + customerName);
    }

    public void approveLoan(String customerName) {
        System.out.println("Loan approved for " + customerName);
    }
}
