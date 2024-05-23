//trovare i due numeri, che possono essere positivi o negativi, in modo tale che la loro somma sia più vicina allo zero
public class Main {
    public static int[] SommaZero(int[] array) {
        int closestSum = Integer.MAX_VALUE;
        int[] result = new int[2];  //l'array result memorizza la coppia di numeri la cui somma è più vicina allo zero
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                int absoluteSum = Math.abs(sum);  //effettua il valore assoluto della somma: altrimenti i risultati della somma negativi vengono considerati più vicini allo zero ad esempio -10 viene considerato più vicino allo zero rispetto a 3
                if (absoluteSum < closestSum) {
                    closestSum = sum;
                    result[0] = array[i];
                    result[1] = array[j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,-20, 6, 7, 8, 9, 10};
        int[] closestSum = SommaZero(array);
        System.out.println("Array:");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println("\nCoppia Numeri con Somma più Vicina A 0:");
        for(int i = 0; i < closestSum.length; i++) {
            System.out.print(closestSum[i] +" ");
        }
    }
}