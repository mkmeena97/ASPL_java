package Behavioral_Design_Pattern.Memento_design_pattern;

// Client code
public class MementoDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        UndoManager undoManager = new UndoManager();

        editor.write("Hello");
        undoManager.save(editor);

        editor.write("Hello, Mahendra!");
        undoManager.save(editor);

        editor.write("Hello, Mahendra! Welcome to Audilytics Solutions.");

        System.out.println("\nUndoing changes:");
        undoManager.undo(editor);
        undoManager.undo(editor);
        undoManager.undo(editor);  // Nothing to undo
    }
}

