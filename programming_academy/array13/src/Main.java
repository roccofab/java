//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // trovare il più piccolo e il secondo più piccolo elemento di un dato array
        int[] array = {10, 20, -10, 1, 5, 15};
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MAX_VALUE;
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            if(array[i] < value1) {
                value2 = value1;
                value1 = array[i];
            }  else if (array[i] < value2 && array[i] != value1) {
                value2 = array[i];
            }
        }
        System.out.println(value1);
        System.out.println(value2);
    }
}