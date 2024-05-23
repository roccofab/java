// trovare gli elementi comuni tra due array di numeri interi
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int[] ElementiComuni(int[] array1, int[] array2) {
        int[] array1SenzaDuplicati = Arrays.stream(array1).distinct().toArray();  //elimina gli interi duplicati da array1
        int[] array2SenzaDuplicati = Arrays.stream(array2).distinct().toArray();  //elimina duplicati da array2
        ArrayList<Integer> elementiComuni = new ArrayList<Integer>();
        for(int i : array1SenzaDuplicati) {
            for(int j : array2SenzaDuplicati) {
                if(i == j) {
                    elementiComuni.add(i);
                }
            }
        }
        return elementiComuni.stream().mapToInt(Integer::intValue).toArray();  //converte l'ArrayList in un array di interi usando stream().mapToInt(Integer::intValue).toArray()
    }
    public static void main(String[] args) {
        int[] array1 = {1,1,1,1,2, 4,4, 5, 10};
        int[] array2 = {1, 2,2,2, 5, 10};
        int[] elementiComuni = ElementiComuni(array1, array2);
        System.out.println(Arrays.toString(elementiComuni));
    }
}