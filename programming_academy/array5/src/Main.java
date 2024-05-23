import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void PariDispari(int[] arr) {  //suddividi l'array in numeri pari e numeri dispari:prima i numeri pari e dopo quelli dispari
        int[] arr2 = new int[arr.length];
        int indicePari = 0;
        int indiceDispari = arr.length-1;
        Arrays.sort(arr);
        for(int i : arr) {
            if(i % 2 == 0) {
                arr2[indicePari] = i;
                indicePari++;
            } else {
                arr2[indiceDispari] = i;
                indiceDispari--;
            }
        }
        for(int i : arr2) {
            System.out.print(i+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 9, 11, 12, 13};
        System.out.println("Array Originale:");
        for(int i : arr) {
            System.out.print(i+ " ");
        }
        System.out.println("\nArray Suddiviso:");
        PariDispari(arr);
    }
}