import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.prefs.Preferences;

public class ExitConfirmerDemo {

    private static final Preferences prefs = Preferences.userNodeForPackage(ExitConfirmerDemo.class);

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Exit Preference Demo");
            frame.setSize(400, 200);
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

            JButton exitButton = new JButton("Exit");
            exitButton.addActionListener(e -> handleExit(frame));

            frame.setLayout(new FlowLayout());
            frame.add(exitButton);
            frame.setVisible(true);

            // Add window close listener
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    handleExit(frame);
                }
            });
        });
    }

    private static void handleExit(JFrame frame) {
        boolean showConfirm = prefs.getBoolean("showExitConfirmation", true);

        if (!showConfirm) {
            System.exit(0);
        }

        JCheckBox dontAskAgain = new JCheckBox("Don't ask me again");
        Object[] options = {"Yes", "No"};
        Object[] params = {"Are you sure you want to exit?", dontAskAgain};

        int result = JOptionPane.showOptionDialog(frame,
                params,
                "Exit Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);

        if (result == JOptionPane.YES_OPTION) {
            if (dontAskAgain.isSelected()) {
                prefs.putBoolean("showExitConfirmation", false);
            }
            System.exit(0);
        }
    }
}

