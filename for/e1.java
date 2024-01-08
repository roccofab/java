import java.util.Scanner;
public class e1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int sum = 0;
         int product = 1;
         System.out.print("enter number: ");
         int num = input.nextInt();
         for(int i = 1; i <= num; i += 2) {
           sum += i;
           product *= i;
           
            if(num % 2 != 0 ) {
                System.out.println(i);
            }
         }
         System.out.println("\nThe sum is: \n" +sum);
         System.out.println("\nThe product of the odd numbers is: \n" +product);
    }
}
         