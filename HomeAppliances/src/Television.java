import java.util.Random;

public class Television extends Appliance{
    int inches;
    double canon;
    String model;
    private static final String[] TelevisionModels = {"LG 24LM520D-WU 24", "Samsung UN32M4500AFXZA", "TCL 43S425 43", "Sony XBR75X900F ", "LG OLED77CXPUA", "Sony XBR85X900H", "Philips 24PFS6805/12", "Philips 55OLED805/12", "Sony KD-55A8", "TCL 32ES560"};
    public Television(String color, double power,int inches, double canon) {  //constructor of the subclass Television
        super(color, power);
        this.inches = inches;
        this.canon = canon;
        this.model = generateRandomModel();
    }
    public double CalculateConsumption() {   //generic method to calculate consumption's television
        return canon + (power * inches);
    }
    private String generateRandomModel() {
        Random rand = new Random();
        return TelevisionModels[rand.nextInt(TelevisionModels.length)];
    }

    @Override
    public String toString() {
        return "Type: televison, Model: " + model + " Color: " + color + " Power: " + power + " Inches: " + inches + " Canon: " + canon;
    }
}
