package Behavioral_Design_Pattern.Strategy_design_pattern;

// Context
public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        if (strategy == null) {
            System.out.println("Please select a payment method.");
        } else {
            strategy.pay(amount);
        }
    }
}
