public class Producer extends Thread{
    MyData d;
    public Producer(MyData data) {
        d = data;
    }
    public void run(){
        int i = 1;
        while(true){
            d.set(i);
            System.out.println("Producer: " +i);
            i++;
        }
    }
}
