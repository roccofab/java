
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 8, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {  //trova il primo numero mancante in array
                int missingNumber = i + 1;
                System.out.println(missingNumber);
                break;
            }
        }
    }
}