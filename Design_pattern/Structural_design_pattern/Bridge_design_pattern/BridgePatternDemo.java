package Structural_design_pattern.Bridge_design_pattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        // Creating payment methods
        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentMethod payPalPayment = new PayPalPayment();

        // Using basic payment processor with credit card
        PaymentProcessor basicProcessor = new BasicPaymentProcessor(creditCardPayment);
        basicProcessor.process(100.00);

        // Using advanced payment processor with PayPal
        PaymentProcessor advancedProcessor = new AdvancedPaymentProcessor(payPalPayment);
        advancedProcessor.process(200.00);
        ((AdvancedPaymentProcessor) advancedProcessor).applyDiscount(200.00);
    }
}
