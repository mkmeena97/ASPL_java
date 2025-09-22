// 1. Define Events
public interface AccountEvent {}

// When a new account is created
public class AccountCreatedEvent implements AccountEvent {
    private final String accountId;
    private final String owner;

    public AccountCreatedEvent(String accountId, String owner) {
        this.accountId = accountId;
        this.owner = owner;
    }
    public String getAccountId() { return accountId; }
    public String getOwner() { return owner; }
}

// When money is deposited
public class MoneyDepositedEvent implements AccountEvent {
    private final String accountId;
    private final double amount;

    public MoneyDepositedEvent(String accountId, double amount) {
        this.accountId = accountId;
        this.amount = amount;
    }
    public String getAccountId() { return accountId; }
    public double getAmount() { return amount; }
}

// When money is withdrawn
public class MoneyWithdrawnEvent implements AccountEvent {
    private final String accountId;
    private final double amount;

    public MoneyWithdrawnEvent(String accountId, double amount) {
        this.accountId = accountId;
        this.amount = amount;
    }
    public String getAccountId() { return accountId; }
    public double getAmount() { return amount; }
}

//2. Event Store (instead of saving current state, save every event) 
public class EventStore {
    // In real life → use Kafka, EventStoreDB, or a database table
    private final Map<String, List<AccountEvent>> store = new HashMap<>();

    // Save event to account stream
    public void saveEvent(String accountId, AccountEvent event) {
        store.computeIfAbsent(accountId, id -> new ArrayList<>()).add(event);
    }

    // Load all events of an account (to rebuild state later)
    public List<AccountEvent> getEvents(String accountId) {
        return store.getOrDefault(accountId, Collections.emptyList());
    }
}

//3. Aggregate (rebuild account state by replaying events)
public class BankAccount {
    private String accountId;
    private String owner;
    private double balance;

    // Rebuild account state by applying all events
    public static BankAccount recreateFrom(List<AccountEvent> events) {
        BankAccount account = new BankAccount();
        for (AccountEvent event : events) {
            account.apply(event);
        }
        return account;
    }

    // Apply event changes to current state
    private void apply(AccountEvent event) {
        if (event instanceof AccountCreatedEvent e) {
            this.accountId = e.getAccountId();
            this.owner = e.getOwner();
            this.balance = 0.0;
        } else if (event instanceof MoneyDepositedEvent e) {
            this.balance += e.getAmount();
        } else if (event instanceof MoneyWithdrawnEvent e) {
            this.balance -= e.getAmount();
        }
    }

    // Just for printing
    @Override
    public String toString() {
        return "Account{" +
                "id='" + accountId + '\'' +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}

//  4. Usage Example
public class EventSourcingDemo {
    public static void main(String[] args) {
        EventStore eventStore = new EventStore();

        // Step 1: Save events (user actions)
        eventStore.saveEvent("A1", new AccountCreatedEvent("A1", "Mahendra"));
        eventStore.saveEvent("A1", new MoneyDepositedEvent("A1", 1000));
        eventStore.saveEvent("A1", new MoneyWithdrawnEvent("A1", 200));
        eventStore.saveEvent("A1", new MoneyDepositedEvent("A1", 500));

        // Step 2: Rebuild account from past events
        BankAccount account = BankAccount.recreateFrom(eventStore.getEvents("A1"));

        // Step 3: Print final state (calculated from events, not DB row)
        System.out.println(account);
        // Output: Account{id='A1', owner='Mahendra', balance=1300.0}
    }
}
