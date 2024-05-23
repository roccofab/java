import java.util.Scanner;
public class Main {
    public static int TrovaElemento(int[] array, int numero) {
        boolean numeroTrovato = false;
        for(int i=0; i < array.length; i++) {
            if(array[i] == numero) {
                System.out.println("Numero in Posizione: " +i);
                numeroTrovato = true;
            }
        }
        if(!numeroTrovato){
            System.out.println("Numero non Trovato");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 20, 100, -10, -100, -5, 50, 150, 120, 10, 5, 2, 3, 4};
        for(int i : array) {
            System.out.print(i+ " ");
        }
        System.out.println("\nInserire Numero: ");
        int numero = sc.nextInt();
        TrovaElemento(array, numero);
    }
}