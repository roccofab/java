import java.util.Random;
import com.github.javafaker.Faker;   //dependencies for Faker library creation random names(see pom.xml file)
public class soccer {
    private Player[] V;  //Array contain all player's soccer
    private int index;

    public soccer(int m, int n) {   //constructor method for the class soccer(m represent goalkeepers and n strikers)
        V = new Player[m + n];
        index = 0;
        Faker faker = new Faker();   //Faker object to create random names
        for(int i = 0; i < m; i++) {
            V[index++] = new GoalKeeper(generateRandomName(faker), generateAge(), GeneratePenaltiesSaved());   //add new goalkeepers to the Array Player
        }
        for(int i = 0; i < n; i++) {
            V[index++] = new Striker(generateRandomName(faker), generateAge(), generateGoals());   //add new strikers to the array Player
        }
    }
    public void printSoccer() {
        for(int i = 0; i < index; i++) {
            System.out.println(V[i].getName() + " " + V[i].getAge() + " ");
        }
    }
    private String generateRandomName(Faker faker) {
        return faker.name().firstName() + " " + faker.name().lastName();
    }

    public String GenerateNames()  {   //method to generate names + surnames using random function to get a casual index and then concatenate names at the index found + surname at the index found
        String[] names = {"Cristiano", "Lionel", "Abram", "Francesco", "Aimar", "Adrien", "Alberto", "Albin", "Carl", "Carles", "Carlos", "David", "John", "Luis", "Patrick", "Eduard", "Edoardo", "Felipe", "Filippo", "Angelo", "Angel", "Erik", "Mario", "Dashi", "Ronnie", "Gabriel", "Isaac", "Ibanez", "Ivan", "Alessio", "Kevin", "Kelvin", "Leo", "Lewis", "Lorenzo"};
        String[] surnames = {"Henderson", "Cacace", "Simic", "Serpe", "Kivila", "Ronaldo", "Messi", "dom", "Musso", "Dol", "Luis Palomino", "Spedalieri", "Correa", "Vasquez", "Boga", "Zoet", "Noa", "Bijol", "Furlan", "Saio", "Anderson", "Perisic", "Radu", "Ibanez", "Moro", "Gavioli", "Totti", "Reina", "Florio", "Perez", "Matic", "Juwara", "Esposito", "Bucci","Alban", "Pogba" };
        Random rand = new Random();
        int indexNames = (int) (Math.random() * names.length);
        int indexSurnames= (int) (Math.random() * names.length);
        return names[indexNames] + " " + surnames[indexNames];
    }
    public int GeneratePenaltiesSaved() {   //generate a casual number between 10 and 100 that represent the penalties saved by the goalkeepers
        Random rand = new Random();
        int min = 10;
        int max = 100;
        return rand.nextInt(max - min + 1) + min;
    }
    public int generateGoals() {   //generate a casual number between 10 and 200 that represent the number of strikes for the Striker
        Random rand = new Random();
        int min = 10;
        int max = 200;
        return rand.nextInt(max - min + 1) +min;
    }
    public int generateAge() {  //generate a casual number between 18 and 54 that represent the soccer's players age
        Random rand = new Random();
        int min = 18;
        int max = 54;
        return rand.nextInt(max - min + 1) +min;
    }
    public String getMaxPlayerValue() {  //get the max commercial value of the player based on whether he's a goalkeeper or a striker
        int max = 0;
        String nameP = " ";
        for(Player p : V) {
            int value = 0;
            if(p instanceof GoalKeeper) {    //if the player in V is a goalkeeper call the method calculatePlayerValue of the subclass GoalKeeper
                value = ((GoalKeeper) p).calculatePlayerValue();
            } else if (p instanceof Striker) {   //if the player in V is a striker call the method CalculatePlayerValue of the subclass Striker
                value = ((Striker) p).CalculatePlayerValue();
            }
            if(value > max) {   //get the name of the max commercial value for the player
                nameP = p.getName();
                max = value;
            }
        }
        return nameP;
    }
    public String getPlayerInfo(String playerName) {
        for(Player p : V) {
            if(p != null && p.getName().equalsIgnoreCase(playerName)) {  //if the player in V is a Goalkeeper get information about the goalkeeper
                if(p instanceof GoalKeeper) {
                    GoalKeeper gk = (GoalKeeper) p;
                    return "Age: " +gk.getAge()+ " \nNumber Penalties Saved: " +gk.getPenaltiesSaved()+ " \nCommercial Value: " + gk.calculatePlayerValue();
                } else if(p instanceof Striker) {   //if the player in V is a striker get  information about the striker
                    Striker s = (Striker) p;
                    return "Age: " +s.getAge()+ " \nNumber of Strikes: " +s.getGoalScored()+ " \nCommercial Value: " +s.CalculatePlayerValue();
                }
            }
        }
        return null;
    }
}
