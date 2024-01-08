//tutorial uso "switch" per valutare più condizioni in una sola istruzione "switch"
import java.util.Scanner;
public class condizionimultiple {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.println("Inserire nome: ");
         String nome = input.nextLine();
          switch(nome) {
            case "luca":
            System.out.println("è Luca");
            break;

            case "clara": 
            System.out.println("Non è Luca ma è Clara");
            break;

            default:
            System.out.println("Non è Luca e neanche Clara");
            break;
          }
    }
}