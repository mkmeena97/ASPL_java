package Structural_design_pattern.Bridge_design_pattern;

public abstract class PaymentProcessor {
    protected PaymentMethod paymentMethod;  // "Bridge" - link between abstraction and implementation

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public abstract void process(double amount);
}
