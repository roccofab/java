// invertire un array di valori interi
public class Main {
    public static void InvertiArray(int[] array) {
        for(int i = array.length-1; i >=0; i--) {
            System.out.print(array[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        InvertiArray(array);
    }
}