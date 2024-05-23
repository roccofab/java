import java.util.Scanner;
//trovare tutte le combinazioni di quattro elementi di un dato array la cui somma è uguale a un dato valore

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {1, 2, 4, 7, -10, 5, 3, -1, 5, 6, 9, 10};

        System.out.println("Inserire Numero:");
        int target = scan.nextInt();

        int combinazioni = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    for (int l = k + 1; l < array.length; l++) {
                        if (array[i] + array[j] + array[k] + array[l] == target) {
                            combinazioni++;
                            System.out.println(array[i] + " " + array[j] + " " + array[k] + " " + array[l]);
                        }
                    }
                }
            }
        }

        System.out.println("Numero di combinazioni trovate: " + combinazioni);
    }
}
