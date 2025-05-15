package Behavioral_Design_Pattern.Mediator_design_pattern;

// Colleague Interface
public abstract class User {
    protected String name;
    protected ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void receive(String message, String from);

    public String getName() {
        return name;
    }
}
