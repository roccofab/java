//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numsThreads = 10;
        int numToCount = 1000;
        int range = numToCount/numsThreads;

        Thread[] threads = new Thread[numsThreads];
        for(int i = 0; i < numsThreads; i++){
            int start = i * range + 1;
            int end = (i+1) * range;
            threads[i] = new Thread(new ThreadCounter(start, end));
            threads[i].start();
        }
        for(int i = 0; i < numsThreads; i++){
            try{
                threads[i].join();
                System.out.println(threads[i].getName() + " finished");
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}