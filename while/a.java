import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        String numbers;
        int age;
        int aCount = 0;
        do {
        System.out.println("\nEnter name: ");
         numbers = input.nextLine();
         i++;

         System.out.println("\nEnter age(exit to finish): ");
          age = input.nextInt();

          input.nextLine();
          
          if(age >= 18) {
           aCount++;
          }
        } while(numbers != "exit");
        System.out.println("\n\tThere are: " +i+ "guys and the major age are: " +aCount);
    }
}