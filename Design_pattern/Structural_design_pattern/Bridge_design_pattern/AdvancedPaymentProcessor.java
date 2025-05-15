package Structural_design_pattern.Bridge_design_pattern;

public class AdvancedPaymentProcessor extends PaymentProcessor {

    public AdvancedPaymentProcessor(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void process(double amount) {
        System.out.println("Advanced Payment Processor");
        paymentMethod.processPayment(amount);
    }

    public void applyDiscount(double amount) {
        System.out.println("Applying discount for advanced processor");
        double discountedAmount = amount - (amount * 0.1);  // 10% discount
        paymentMethod.processPayment(discountedAmount);
    }
}
