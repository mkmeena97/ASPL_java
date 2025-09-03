package remaining_topics.drawandfill;

import javax.swing.*;
import java.awt.*;

public class DrawRectangleExample extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Graphics2D casting for advanced drawing
        Graphics2D g2 = (Graphics2D) g;

        // Set color for filling
        g2.setColor(Color.BLUE);
        g2.fillRect(50, 50, 150, 100);

        // Set color for border
        g2.setColor(Color.RED);
        g2.drawRect(50, 50, 150, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangle Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.add(new DrawRectangleExample());
        frame.setVisible(true);
    }
}
