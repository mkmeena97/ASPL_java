package Behavioral_Design_Pattern.State_design_pattern;

public class ProcessedState implements OrderState {
    @Override
    public void next(OrderContext context) {
        context.setState(new ShippedState());
    }

    @Override
    public void cancel(OrderContext context) {
        context.setState(new CancelledState());
    }

    @Override
    public String getStatus() {
        return "Processed";
    }
}
