//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *The Main class creates a GUI that allows the user to input a character and
 *displays its numeric value using the Character.getNumericValue method.
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel( "Enter Character" );
        JTextField textField = new JTextField( 5 );
        JButton button = new JButton( "Submit" );

        panel.add( label );
        panel.add( textField );
        panel.add( button );

        JTextArea resultArea = new JTextArea(3, 30);
        resultArea.setEditable(false);

        frame.add( panel, BorderLayout.NORTH );
        frame.add(new JScrollPane(resultArea), BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {

            /**
             *Handles the button click event.
             *<p>
             *This method retrieves the input from the text field, checks if it's a single character,
             *and if so, converts it to its numeric value using the Character.getNumericValue method.
             *The numeric value is then displayed in the result area. If the input is not a single
             *character, an error message is displayed instead.
             *</p>
             *@param e the action event triggered by the button click
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                if(input.length() == 1){
                    char c = input.charAt(0);
                    int value = Character.getNumericValue(c);
                    resultArea.setText(String.valueOf(value));
                } else{
                    resultArea.setText("Not a Character");
                }
            }
        });
        frame.setVisible(true);
    }
}