import java.util.Scanner;
public class Main {
    public static int[] inserElement(int[] array, int position, int element) {
        int[] array2 = new int[array.length+1];
        for (int i = 0; i < position; i++) {
            array2[i] = array[i];
        }
        array2[position] = element;
        for (int i = position; i < array.length; i++) {
            array2[i+1] = array[i];
        }
        return array2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Elemento da Inserire nell'Array: ");
        int element = sc.nextInt();
        System.out.println("Posizione: ");
        int position = sc.nextInt();
        int[] array2 = inserElement(array, position, element);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+ " ");
        }
    }
}