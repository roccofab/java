// verificare se la somma di tutti i 10 nell'array è esattamente 30
public class Main {
    public static boolean verificaSomma(int[] array) {
        int somma = 0;
        boolean risultato = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 10) {
                somma += array[i];
            }
            if(somma == 30) {
                risultato = true;
            }
        }
        return risultato;
    }
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 10, 2, 10, 7, 10};
        System.out.println(verificaSomma(array));
    }
}