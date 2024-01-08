import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         while(true) {
         System.out.println(" In quale unità convertire i Celsius:  Kelvin(k), Fahreneit(f): ");
         String tempOpt = input.nextLine();

         

         System.out.println("Inserire Temperatura: ");
         double tempValue = input.nextDouble();

         switch(tempOpt) {
            
            case "k":
            tempValue =  tempValue + 273.15;
            System.out.println(tempValue+ " c°");
            break;

            case "f":
            tempValue = (tempValue - 32)/ 1.8;
            System.out.println(tempValue);
            break;
         

            default:
            System.out.println("Operazione non valida");
            break;
         }

         }
    }
}