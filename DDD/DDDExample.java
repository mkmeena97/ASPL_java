class Money {
    private final int amount;

    public Money(int amount) {
        if(amount < 0) throw new IllegalArgumentException("Amount can't be negative");
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

class BankAccount {
    private String accountNumber;
    private Money balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = new Money(0);
    }

    public void deposit(Money amount) {
        // Business rule: deposit positive amount
        this.balance = new Money(this.balance.getAmount() + amount.getAmount());
        System.out.println("Deposited: " + amount.getAmount());
        // Domain Event: MoneyDeposited
    }

    public void withdraw(Money amount) {
        if(amount.getAmount() > this.balance.getAmount()) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        this.balance = new Money(this.balance.getAmount() - amount.getAmount());
        System.out.println("Withdrawn: " + amount.getAmount());
        // Domain Event: MoneyWithdrawn
    }

    public Money getBalance() {
        return balance;
    }
}

public class DDDExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345");
        account.deposit(new Money(500));
        account.withdraw(new Money(200));
        System.out.println("Current Balance: " + account.getBalance().getAmount());
    }
}
