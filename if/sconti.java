import java.util.Scanner;
public class sconti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
        System.out.println("\t\t\tSupera i 100 euro di acquisti per ricevere 10% di sconto!");
        System.out.println("Inserire importo spesa: ");
        double imp = input.nextDouble();
        if(imp >= 100) {
            double sconto = imp - (imp * 10) / 100;
            System.out.println("Il prezzo è "  +sconto);
        } else {
            System.out.println(imp);
        }
    }
    }
}