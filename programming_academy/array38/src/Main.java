//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {  //trovare il secondo elemento più grande in un array
    public static int SecondoMax(int[] array){
        int max = Integer.MIN_VALUE;
        int secondoMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for(int i = 0; i < array.length; i++) {
            if (array[i] != max && array[i] > secondoMax) {
                secondoMax = array[i];
            }
        }
        return secondoMax;
    }
    public static void main(String[] args) {
        int[] array = {-1, 2, 5, 10, 4};
        System.out.println(SecondoMax(array));
    }
}