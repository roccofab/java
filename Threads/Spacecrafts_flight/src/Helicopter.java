import java.util.Random;

public class Helicopter implements flyable, Runnable{
    int altitude;
    private Object lock;

    public Helicopter(Object lock){
        this.altitude = 0;
        this.lock = lock;
    }
    @Override
    public void fly_obj() {
        Random rand = new Random();
        int increment = rand.nextInt(40) + 10;
        altitude += increment;
        if(altitude > 6000){
            descent_obj();
        }
        synchronized (lock) {  //syncronize printing for helicopter
            System.out.println("Helicopter Altitude: " + altitude + " metres");
        }
    }

    @Override
    public void descent_obj() {  //method to descent helicopter after it passes 6000 metres
        while(altitude > 0){
            Random rand = new Random();
            int decrement = rand.nextInt(40) + 10;
            altitude -= decrement;
            try{
                Thread.sleep(3000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        while(true){
            fly_obj();
            if(altitude <= 0){
                break;
            }
            try{
                Thread.sleep(3000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Helicopter Landed");
    }
}
