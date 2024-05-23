// rimuovere un elemento specifico da un array
public class Main {
    public static int[] Delete(int[] array, int n) {
        int occorrenze = 0;  //numero occorrenze elemento da rimuovere
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                occorrenze++;
            }
        }
        int[] array2 = new int[array.length - occorrenze];
        for(int i = 0; i < array.length; i++) {
            if(array[i]!= n) {
                array2[index] = array[i];
                index++;
            }
        }
        return array2;
    }
    public static void main(String[] args) {
        int[] array = {-10, -5, 1, 1, -10, 2, 2, 2, 2, 2, 3, 4, 4, 4};
        int[] array2 = Delete(array, 2);
        for(int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+ " ");
        }
    }
}