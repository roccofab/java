import java.util.Scanner;
public class romanNumber {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         while(true) {
         String [] numR = {"I", "II", "III", "IV", "V", "VI", "VII", "IIX", "Ix", "X", "XI", "XII" };
         System.out.println("Enter number from 1 to 12(stop to finish): ");
         int numI = input.nextInt();

         switch(numI) {
            case 1:
            System.out.println(numR[0]);
            break;

            case 2:
            System.out.println(numR[1]);
            break;

             case 3:
            System.out.println(numR[2]);
            break;

             case 4:
            System.out.println(numR[3]);
            break;

             case 5:
            System.out.println(numR[4]);
            break;

             case 6:
            System.out.println(numR[5]);
            break;

             case 7:
            System.out.println(numR[6]);
            break;

             case 8:
            System.out.println(numR[7]);
            break;

             case 9:
            System.out.println(numR[8]);
            break;

             case 10:
            System.out.println(numR[9]);
            break;

             case 11:
            System.out.println(numR[10]);
            break;

             case 12:
            System.out.println(numR[11]);
            break;

            default:
            System.out.println("I can convert only numbers from 1 to 12 =(");
         }
         }
    }
}