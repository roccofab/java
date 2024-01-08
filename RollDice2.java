import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RollDice2 extends JFrame {
    private JLabel risultatoLabel;

    public RollDice2() {
        super("Simulatore Lancio Dadi");

        JPanel panel = new JPanel();
        JButton lancioButton = new JButton("Lancia il dado");

        risultatoLabel = new JLabel("Risultato: ");

        panel.add(lancioButton);
        panel.add(risultatoLabel);

        lancioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int risultato = lancioDado();
                risultatoLabel.setText("Risultato: " + risultato);
            }
        });

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private int lancioDado() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Genera un numero casuale da 1 a 6 (un dado classico)
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RollDice2();
            }
        });
    }
}
