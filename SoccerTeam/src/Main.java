import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        soccer S = new soccer(3, 27);
        S.printSoccer();
        String bestP = S.getMaxPlayerValue();
        System.out.println("The Player has the Highest Commercial Value: " + bestP);

        String playerName;
        do {
            System.out.println("Enter Player Name(esc to stop): ");
            playerName = sc.nextLine();
            if (!Objects.equals(playerName, "esc")) {
                String playerInfo = S.getPlayerInfo(playerName);
                System.out.println(playerInfo);
            }
        } while (!Objects.equals(playerName, "esc"));
    }
}
