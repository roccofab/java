public class ReverseThreads extends Thread{
    private int numThread;

    public ReverseThreads(int numThread) {
        this.numThread = numThread;
    }
    @Override
    public void run() {
        if(numThread < 50){
            ReverseThreads nextThread = new ReverseThreads(numThread+1);
            nextThread.start();
            try {
                nextThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hello from Thread " +numThread);
    }
}
