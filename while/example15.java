import java.util.Scanner;
import java.util.Random;
public class example15 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Random random = new Random();
         double opt;
         double attemp = 0;;
         do {
         System.out.println("Enter numbers(0 to exit): ");
         opt = input.nextDouble();
         attemp = opt;
          
         } while(opt != 0.0 );
    }
}