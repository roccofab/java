public class Scooter {
    public String type;
    public String color;
    public String displacement;
    public double currentSpeed;
    public String price;
    public double maxSpeed;
    public boolean antiTheft = false;

    public Scooter(String type, String color,String displacement, double currentSpeed, String price, double maxSpeed) {   //constructor of the class Scooter with 4 parameters
        this.type = type;
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.antiTheft = antiTheft;
        this.displacement = displacement;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }
    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public String getDisplacement() {
        return displacement;
    }

     public double getCurrentSpeed() {
        return currentSpeed;
    }
    public String getPrice() {
        return price;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
     public void accelerate(double accelerationRate) {  //if the antiTheft is false this method can increase the scooter's speed
        if (!antiTheft) {
            // Check if acceleration rate is non-negative
            if (accelerationRate >= 0) {
                // Increase the current speed by the acceleration rate
                currentSpeed += accelerationRate;   //increment the current speed of the scooter
                System.out.println(" Current Speed: " + currentSpeed + " km/h");
            } else {
                System.out.println("Current Speed: " +currentSpeed+ "km/h");
            }
        } else {
            System.out.println("Anti-theft is enabled. Cannot accelerate.");
        }
    }

    void enterAntiTheft() {  //method to enter the antiTheft(if the antiTheft is true the scooter can't accelerate)
        antiTheft = true;
    }

    public String getInfo() {   //get the info for not registered scooters
        return "Type: " + type + "\nColor: " + color + "\nDisplacement: " + displacement+ "\nMax Speed: " +maxSpeed+ "\nPrice: " +price;
    }
}
