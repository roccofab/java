//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void SommaZero(int[] array) {  //Trova tutti i sotto-array con somma 0 presente in un dato array di interi.
        for(int i = 0; i < array.length; i++){
            int sum = 0;
            for(int j = i; j < array.length; j++) {
                sum += array[j];
                if(sum == 0) {
                    StampaSottoArray(array, i, j);
                    System.out.println();
                }
            }
        }
    }
    public static void StampaSottoArray(int[] array, int start, int end) {  //Stampa sottoarray di un array di interi
        for(int i = start; i <= end; i++) {
            System.out.print(array[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
        int[] nums2 = {1, 2, -3, 4, 5, 6};
        int[] nums3 = {1, 2, -2, 3, 4, 5, 6};
        SommaZero(nums1);
        SommaZero(nums2);
        SommaZero(nums3);
    }
}