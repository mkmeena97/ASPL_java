package Behavioral_Design_Pattern.State_design_pattern;

public class ShippedState implements OrderState {
    @Override
    public void next(OrderContext context) {
        System.out.println("Order is already shipped. No further states.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Cannot cancel. Order already shipped.");
    }

    @Override
    public String getStatus() {
        return "Shipped";
    }
}
