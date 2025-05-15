package Behavioral_Design_Pattern.State_design_pattern;

// Client code
public class StatePatternDemo {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.next();  // New -> Processed
        order.next();  // Processed -> Shipped
        order.cancel();  // Trying to cancel after shipped
        order.next();  // No further states

        System.out.println("Final Order Status: " + order.getStatus());
    }
}

