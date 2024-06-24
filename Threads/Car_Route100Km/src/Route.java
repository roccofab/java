import java.util.Random;

public class Route extends Car implements Runnable {
    private Random rand = new Random( );

    public Route(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void run() {
        double position = 0;
        while (position < 5000) {  //threads stop when the position is greater than 150
            speed = rand.nextInt(150) + 40;  //generate a random speed between 150 and 40
            double distance = (speed * 1000.0) / 3600.0;  //the distance traveled in one second
            position += distance;
            System.out.println(String.format("Car %s-%s Speed: %d km/h Location: %.0f meters", getBrand(), getModel(), speed, position));
            try {  //get a new thread every second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Route is interrupted");
            }
        }
        System.out.println(getBrand()+ " " +getModel()+ " Has Finished The Route");
    }
}
