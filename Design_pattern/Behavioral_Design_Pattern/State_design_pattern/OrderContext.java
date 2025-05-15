package Behavioral_Design_Pattern.State_design_pattern;

// Context class
public class OrderContext {
    private OrderState state;

    public OrderContext() {
        state = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.state = state;
        System.out.println("Order status changed to: " + state.getStatus());
    }

    public void next() {
        state.next(this);
    }

    public void cancel() {
        state.cancel(this);
    }

    public String getStatus() {
        return state.getStatus();
    }
}
