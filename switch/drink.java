import java.util.Scanner;
public class drink {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    
         double [] prices = {1.0, 1.0, 1.50, 2.0, 2.50, 1.0};  //prices
         System.out.println("T - tè");
         System.out.println("W - water");
         System.out.println("C - cola");
         System.out.println("F - fanta");
         System.out.println("M - cappuccino starbucks");
         System.out.println("S - Soda");
         System.out.println("Select Drink: ");
         String choice = input.nextLine();
         switch(choice) {
            case "T":
            System.out.println("Tè - " +prices[0]);
            break;

            case "w":
            System.out.println("Water - " +prices[1]);
            break;

            case "C":
            System.out.println("Cola - " +prices[2]);
            break;

            case "F":
            System.out.println("Fanta - " +prices[3]);
            break;

            case "M":
            System.out.println( "Cappuccino starbucks - " +prices[4]);
            break;

            case "S":
            System.out.println("Soda - " +prices[5] );
            break;

            default:
            System.out.println("Error!");
         }
    }
}