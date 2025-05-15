package Behavioral_Design_Pattern.Mediator_design_pattern;

// Concrete Colleagues
public class TeamMember extends User {
    public TeamMember(String name, ChatMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, name);
    }

    @Override
    public void receive(String message, String from) {
        System.out.println(name + " receives from " + from + ": " + message);
    }
}
