package Behavioral_Design_Pattern.State_design_pattern;

// State interface
public interface OrderState {
    void next(OrderContext context);
    void cancel(OrderContext context);
    String getStatus();
}
