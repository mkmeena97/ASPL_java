package Structural_design_pattern.Facade_design_pattern;

// Client
public class BankingFacadeDemo {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade();

        String customer = "Mahendra";

        bankFacade.openAccountAndNotify(customer);
        bankFacade.applyForLoanAndNotify(customer, 50000);
        bankFacade.approveLoanAndNotify(customer);
        bankFacade.closeAccountAndNotify(customer);
    }
}

