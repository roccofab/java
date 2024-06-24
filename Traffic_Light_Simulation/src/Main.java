import java.util.Timer;
import java.util.TimerTask;
public class Main {
    public static void main(String[] args) {
        TrafficLight tl = new TrafficLight( 10);
        Timer t = new Timer();
        TimerTask tk = new TimerTask( ) {
            @Override
            public void run() {
                tl.changeColor();
            }
        };
        t.schedule(tk, 1000, 10000);
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally{
            t.cancel();
        }
    }
}