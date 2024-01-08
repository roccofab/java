import java.util.Scanner;
import java.util.Random;
public class example14 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Random random = new Random();
         String [] word = {"java", "javascript", "php"};
         String choice;
         int i = random.nextInt(word.length);
         String randomWord = word[i];
         System.out.println("\t\tTRY TO GUESS THE WORD!\n");
         System.out.println("the word is a programming backend language(from 3 to 10 characters...)\n");
        do {
           System.out.println("Enter answer: ");
           choice = input.nextLine();
           if(choice.equals(randomWord)) {
            System.out.println("\t\nCONGRATULATION,YOU GUESSED THE WORD!\n");
        } else {
            System.out.println("\t\nWrong word try one more time...\n");
        }
        } while(!choice.equals(randomWord));

    }
}