import java.util.Random;

public class Airplane implements  flyable, Runnable{
    private int altitude;
    private Object lock;
    public Airplane(Object lock){
        this.altitude = 0;
        this.lock = lock;
    }
    @Override
    public void fly_obj() {
        Random rand = new Random();
        int increment = rand.nextInt(50) + 10;
        altitude += increment;
        if(altitude > 12000){
            descent_obj();
        }
        synchronized (lock) {  //syncronize printing for airplane
            System.out.println("Airplane Altitude: " + altitude + " metres");
        }
    }

    @Override
    public void descent_obj() {  //method to descent Airplane after it passes 12000 metres
        while(altitude > 0){
            Random rand = new Random();
            int decrement = rand.nextInt(50) + 10;
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
            if (altitude <= 0) {
                break;
            }
            try{
                Thread.sleep(3000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Airplane landed");
    }
}
