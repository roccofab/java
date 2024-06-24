import java.awt.*;
import javax.swing.*;

/**
 * The Circle class implements the Drawable interface and draws a red circle
 * in a JFrame window
 */
public class Circle implements Drawable{
    @Override
    public void draw() {
        /**
         * Print a red circle in a JFrame window
         * <p>
         *     This method build a new JFrame window, set size and visibility,
         *     and then add a JPanel for custom drawing
         * </p>
         */
        JFrame frame = new JFrame();   //create a new JFrame for displaying the circle
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.setVisible(true);

        JPanel panel = new JPanel() {  // Create a JPanel for custom drawing
            /**
             * set circle color to red and fill an oval:
             * 100px for the x coordinate of the upper left corner
             * 100px for the y coordinate of the upper left corner
             * 200px for the width of the oval
             * 200px for the height of the oval
             * @param g the <code>Graphics</code> object to protect
             */
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //Set the drawing color to red and fill an oval
                g.setColor(Color.RED);
                g.fillOval(100, 100, 200, 200);
            }
        };
        frame.add(panel);  //add the panel to the frame
    }
}
