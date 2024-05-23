import java.util.Random;

public class Fridge extends Appliance{
    int Capacity;  //capacity of the fridges is often expressed in Litres
    String model; // Model name of the fridge
    private static final String[] fridgeModels = {"Samsung RF23M8570SG 23", "LG LFXS28968S 27.9", "Whirlpool WRF535SWHZ 25", "Haier HCR17B", "Danby Designer DAR044A1WDD", "GE Profile PFE28KYNFS 27.9", "Frigidaire Gallery FGHB2868TF", "Samsung RS27T5200SR 27", "Whirlpool WRS321SDHZ 21"};

    public Fridge(String color, double power, int Capacity) {  //constructor of the subclass Fridge
        super(color, power);
        this.Capacity = Capacity;
        this.model = generateRandomModel();
    }
    public double CalculateConsumption() {   //generic method to calculate consumption's fridges
        return power * Capacity;
    }
    private String generateRandomModel() {  //generate a random fridge's model from the array fridgeModels
        Random rand = new Random();
        return fridgeModels[rand.nextInt(fridgeModels.length)];
    }

    @Override
    public String toString() {
        return "Type: Fridge, Model: " + model + ", Color: " + color + ", Power: " + power + ", Capacity: " + Capacity + " Litres";
    }
}
