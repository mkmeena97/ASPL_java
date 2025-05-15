package Behavioral_Design_Pattern.Memento_design_pattern;

import java.util.Stack;

public class UndoManager {
    private Stack<TextMemento> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            TextMemento memento = history.pop();
            editor.restore(memento);
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}
