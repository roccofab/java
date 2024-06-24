public class Consumer extends Thread {
    MyData d;
    public Consumer(MyData data){
        d = data;
    }
    public void run(){
        int value;
        while(true){
            value = d.get();
            System.out.println("Consumer: " +value);
        }
    }
}
