package Behavioral_Design_Pattern.Mediator_design_pattern;

import java.util.HashMap;
import java.util.Map;

// Concrete Mediator
public class TeamChatRoom implements ChatMediator {
    private Map<String, User> users = new HashMap<>();

    @Override
    public void addUser(User user) {
        users.put(user.getName(), user);
    }

    @Override
    public void sendMessage(String message, String from) {
        for (User user : users.values()) {
            // Avoid sending message to sender
            if (!user.getName().equals(from)) {
                user.receive(message, from);
            }
        }
    }
}
