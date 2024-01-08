import java.util.Scanner;
public class aliquota {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         while(true) {
         System.out.println("Inserire importo: ");
         double imp = input.nextDouble();

         input.nextLine();

         System.out.println("Prodotto con IVA al 4% (reduced) o Prodotto con IVA al 22% (standard): ");
         String tax = input.nextLine();
        switch(tax) {
            case "reduced":
             imp = imp + (imp * 4) /100;
             System.out.println("Il prezzo con l'IVA del 4% è " +imp);
             break;

             case "standard":
             imp = imp + (imp * 22) /100;
             System.out.println("Il prezzo con l'IVA del 22% è " +imp);
             break;

             
        }
    }
    }
}