import java.util.Scanner;
public class example5 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n = 0;
         int p = 1;
         while(n<= 15) {
              n += 3;
            p *= n;
            System.out.println("Il prodotto dei numeri dispari da 1 a 15 è: " +p);
         }

    }
}