package Structural_design_pattern.Facade_design_pattern;

// Facade
public class BankFacade {
    private AccountService accountService;
    private LoanService loanService;
    private NotificationService notificationService;

    public BankFacade() {
        this.accountService = new AccountService();
        this.loanService = new LoanService();
        this.notificationService = new NotificationService();
    }

    public void openAccountAndNotify(String customerName) {
        accountService.openAccount(customerName);
        notificationService.sendNotification(customerName, "Your account has been successfully opened.");
    }

    public void applyForLoanAndNotify(String customerName, double amount) {
        loanService.applyForLoan(customerName, amount);
        notificationService.sendNotification(customerName, "Your loan application has been received.");
    }

    public void approveLoanAndNotify(String customerName) {
        loanService.approveLoan(customerName);
        notificationService.sendNotification(customerName, "Congratulations! Your loan has been approved.");
    }

    public void closeAccountAndNotify(String customerName) {
        accountService.closeAccount(customerName);
        notificationService.sendNotification(customerName, "Your account has been closed.");
    }
}
