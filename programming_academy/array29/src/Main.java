//ordinare un array numerico e un array di stringhe
public class Main {
    public static int[] insertionSortInteger(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
        return array;
    }
    public static String[] insertionSortString(String[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j - 1].compareTo(array[j]) > 0) {
                String temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
        return array;
    }
    public static void stampaArrayInteger(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void stampaArrayString(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
            if(i <= array.length ) {
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arrayInteger = {10, 20, 1, 2, -1, 5, 4};
        System.out.println("Original Array(not sorted):");
        stampaArrayInteger(arrayInteger);
        String[] arrayString = {"hello", "good morning", "programming", "school", "accademy"};
        System.out.println("\n\nOriginal Array(not sorted):");
        stampaArrayString(arrayString);
        int[] sortedInteger = insertionSortInteger(arrayInteger);
        String[] sortedString = insertionSortString(arrayString);
        System.out.println("\n\nSorted Array(integer):");
        stampaArrayInteger(sortedInteger);
        System.out.println("\n\nSorted Array(string):");
        stampaArrayString(sortedString);
    }
}