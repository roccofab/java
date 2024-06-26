import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * GUI application for calculating the velocity of an object.
 * The application provides input TextFields position 1, position2, time and button to send click events
 * Layout Components are managed with GridBagLayout.
 * When the "CALCULATE" button is pressed or Enter Key is pressed, it returns the velocity in meters per second (m/s)
 * and kilometers per hour (km/h) based on the provided inputs.
 *
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Velocity Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Set EXIT_ON_CLOSE as DefaultCloseOperation
        frame.setSize(500, 350);  //page default size
        frame.setLayout(new GridBagLayout());  //Set GridBagLayout as LayoutManager using GridBagLayout class
        /*if the component is null, or the GraphicsConfiguration associated
          with this component is null, the window is placed in the center of the screen
         */
        frame.setLocationRelativeTo(null);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); //set margins of the GridBagLayout components
        gbc.fill = GridBagConstraints.HORIZONTAL; //: Make the component wide enough to fill its display area(1 column) horizontally

        JLabel label1 = new JLabel("POSITION 1"); //textfield's 1 label
        JTextField pos1 = new JTextField();
        pos1.setPreferredSize(new Dimension(100, 30));  //set size of the textfield pos1

        JLabel label2 = new JLabel("POSITION 2");  //textfield's 2 label
        JTextField pos2 = new JTextField();
        pos2.setPreferredSize(new Dimension(100, 30));  //set size of the textfield pos2

        JLabel label3 = new JLabel("TIME"); //textfield's 3 label'
        JTextField time = new JTextField();
        time.setPreferredSize(new Dimension(100, 30)); //set size of the textfield time

        JButton button = new JButton("CALCULATE");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setPreferredSize(new Dimension(100, 30));  //set size of the button

        JLabel resultLab1 = new JLabel("Velocity(m/s): ");  //label area to display string
        JLabel resultLab2 = new JLabel("Velocity(km/h): ");

        pos1.addKeyListener(new KeyAdapter() { //add a new KeyAdapter to pos1 TextField for Enter click management
            /**
             * handle the "Enter" key event and update the position 2
             * @param e the event to be processed
             */
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    pos2.requestFocus();
                }
            }
        });

        pos2.addKeyListener(new KeyAdapter() {  //add a new KeyAdapter to pos2 TextField for Enter button click management
            /**
             * handle the "Enter" key event and update the time TextField
             * @param e the event to be processed
             */
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    time.requestFocus();
                }
            }
        });

        time.addKeyListener(new KeyAdapter() {  //add a new KeyAdapter to time TextField for Enter button click management
            @Override
            /**
             * handle the "Enter" key event and send the button Calculate
             * @param e the event to be processed
             */
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    button.doClick();
                }
            }
        });
        //set position of label1 in the column 1 of the row 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(label1, gbc);

        //set position of TextField pos1 in column 2 of the row 1
        gbc.gridx = 1;
        frame.add(pos1, gbc);

        //set position of label2 in row 2 of the column 1
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(label2, gbc);

        //set position of TextField pos2 in  column 2 of  row 2
        gbc.gridx = 1;
        frame.add(pos2, gbc);

        //set position of label3 in column 1 of row 3
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(label3, gbc);

        //set position of TextField time in column 2 of row 3
        gbc.gridx = 1;
        frame.add(time, gbc);

        //set position of button in column 2 of row 4
        gbc.gridx = 1;
        gbc.gridy = 3;
        frame.add(button, gbc);

        //set position of resultLab in column 1 of row 5
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        frame.add(resultLab1, gbc);

        //set position of resultLab 2 in column 1 of row 6
        gbc.gridy = 5;
        frame.add(resultLab2, gbc);

        button.addActionListener(new ActionListener() {
            //logic to calculate velocity
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double p1 = Double.parseDouble(pos1.getText());
                    double p2 = Double.parseDouble(pos2.getText());
                    double t = Double.parseDouble(time.getText());
                    double v = (p2 - p1) / t;
                    resultLab1.setText("Velocity(m/s): " + v);
                    resultLab2.setText("Velocity(km/h): " + (v * 3.6));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
