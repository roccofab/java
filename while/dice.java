import java.util.Scanner;
import java.util.Random;
public class dice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 6; 
        int bet;
        int point = 0;
        System.out.println("\t\tROLL THE DICE!\n\n");
        do {
            int dice1 = random.nextInt(max -min);
        int dice2 = random.nextInt(max - min) - min;
        int score = dice1 + dice2;
        System.out.println("\n\nRoll dice's result(enter 0 to exit): ");
        bet = input.nextInt();
        
        if(bet == score) {
            point++;
            System.out.println("\n\t -You earn: " +point);
        } else {
            System.out.println("\n\t -No point... the result's roll dices: " +score);
        }
    } while(bet != 0);
        

    }
}