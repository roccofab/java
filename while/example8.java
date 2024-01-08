import java.util.Scanner;
import java.util.Random;
public class example8 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Random random = new Random();
         
         int minRange = 1;
         int maxRange = 8;
         int attemps = 0;
         int guess;
         int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
         System.out.println("\t\tGuess the number!");
         System.out.println("Try to guess a number from " +minRange+ " and " +maxRange );
        do {
            System.out.println("Enter the number: ");
            guess = input.nextInt();
            attemps++;

            if(guess != secretNumber) {
                System.out.println("Wrong!");
            } else { 
                System.out.println("Correct!");
            } 
        } while(attemps < 20);
    }
}