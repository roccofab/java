//tutorial uso "switch" per valutare più condizioni in una sola istruzione "switch"
import java.util.Scanner;

public class condizionimultiple {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
          String nome = "Luca";
          switch(nome) {
            case "Luca":
            System.out.println("è Luca");
            break;

            case "Clara": 
            System.out.println("Non è Luca ma è Clara");
            break;

            default:
            System.out.println("Non è Luca e neanche Clara");
          }
    }
}