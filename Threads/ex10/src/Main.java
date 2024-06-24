//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int limit = 10000;
        int Num_threads = 4;
        int segment = limit / Num_threads;
        int start = 2;
        int end = segment;
        Thread[] threads = new Thread[Num_threads];
        PrimeNumSum[] primeSum = new PrimeNumSum[Num_threads];
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < Num_threads; i++){
            if(i == Num_threads - 1){
                end = limit;
            }
            primeSum[i] = new PrimeNumSum(start, end);
            threads[i] = new Thread(primeSum[i]);
            threads[i].start();

            start = end + 1;
            end += segment;
        }
        long sum = 0;
        try{
            for(int i = 0; i < Num_threads; i++){
                threads[i].join();
                sum += primeSum[i].getSum();
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Sum of prime numbers up to " + limit + ": " + sum);
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
}