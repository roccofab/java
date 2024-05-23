// trovare i valori duplicati di un array di valori stringa
import java.util.Scanner;
public class Main {
    public static String[] Duplicati(String[] array, String parola) {
        int occorrenze = 0;  //conta occorrenze della parola inserita
        int index = 0;
        for (String i : array) {
            if (i.equalsIgnoreCase(parola)) {
                occorrenze++;
            }
        }
        String[] array2 = new String[array.length - occorrenze];  //nuovo array senza la parola inserita
        for(int i = 0; i < array.length; i++) {
            if(!array[i].equalsIgnoreCase(parola)) {
                array2[index] = array[i];
                index++;
            }
        }
        System.out.println("Numero Occorrenze Stringa: " + occorrenze);
        return array2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = {"giancarlo", "Fabio", "Marco", "Giancarlo", "Giancarlo", "luigi", "marco", "marco"};
        System.out.println("Inserisci Parola: ");
        String parola = scan.nextLine();
        String[] array2 = Duplicati(array, parola);
        for (String i : array2) {
            System.out.print(i + " ");
        }
    }
}