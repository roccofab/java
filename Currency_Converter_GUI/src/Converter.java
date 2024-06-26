import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Converter extends JFrame {
    private JComboBox<String> fromCurrency;
    private JComboBox<String> toCurrency;
    private JTextField amountField;
    private JTextArea resultArea;
    private JButton convertButt;
    private Map<String, Double> rates = new HashMap<>( );

    public Converter() {
        setTitle("Currency Converter");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout( ));
        GridBagConstraints gbc = new GridBagConstraints( );
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel label1 = new JLabel("AMOUNT");
        amountField = new JTextField( );

        JLabel label2 = new JLabel("From");
        fromCurrency = new JComboBox<>(new String[]{"EUR - Euro", "USD - Dollar", "GBP - Pound", "CHF - Swiss Franc", "JPY - JEN Japanese", "CNY - Renminbi Chinese", "INR - Indian Rupee"});

        JLabel label3 = new JLabel("To");
        toCurrency = new JComboBox<>(new String[]{"EUR - Euro", "USD - Dollar", "GBP - Pound", "CHF - Swiss Franc", "JPY-JEN Japanese", "CNY - Renminbi Chinese", "INR - Indian Rupee"});

        convertButt = new JButton("Convert");
        resultArea = new JTextArea( );
        resultArea.setEditable(false);
        resultArea.setBorder(BorderFactory.createLineBorder(Color.blue));

        //add "label1" to the cells 0-0 of the GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(label1, gbc);

        //add TextField "amountField" to the cells 1-0 of the GridBagLayout
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(amountField, gbc);

        //add "label2" to the cells 0-1 of the GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(label2, gbc);

        //add JComboBox "fromCurrency" to the cells 1-1 of the GridBagLayout
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(fromCurrency, gbc);

        //add placeholder to the cells 2-1-1 of the GridBagLayout
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(new JLabel(" "), gbc);

        //add "label3" to the cells 3-1-1 of the GridBagLayout
        gbc.gridx = 3;
        gbc.gridy = 1;
        add(label3, gbc);

        //add JComboBox "toCurrency" to the cells 4-1 of the GridBagLayout
        gbc.gridx = 4;
        gbc.gridy = 1;
        add(toCurrency, gbc);

        //add JButton "convertButt" to the cells 0-2 of the GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(convertButt, gbc);

        //add JTextArea "resultArea" to the cells 1-2 of the GridBagLayout and set width to 4 cells in one row
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 4;
        add(resultArea, gbc);

        //initialize map Key-Value of exchange rates where currency is the key the reference currency of the exchange rate is EURO
        rates = new HashMap<>( );
        rates.put("EUR", 1.0);
        rates.put("USD", 1.1);
        rates.put("GBP", 0.9);
        rates.put("CHF", 1.05);
        rates.put("JPY", 130.0);
        rates.put("CNY", 7.2);
        rates.put("INR", 85.0);

        // Add action listener to the button
        convertButt.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCurrency( );
            }
        });
    }
    /**
     * It reads the amount to be converted from the amountField, retrieves the selected
     * currencies from the fromCurrency and toCurrency JComboBoxes, and calculates the
     * converted amount using predefined exchange rates.
     * <p>
     * If the amount entered is not a valid number, an error message is displayed in the
     * resultArea indicating "Invalid amount". If the selected currencies are not found in
     * the exchange rates map, an error message is displayed in the resultArea indicating
     * "Invalid currency selection".
     * </p>
     *
     * @throws NumberFormatException
     */
    private void convertCurrency( ) {
        try{
            double amount = Double.parseDouble(amountField.getText());
            String from = ((String) fromCurrency.getSelectedItem()).split(" - ")[0];
            String to = ((String) toCurrency.getSelectedItem()).split(" - ")[0];

            if (from != null && to != null && rates.containsKey(from) && rates.containsKey(to)) {
                double fromRate = rates.get(from);
                double toRate = rates.get(to);
                double result = amount * (toRate / fromRate);
                resultArea.setText(String.format("%.2f %s", result, to));
            } else {
                resultArea.setText("Invalid currency selection");
            }
        }catch (NumberFormatException ex) {
            resultArea.setText("Invalid amount");
        }
    }
}
