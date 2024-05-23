//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] TrovaMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        int[] valori = new int[2];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        valori[0] = max;
        valori[1] = min;
        return valori;
    }

    public static void main(String[] args) {
        int[] array = {0, -20, -50, 10, 100, 30, 2000};
        int[] valori = TrovaMaxMin(array);
        for (int i : valori) {
            System.out.print(i+ " ");
        }
    }
}