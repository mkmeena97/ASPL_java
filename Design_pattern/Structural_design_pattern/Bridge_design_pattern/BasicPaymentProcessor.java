package Structural_design_pattern.Bridge_design_pattern;

public class BasicPaymentProcessor extends PaymentProcessor {

    public BasicPaymentProcessor(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void process(double amount) {
        System.out.println("Basic Payment Processor");
        paymentMethod.processPayment(amount);
    }
}
