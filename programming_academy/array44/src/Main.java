//trovare il secondo elemento più piccolo in un array
public class Main {
    public static int SecondoElementoMinore(int[] array) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < firstMin) {
                secondMin = firstMin;
                firstMin = array[i];
            } else if(array[i] < secondMin && array[i] != firstMin) {
                secondMin = array[i];
            }
        }
        return secondMin;
    }
    public static void main(String[] args) {
        int[] array = {10, 5, -1, 1, 20, -10};
        System.out.println(SecondoElementoMinore(array));
    }
}