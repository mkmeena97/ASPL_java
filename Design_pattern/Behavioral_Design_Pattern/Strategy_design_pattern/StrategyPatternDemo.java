package Behavioral_Design_Pattern.Strategy_design_pattern;

// Client code
public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Paying with Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "Mahendra"));
        paymentContext.executePayment(5000);

        // Paying with PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("mahendra@example.com"));
        paymentContext.executePayment(2500);

        // Paying with UPI
        paymentContext.setPaymentStrategy(new UPIPayment("mahendra@upi"));
        paymentContext.executePayment(1000);
    }
}

