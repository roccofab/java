import java.util.Scanner;
public class example6 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n = 0;
         int i = 0;
         do {
           i++;
           n += i;
         }
         while(i < 50); {
            System.out.println("La somma dei numeri da 1 a 50 é: " +n);
         }
    }
}