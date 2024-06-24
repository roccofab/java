import java.util.Random;

public class Spacecraft implements flyable, Runnable {
    private long altitude;
    private Object lock;

    public Spacecraft(Object lock) {
        this.altitude = 0;
        this.lock = lock;
    }

    @Override
    public void fly_obj() {
        Random rand = new Random( );
        int increment = rand.nextInt(50) + 10;
        this.altitude += increment;
        if (altitude > 1000) {
            descent_obj( );
        }
        synchronized (lock) { // Synchronize printing for spacecraft
            System.out.println("SpaceCraft Altitude: " + altitude + " km");
        }
    }

    @Override
    public void descent_obj() {   //method to descent spacecraft after the spacecraft  passes 1000km altitude
        while (altitude > 0) {
            Random random = new Random( );
            int decrement = random.nextInt(1000) + 500;
            altitude -= decrement;
            System.out.println("Spacecraft: altitude " + altitude + " km");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            fly_obj( );
            if (altitude <= 0) {
                break;
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace( );
            }
        }
        System.out.println("Spacecraft landed.");
    }
}
