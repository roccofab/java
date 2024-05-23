import java.util.Arrays;
public class Main {
    public static int TrovaSequenzaConsecutiva(int[] array) {  // trovare la lunghezza della sequenza di elementi consecutivi più lunga da un dato array di numeri interi non ordinati.
        int max = 1;
        int count = 1;
        Arrays.sort(array);
        for(int i = 1; i < array.length; i++) {
            if(array[i] == array[i-1] +1) {  //controlla se l'elemento successivo è consecutivo a quello attuale
                count++;
                max = Math.max(max, count); // Aggiorna max solo se count supera il valore attuale di max
            } else if(array[i] != array[i-1]) {  //se l'elemento successivo non è consecutivo resetta la variabile contatore
                count = 1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array = {49, 1, 3, 200, 2, 4, 70, 5};
        int maxSequenza = TrovaSequenzaConsecutiva(array);
        System.out.println("\nLa Sequenza Consecutiva con lunghezza Massima è: " +maxSequenza);
    }
}