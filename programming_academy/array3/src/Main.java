import java.util.Arrays;
public class Main {
    public static int[] RimuoviDuplicati(int[] array) {
        int index = 0;
        int[] SenzaDuplicati = new int[array.length];
        for(int i = 0; i < array.length-1; i++) {
            if(array[i] != array[i+1]) {
                SenzaDuplicati[index] = array[i];
                index++;
            }
        }
        SenzaDuplicati[index] = array[array.length-1];
        index++;
        return Arrays.copyOf(SenzaDuplicati, index);
    }
    public static void main(String[] args) {
        int[] array = {1,2,2,2,2,3,3,3,4,4,5,5,5,6,6,6,7,7,7,8,8,8,10,10,10};
        int[] SenzaDuplicati = RimuoviDuplicati(array);
        for(int i : SenzaDuplicati) {
            System.out.print(i+ " ");
        }
    }
}