import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter number: ");
        double num1 = input.nextDouble();

         System.out.println("Enter number");
         double num2 = input.nextDouble();
             
         if(num1 > num2) {
            System.out.println(num1+ " è maggiore");
         } else if(num2 > num1) {
            System.out.println(num2+ " è maggiore");
         }
        
    }
}