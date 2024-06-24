import javax.swing.*;
import java.awt.*;

/**
 * The Triangle class implements the Drawable interface and draws a red triangle
 * in a JFrame window
 */

public class Triangle implements Drawable{
    @Override
    public void draw() {
        /**
         * Print a red triangle in a JFrame window
         * <p>
         *Exit the application using System exit method
         *Build a new JFrame window, set size and visibility: width and heigth: 450px, visibility: true
         *adds a JPanel
         *that overrides the paintComponent method to draw a triangle.
         *</p>
         */
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the drawing color to green and fill a polygon
                g.setColor(Color.GREEN);
                int[] xPoints = {
                        200,
                        100,
                        300
                };
                int[] yPoints = {
                        100,
                        300,
                        300
                };
                g.fillPolygon(xPoints, yPoints, 3);
            }
        };

        // Add the panel to the frame
        frame.add(panel);
    }
}
