//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {  //copiare un array  tramite un ciclo for
    public static int[] CopiaArray(int[] array) {
        int[] copia = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copia[i] = array[i];
        }
        return copia;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] copia = CopiaArray(array);
        System.out.println("Array Originale:");
        for(int i : array) {
            System.out.print(i+ " ");
        }
        System.out.println("\nArray Copiato:");
        for(int i : copia) {
            System.out.print(i+ " ");
        }
    }
}