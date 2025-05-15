package Behavioral_Design_Pattern.Memento_design_pattern;

// Memento: Stores the state
public class TextMemento {
    private final String state;

    public TextMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
