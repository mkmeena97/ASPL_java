package remaining_topics.drawandfill;

import javax.swing.*;
import java.awt.*;

public class DrawOvalExample extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // Fill the oval with green
        g2.setColor(Color.GREEN);
        g2.fillOval(70, 70, 150, 100);

        // Draw border with black
        g2.setColor(Color.BLACK);
        g2.drawOval(70, 70, 150, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Oval Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.add(new DrawOvalExample());
        frame.setVisible(true);
    }
}
