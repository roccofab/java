//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void SpostaZeri(int[] array) {   // spostare tutti gli 0 alla fine di un array
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!= 0) {
                array[counter] = array[i];
                counter++;
            }
        }
        for(int i = counter; i < array.length; i++) {
            array[i] = 0;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, -10, 0, 3, 4, 0, 100, 0, 200, -150, 0, 300, 220};
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        SpostaZeri(array);
        for(int i : array) {
            System.out.print(i + " ");
        }
    }
}