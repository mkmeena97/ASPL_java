import java.util.*;

class Event {
    String type;
    int amount;

    Event(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }
}

 class BankAccount {
    List<Event> eventStore = new ArrayList<>();

    // Deposit add karein
    public void deposit(int amount) {
        eventStore.add(new Event("deposit", amount));
    }

    // Withdraw add karein
    public void withdraw(int amount) {
        eventStore.add(new Event("withdraw", amount));
    }

    // Current balance nikalein (poora event history replay karke)
    public int getBalance() {
        int balance = 0;
        for (Event e : eventStore) {
            if (e.type.equals("deposit")) {
                balance += e.amount;
            } else if (e.type.equals("withdraw")) {
                balance -= e.amount;
            }
        }
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(30);
        account.deposit(50);

        System.out.println("Current balance: " + account.getBalance()); // Output: Current balance: 120
    }
}
