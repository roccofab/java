public class PrimeNumSum implements Runnable{
    int start;
    int end;
    long sum;

    public PrimeNumSum(int start, int end){
        this.start = start;
        this.end = end;
        this.sum = 0;
    }
    public long getSum(){
        return sum;
    }
    public boolean isPrime(int number){
        if(number < 2){
            return false;
        }
        for(int i = 2; i < Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        for(int i = start; i <= end; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
    }
}
