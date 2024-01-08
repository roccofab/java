import java.util.Scanner;
public class exe1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\t\t\tMTB\n");
        System.out.println("Qual'è il tuo genere (maschio, donna): ");
        String gender = input.nextLine();
        double weight = 0;
        boolean pesoValido = false;

         
         while (!pesoValido) {
            System.out.println("Quanto è il tuo peso corporeo: ");
            
            if (input.hasNextDouble()) {
                weight = input.nextDouble();
                if (weight <= 0) {
                    System.out.println("Inserire peso corretto!");
                } else {
                    pesoValido = true;
                }
            } else {
                input.next(); // Consuma l'input non valido
                System.out.println("Inserire un peso valido!");
            }
        }
        double age = 0;
        boolean etaValida = false;
        while(!etaValida) {
        System.out.println("Inserire l'età: ");
          age = input.nextInt();
         if(age <= 0) {
            System.out.println("Inserire età corretta!");
         } else {
            etaValida = true;
         }
        }
        double height = 0;
        boolean altezzaValida = false;

        while (!altezzaValida) {
            System.out.println("Inserire altezza (in cm): ");
            height = input.nextDouble();

            if (height <= 0) {
                System.out.println("L'altezza deve essere maggiore di 0. Per favore, inserisci un valore valido.");
            } else {
                altezzaValida = true; // L'altezza è valida, usciamo dal ciclo
            }
        }
       

        double tmb;
        if(gender.equals("maschio")) {
            tmb = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
            System.out.println(tmb);
        }
        if(gender.equals("donna")) {
            tmb = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
            System.out.println(tmb);
        }
    }
}