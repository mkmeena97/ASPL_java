package OOPS;

class PaymentSystem {
    // Overloaded method for credit card
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }

    // Overloaded method for PayPal
    public void pay(int amount, String email) {
        System.out.println("Paid $" + amount + " using PayPal: " + email);
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        PaymentSystem payment = new PaymentSystem();
        payment.pay(100);              // Credit Card
        payment.pay(200, "user@email.com"); // PayPal
    }
}

