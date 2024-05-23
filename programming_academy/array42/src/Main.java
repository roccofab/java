// calcolare il valore che si presenta più volte in un array
public class Main {
    public static int ValoreMedio(int[] array) {
        int maxCount = 0;
        int maxFrequence = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxFrequence = array[i];
            }
        }
        return maxFrequence;
    }
    public static void main(String[] args) {
        int[] array = {-10, 10, -10, 5, -10, 6, -10, 2};
        System.out.println("Il valore che ha Maggiore Frequenza nell'array è: " +ValoreMedio(array));
    }
}