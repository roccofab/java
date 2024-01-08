import java.util.Scanner;

public class esercizio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("scegli l'operazione: numeri (n), Stringhe (s)");
        String opt=input.nextLine();
      switch(opt) {
        case "n":
        System.out.println("Inserisci numero: ");
        double n1 = input.nextInt();

        System.out.println("Inserisci secondo numero: ");
        double n2 = input.nextInt();

        double sum = n1 + n2;
        System.out.println(sum);
        break;

        case "s":
        System.out.println("Inserisci frase o parola: ");
        String s1 = input.nextLine();

        System.out.println("Inserisci frase o parola: ");
        String s2 = input.nextLine();

        String concatenation = s1 + s2;
        System.out.println(concatenation);
        break;

        default:
        System.out.println("Operazione non valida!");
        break;
      }
    }
}