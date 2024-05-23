import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void spostaZeri(int[] array) {  //metodo1 sposta zeri nelle ultime posizioni dell'array
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] != 0) {
                array[index] = array[i];
                index++;
            }
        }
        for(int i = index; i < array.length; i++) {
            array[i] = 0;
        }
    }
    public static void ElementiComuni(int[] arr1, int[] arr2, int[] arr3) {  //metodo2 trova elementi comuni da 3 array di interi ordinati e li inserisce in un nuovo array di interi
        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length && k < arr3.length) {
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            }
            else if(arr1[i] < arr2[j]) {
                i++;
            }
            else if(arr2[j] < arr3[k]) {
                j++;
            }
            else {
                k++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {0, 2, 20,3,0,4,0};  //metodo1
        spostaZeri(array);
        for(int i : array) {
            System.out.print(i+ " ");
        }
        System.out.println();
        int[] arr1 = {10, 30, 5, 2, 50, 100};//metodo2
        int[] arr2 = {5, 2, 1, 100, 50, 6};
        int[] arr3 = {1, 100, 50, 30, 40, 10};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        System.out.println("Elementi Comuni:");
        ElementiComuni(arr1, arr2, arr3);
    }
}