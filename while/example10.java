import java.util.Scanner;
public class example10 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int entered;
         do {
         System.out.println("Enter positive number: ");
          entered = input.nextInt();
         } while(entered >= 0);
         if(entered < 0) {
            System.out.println("You entered negative number!");
         }
    }
}
