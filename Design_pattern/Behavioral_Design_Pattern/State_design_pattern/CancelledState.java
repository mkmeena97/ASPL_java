package Behavioral_Design_Pattern.State_design_pattern;

public class CancelledState implements OrderState {
    @Override
    public void next(OrderContext context) {
        System.out.println("Order is cancelled. No further states.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Order is already cancelled.");
    }

    @Override
    public String getStatus() {
        return "Cancelled";
    }
}
