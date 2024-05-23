// sposta in avanti il numero in un array di interi. L’ultimo numero prende la posizione 0
public class Main {
    public static void SpostaInAvanti(int[] array) {
        int temp = array[array.length - 1];
        for(int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }
    public static void main(String[] args) {
        int[] array = {4,9,3,7};
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        SpostaInAvanti(array);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
}