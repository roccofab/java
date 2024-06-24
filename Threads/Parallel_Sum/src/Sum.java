public class Sum implements Runnable{
    private int start;
    private int end;
    private int[] arr;
    private int sum;

    public Sum(int start, int end, int[] arr) {
        this.start = start;
        this.end = end;
        this.arr = arr;
       this.sum = 0;
    }
    @Override
    public void run() {
        for(int i = start; i  < end; i++){
            sum += arr[i];
        }
    }
    public int getSum(){
        return sum;
    }
}
