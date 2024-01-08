import java.util.Scanner;
import java.util.Random;
public class example13 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Random random = new Random();
         System.out.println("\t\tLANCIA LA MONETA!\n\n");
         String coin;
         int count = 0;
         do {
           int randomChoice = random.nextInt(2);

            if(randomChoice == 0) {
                coin = "testa";
                System.out.println("Testa");
                count++;
            } else {
                coin = "croce";
                System.out.println("Croce");
            }
         } while(count < 3);
         System.out.println("\n3 testa, hai VINTO!");
    }
}