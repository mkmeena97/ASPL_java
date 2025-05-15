package Behavioral_Design_Pattern.Memento_design_pattern;

// Originator: The object whose state is saved/restored
public class TextEditor {
    private String text;

    public void write(String newText) {
        text = newText;
        System.out.println("Current Text: " + text);
    }

    public TextMemento save() {
        System.out.println("Saving state.");
        return new TextMemento(text);
    }

    public void restore(TextMemento memento) {
        text = memento.getState();
        System.out.println("Restored to: " + text);
    }
}
