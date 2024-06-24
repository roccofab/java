public class SumThreads implements Runnable{
    private int sum;
    private int num;

    public SumThreads(int num){
        this.num = num;
        this.sum = 0;
    }
    public int getSum(){
        return sum;
    }
    @Override
    public void run() {
        for(int i = 0; i < num; i++){
            sum += i;
        }
    }
}
