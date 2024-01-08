import java.util.Scanner;
public class yourDiscountCode {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         while(true) {
         System.out.println("Codice sconto(L10, L15, L25): ");
         String coupon = input.nextLine();

         System.out.println("Importo: ");
         double imp = input.nextDouble();
         input.nextLine();
       
         switch(coupon) {
            case "L10":
            imp = imp - (imp * 10.0)/ 100.0;
            System.out.println("Importo Scontato : " +imp);
            break;

            case "L15":
            imp = imp - (imp * 15.0)/100.0;
            System.out.println("Importo scontato : " +imp);
            break;

            case "L25":
            imp = imp - (imp * 25.0)/100.0;
            System.out.println("Importo scontato : " +imp);
            break;
           
            default:
            System.out.println("Coupon non Valido!");
            break;
         
        }
    }   
    }
}