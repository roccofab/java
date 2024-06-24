import java.util.Random;
public class Car {
    private String brand;
    private String model;
    public int speed;
    Random rand = new Random();

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
        speed = rand.nextInt(150) + 10;  //The speed of the car at the beginning is random number between 10 and 160
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getSpeed(){
        return speed;
    }
}
