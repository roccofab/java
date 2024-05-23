import java.util.Scanner;
public class Main {
    public static boolean ContieneElemento(String[] array, String n) {
        boolean risultato = false;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(n)) {
                risultato = true;
                count++;
            }
        }
        System.out.println("La Parola è contenuta: " +count+ " Volte");
        return risultato;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = {"ciao", "ciao", "mattina", "Pomeriggio", "sera", "Giornata", "notte"};
        System.out.println("Inserire Parola: ");
        String n = scan.nextLine();
        System.out.println(ContieneElemento(array, n));
    }
}