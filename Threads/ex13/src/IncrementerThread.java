public class IncrementerThread extends Thread{
    Counter counter;
    private int NumberOfIncrements;

    public IncrementerThread(int NumberOfIncrements){
        this.NumberOfIncrements = NumberOfIncrements;
        this.counter = new Counter(100);  //initializa counter to 100
    }
    public int getCount(){
        return counter.getCount();
    }
    @Override
    public void run() {
        for (int i = 0; i < NumberOfIncrements; i++) {
            counter.increment( );
        }
    }
}
