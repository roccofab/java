import java.awt.*;
import javax.swing.*;

/**
 * The Rectangle class implements the Drawable interface and draws a red rectangle
 * in a JFrame window
 */
public class Rectangle implements Drawable{
    @Override
    public void draw() {
        /**
         * <p>
         * Exit the application using System exit method
         * Build a new JFrame window, set size and visibility: width and heigth: 450px, visibility: true
         *and then add a JPanel for custom drawing
         * </p>
         */
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.setVisible(true);

        JPanel panel = new JPanel() {  // Create a JPanel for custom drawing
            @Override
            protected void paintComponent(Graphics g) {
                /**
                 * Set rectangle color to red
                 * Fills rectangle: left, right edges of 100px
                 * top and bottom edges of 200px
                 * @param g the <code>Graphics</code> object to protect
                 */
                super.paintComponent(g);
                //Set the drawing color to red and fill an oval
                g.setColor(Color.RED);
                g.fillRect(100, 100, 200, 200);
            }
        };
        frame.add(panel);  //add the panel to the frame
    }
}
