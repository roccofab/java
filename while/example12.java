import java.util.Scanner;
public class example12 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int c = 0;
         double average = 0;
         double sum = 0;
         System.out.println("Enter number: ");
         double e = input.nextDouble();

         while (e != 0) {
            sum += e;
            c++;
            System.out.println("Enter number: ");
            e = input.nextDouble();
            
         } 
         average = sum / c;

        
        System.out.println("You entered " +c+ " numbers and the average is: " +average);
    }
}