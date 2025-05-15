package Behavioral_Design_Pattern.Mediator_design_pattern;

// Mediator Interface
public interface ChatMediator {
    void sendMessage(String message, String from);
    void addUser(User user);
}
