import java.util.Scanner;
public class Main {
    public static int SommaCoppie(int[] array, int risultato) {  //trovare tutte le coppie di elementi in un array la cui somma è uguale a un numero specificato
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == risultato) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {1, 2, -5, 8, 10, 15, 200 };
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\nInserire Numero: ");
        int numero = scan.nextInt();
        int risultato = SommaCoppie(array, numero);
        System.out.println("Coppie di Numeri con Somma pari a " +numero+ " : " +risultato);
    }
}