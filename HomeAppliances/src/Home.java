import java.util.Random;

public class Home {
    Appliance[] V;   //Array V store home's appliances

    public Home(int n, int m) {   //n-fridges and m-televisions
        V = new Appliance[n + m];
        int index = 0;
        for (int i = 0; i < n; i++) {
            V[index++] = new Fridge(generateFridgeColor(), generateFridgePower(), generateCapacity());
        }
        for (int i = 0; i < m; i++) {
            V[index++] = new Television(generateTVcolor(), generateTVpower(), generateTVinches(), generateTVcanon());
        }
    }
    public int generateCapacity() {  //generate a random number between 100 and 700 that represent the fridge's capacity(litres)
        Random rand = new Random();
        int min = 100;
        int max = 700;
        return rand.nextInt(max - min + 1) + min;
    }
    public double generateFridgePower() {   //generate a random number between 100 and 600 that represent the fridge's power(watt)
        Random rand = new Random();
        double min = 100;
        double max = 600;
        return rand.nextDouble() * (max - min) + min;
    }
    public String generateFridgeColor() {   //generate a random color between the colors in the arry colors
        String[] colors = {"White", "Grey", "Metallic", "Inox", "Black", "Wood", "Red", "Beige", "brownish"};
        Random rand = new Random();
        return colors[rand.nextInt(colors.length)];
    }
    public String generateTVcolor() {   //generate a random color between the colors in the array colors
        String[] colors = {"Black", "Grey", "Metallic", "Blue", "Black and Grey", "White", "Aluminium", "Gold and Copper"};
        Random rand = new Random();
        return colors[rand.nextInt(colors.length)];
    }
    public int generateTVinches() {  //generate a random number between 24 and 80 that represent the inches for televisions
        Random rand = new Random();
        int min = 24;
        int max = 80;
        return rand.nextInt(max - min + 1) + min;
    }
    public double generateTVpower() {   //generate a random number between 30 and 300 that represent the power of television
        Random rand = new Random();
        double min = 30;
        double max = 300;
        return rand.nextDouble() * (max - min) + min;
    }
    public double generateTVcanon() {  //generate a random number between 20 a 100 that represent the canon of television
        Random rand = new Random();
        double min = 20;
        double max = 100;
        return rand.nextDouble() * (max - min) + min;
    }
    public double calculateMantainanceAppliance() {  //calculate the total energy consumption
        double consumption = 0;
        for(int i = 0; i < V.length; i++) {
            if(V[i] instanceof Fridge) {   //stance of the class Fridge
                consumption += ((Fridge) V[i]).CalculateConsumption();
            } else if(V[i] instanceof Television) {  //stance of the class television
                consumption += ((Television) V[i]).CalculateConsumption();
            }
        }
        return consumption;
    }
    public String printAppliances() {   //print house appliances that are stored in the array V
        String appliances = "";
        for(int i = 0; i < V.length; i++) {
            appliances += V[i].toString() + "\n";
        }
        System.out.println(appliances);
        return appliances;
    }
}
