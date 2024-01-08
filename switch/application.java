import java.util.Scanner;
import java.lang.Math;

public class application {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {  // Questo ciclo si ripeterà all'infinito
            System.out.println("\t\t\tCalculator");
            System.out.print("Inserisci il primo numero: ");
            double num1 = input.nextDouble();

            System.out.print("Inserisci il secondo numero: ");
            double num2 = input.nextDouble();

            System.out.print("Scegli un'operazione (+, -, *, /, ^, log, ln, sqrt, exit): ");
            String operatore = input.next();

            if (operatore.equals("exit")) {
                System.out.println("Uscita dal programma.");
                break;  
            }

        
        double risultato;
        
        switch (operatore) {
            case "+":
            risultato = num1 + num2;
            break;
            case "-":
            risultato = num1 - num2;
            break;
            case "*":
            risultato = num1 * num2;
            break;
            case "^":
            risultato = Math.pow(num1, num2);
            break;
            case "sqrt":
            risultato = Math.sqrt(num1);
            break;
            case "log":
            risultato = Math.log10(num1);
            break;
            case "ln":
            risultato = Math.log(num1);
             
            case "/":
            if (num2 != 0) {
                risultato = num1 / num2;
            } else {
                System.out.println("Errore: divisione per zero.");
                return;
            }
            break;
            default:
            System.out.println("Operazione non valida.");
            return;
        }
        
        System.out.println( risultato);
    }
}
}

