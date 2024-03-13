public class RegisteredScooter extends Scooter{
    String numberPlate;
    public RegisteredScooter(String type, String color,String displacement, String price, double maxSpeed, double currentSpeed, String numberPlate) {   //extended class constructor of the class Scooter
        super(type, color,displacement, currentSpeed, price,maxSpeed);
        this.numberPlate = numberPlate;

    }
    public String getNumberPlate() {
        return numberPlate;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void accelerate(double accelerationRate) {   //method accelleration to increase the current speed of the scooter of a number accellerationRate
        double a = accelerationRate + currentSpeed;
        if(!antiTheft) {
            if(a <= maxSpeed) {   //if the currentSpeed plus accellerationRate is less than maxSpeed you get the accelleration else you get MaxSpeed of the scooter
                currentSpeed = a;
            } else {
                currentSpeed = maxSpeed;
            }
        }
    }
    @Override
    public String getInfo() {   //get info for registered scooter
        return "Type: " + type +
                "\nColor: " + color +
                "\nDisplacement: " + displacement +
                "\nNumber Plate: " + numberPlate +
                "\nPrice: " + price;
    }
}
