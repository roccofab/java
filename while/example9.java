import java.util.Scanner;
import java.util.Random;
public class example9 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Random random = new Random();
         String opt;
          System.out.println("\tPaper-Rock-Scissor!");
          do {
          System.out.println("\nChoose Paper, Rock or Scissor (exit to end):\n\n ");
           opt = input.nextLine();
        String [] choices = {"Paper", "Rock", "Scissor"};
         int randomIndex = random.nextInt(choices.length);
         String computerChoice = choices[randomIndex];

        System.out.println("Computer chose: " + computerChoice);

        if (opt.equals("Paper") && computerChoice.equals("Paper")) {
            System.out.println("No winner");
        } else if (opt.equals("Rock") && computerChoice.equals("Rock")) {
            System.out.println("No winner");
        } else if (opt.equals("Scissor") && computerChoice.equals("Scissor")) {
            System.out.println("No winner");
        } else if (opt.equals("Paper") && computerChoice.equals("Rock")) {
            System.out.println("You win!");
        } else if (opt.equals("Paper") && computerChoice.equals("Scissor")) {
            System.out.println("You lose...");
        } else if (opt.equals("Rock") && computerChoice.equals("Scissor")) {
            System.out.println("You win!");
        } else if (opt.equals("Rock") && computerChoice.equals("Paper")) {
            System.out.println("You lose...");
        } else if (opt.equals("Scissor") && computerChoice.equals("Paper")) {
            System.out.println("You win!");
        } else if (opt.equals("Scissor") && computerChoice.equals("Rock")) {
            System.out.println("You lose...");
        }
    }  while (!opt.equals("exit")); 
        }
    }
        
