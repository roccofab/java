/*Dato un array ordinato di numeri interi distinti e un valore di destinazione,
 restituisce l'indice se viene trovato il target.
 In caso contrario, restituisce l'indice dove si troverebbe se fosse inserito in ordine
 Esempio 1:

Ingresso: numeri = [1,3,5,6], destinazione = 5
 Uscita: 2

 Esempio 2:

Ingresso: numeri = [1,3,5,6], destinazione = 2
 Uscita: 1

 Esempio 3:

Ingresso: numeri = [1,3,5,6], destinazione = 7
 Uscita: 4
 */
import java.util.Arrays;
public class Main {
    public static int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);

        if (index < 0) {
            index = -(index + 1);
        }

        return index;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
}