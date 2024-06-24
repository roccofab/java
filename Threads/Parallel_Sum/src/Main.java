
public class Main {
    public static void main(String[] args) {
        int ArrSize = 100000;
        int[] arr = new int[ArrSize];
        int numsThreads = 10;
        int range = ArrSize / numsThreads;
        for(int i = 0; i < ArrSize; i++){
            arr[i] = 1;
        }
        Sum[] sum = new Sum[numsThreads];
        Thread[] threads = new Thread[numsThreads];
        for(int i = 0; i < numsThreads; i++){
            int start = i * range;
            int end = (i + 1) * range;
            if (i == numsThreads - 1) {
                end = ArrSize;
            }
            sum[i] = new Sum( start, end, arr);
            threads[i] = new Thread(sum[i]);
            threads[i].start();
        }
        int totalSum = 0;
        for(int i = 0; i < numsThreads; i++){
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            totalSum += sum[i].getSum();
            System.out.println(totalSum);
        }
    }
}