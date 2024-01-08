import java.util.Scanner;
import java.util.Calendar;
public class age {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter birth's year: ");
        int year = input.nextInt();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        
        // Ottieni il mese corrente
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;  // Gennaio è 0, febbraio è 1, ecc.

        // Calcola l'età in base all'anno e al mese corrente
        int currentAge;
        currentAge = currentYear - year;

        System.out.println(currentAge+ " years old");
            
        if(currentAge < 0 || currentAge > 150) {
            System.out.println("Enter a correct birth!");
        }
        
    }
}