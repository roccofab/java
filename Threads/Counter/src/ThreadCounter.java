public class ThreadCounter implements Runnable {
    private final int start;
    private final int end;

    public ThreadCounter(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void run(){
        for(int i = start; i < end; i++){
            System.out.println("Thread " +Thread.currentThread().getName()+ " Count: " +i);
        }
    }
}
