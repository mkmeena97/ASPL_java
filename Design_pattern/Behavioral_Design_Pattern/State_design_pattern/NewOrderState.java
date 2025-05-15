package Behavioral_Design_Pattern.State_design_pattern;

// Concrete States
public class NewOrderState implements OrderState {
    @Override
    public void next(OrderContext context) {
        context.setState(new ProcessedState());
    }

    @Override
    public void cancel(OrderContext context) {
        context.setState(new CancelledState());
    }

    @Override
    public String getStatus() {
        return "New";
    }
}
