import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exe2 extends JFrame {

    private JTextField display;

    private double numeroCorrente;
    private String operazioneCorrente;

    public exe2() {
        // Impostazioni della finestra
        setTitle("Calcolatrice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        // Creazione del display
        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Creazione dei pulsanti
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] tasti = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String tasto : tasti) {
            JButton button = new JButton(tasto);
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton source = (JButton) event.getSource();
            String testoPulsante = source.getText();

            if (testoPulsante.matches("[0-9]")) {
                display.setText(display.getText() + testoPulsante);
            } else if (testoPulsante.equals(".")) {
                if (!display.getText().contains(".")) {
                    display.setText(display.getText() + ".");
                }
            } else if (testoPulsante.equals("=")) {
                eseguiOperazione();
            } else {
                // Operazioni +, -, *, /
                if (!operazioneCorrente.isEmpty()) {
                    eseguiOperazione();
                }
                numeroCorrente = Double.parseDouble(display.getText());
                operazioneCorrente = testoPulsante;
                display.setText("");
            }
        }

        private void eseguiOperazione() {
            double numero = Double.parseDouble(display.getText());
            switch (operazioneCorrente) {
                case "+":
                    numeroCorrente += numero;
                    break;
                case "-":
                    numeroCorrente -= numero;
                    break;
                case "*":
                    numeroCorrente *= numero;
                    break;
                case "/":
                    if (numero != 0) {
                        numeroCorrente /= numero;
                    } else {
                        JOptionPane.showMessageDialog(null, "Errore: Divisione per zero!");
                    }
                    break;
            }
            display.setText(String.valueOf(numeroCorrente));
            operazioneCorrente = "";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            exe2 calcolatrice = new exe2();
            calcolatrice.setVisible(true);
        });
    }
}

