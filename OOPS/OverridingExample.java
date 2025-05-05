package OOPS;

// Parent Class
class Payment {
    public void processPayment() {
        System.out.println("Processing payment...");
    }
}

// Child Class (Overrides method)
class BitcoinPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing Bitcoin Payment...");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Payment p1 = new Payment();
        p1.processPayment(); // Calls parent method

        Payment p2 = new BitcoinPayment();
        p2.processPayment(); // Calls overridden method
    }
}

