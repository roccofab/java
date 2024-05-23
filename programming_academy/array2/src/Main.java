//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] BubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static double CalcolaMedia(int[] arr) {  //calcola media valori del parametro array escludendo il valore più piccolo e il più grande
        int somma = 0;
        for(int i = 1; i < arr.length-1; i++) {
            somma = somma + arr[i];
        }

        return (double) somma /(arr.length-2);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,5,3,20,15};
        BubbleSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\nValore Medio(valore più piccolo e più grande esclusi dall'array):");
        System.out.println(CalcolaMedia(arr));
    }
}