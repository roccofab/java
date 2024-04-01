import java.io.*;
import java.util.Random;
import java.util.Scanner;
/*Archive constructor istanciate an Array V of index n that contain small capacity cruise ships in the even positions
and cargo ships in the odd positions and if the index is odd a big cruise ship at position n - 1. Small Cruise Ships
has a capacity between 500 and 2000 places, Cargo Ships has a weight between 50000 and 200000 ton, Big Cruise Ships has a
capacity between 2500 and 5000 places.
 */
public class Archive {
    private static String fileName;
    Navy[] V;

    public Archive(int n) {   //constructor for the class Archive: n is the index of the Array V that contain cruise ships and cargo ships
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid size: " + n);
        }
        V = new Navy[n];
        Random rand = new Random();
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {   //if index position is even: add to V a small Cruise Ship or a Big Cruise Ship
                    V[i] = new CruiseShip(generateCruiseShipCode(), CapacitySmallCruiseShip());
            } else {  //if index position is odd: add to V a Cargo Ship
                V[i] = new CargoShip(generateCargoShipCode(), TonnelageCargo());
            }
            if(n % 2 != 0) {   //if n is odd: add to V a Cruise Ship that has a bigger capacity than the cruise ships in the even positions Ship
                V[n - 1] = new CruiseShip(generateCargoShipCode(), CapacityBigCruiseShips());
            }
        }
    }
    public String generateCruiseShipCode() {
        //Cruise ship names are represented in shipping registers by codes(-IT-NA for example means that it was registered in italy in Naples;-C means that it is a cruise ship)
        String[] RegisterCodes = {"IMO9876542-IT-GE-C", "IMO2345908-IT-NA-C", "IMO9231456-IT-GE-C", "CLIA5467893-IT-TS-C", "IMO6789543-IT-GT", "CLIA5434567-IT-LI-C", "CLIA4323435-IT-GE-C", "CLIA1234543-IT-GE-C", "IMO0981234-IT-CA-C", "IMO4356782-IT-NA-C", "IMO2871549-IT-GE-C"};
        Random rand = new Random();
        return RegisterCodes[rand.nextInt(RegisterCodes.length)];
    }
    public String generateCargoShipCode() {
        //transport ships such as cruise ships are represented by codes in the ship register but -IT for merchant ships, -c for container ships, -C for cruise ships
        String[] RegisterCodes = {"IMO9876547-IT-CA-I", "IMO9846637-IT-CA-I", "IMO9876547-IT-NA-c", "IMO9273167-IT-NA-c", "IMO9361164-IT-GE-c", "IMO9262367-IT-GE-c", "IMO9289964-IT-GT-I", "IMO9932144-IT-NA-I"};
        Random rand = new Random();
        return RegisterCodes[rand.nextInt(RegisterCodes.length)];
    }
    //CapacitySmallCruiseShip is the maximum number of passenger that small  CruiseShips can accomodate
    public int CapacitySmallCruiseShip() {
        //generate a random number places between 500 and 2000
        int minPlaces = 500;
        int maxPlaces = 2000;
        Random rand = new Random();
        return rand.nextInt((maxPlaces - minPlaces) + 1) + minPlaces;
    }
    public int CapacityBigCruiseShips() {
        //generate a random number places between 1000 and 2000
        int minPlaces = 2500;
        int maxPlaces = 5000;
        Random rand = new Random();
        return rand.nextInt((maxPlaces - minPlaces) + 1) + minPlaces;
    }
    public int TonnelageCargo() {
        //generate a random number between 50000 and 200000 that represent the weight(in ton) of the cargo ships
        int minTonnellage = 50000;
        int maxTonnellage = 200000;
        Random rand = new Random();
        return rand.nextInt((maxTonnellage - minTonnellage) + 1) + minTonnellage;
    }
    public String printArchive() {
        StringBuilder result = new StringBuilder();
        for (Navy navy : V) {
            result.append(navy.toString()).append("\n");
        }
        return result.toString();
    }
    public void saveToFile(String fileName) {  //this method let you write on a text file filename.txt using the object writer from the class PrintWriter: the printwriter class lets you save many data formats without converting them to strings manually
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Navy navy : V) {   //this loop read the ships stored in V and print the textual data on fileName.txt
                writer.println(navy.toString());
            }
        } catch (IOException e) {
            System.err.println("Errorr: " + e.getMessage());
        }
    }
    public void addShip(Navy ship) {
        Navy[] newV = new Navy[V.length + 1];
        System.arraycopy(V, 0, newV, 0, V.length);
        newV[V.length] = ship;
        V = newV;
    }
    public static Archive loadFromFile(String fileName) {
        Archive.fileName = fileName;  //filename will store the name of the file where data'll be loaded(newArchive.txt)
        Archive archive = null;  //archive will be used to store data read from the file
        try (Scanner scanner = new Scanner(new File(fileName))) {  //the block try open a new object Scanner that read the number of rows in the file
            int count = 0;  //count store the number of raws in the file
            while (scanner.hasNextLine()) {  //the loop continues reading the file as long as there are rows in the file
                count++;
                scanner.nextLine();
            }
            archive = new Archive(count);  //n (Archive parameter) is equal to count that represent the numbers on navys
        } catch (FileNotFoundException e) {  //catch exception if the file can't be got
            System.err.println("File not found: " + e.getMessage());
            return null; // Return null if the file can't be got
        }

        try (Scanner scanner = new Scanner(new File(fileName))) {  //the block try open a new object Scanner that read data from rows
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(": ");  //split strings by value ":" for example divide the ship's name from its information: "Cruise Ship:" / "codeShip and capacityShip"
                if (parts.length >= 2) {  //after the split checks if the string is split in two
                    String type = parts[0];  //string type can be Cruise Ship: or Cargo Ship:
                    String[] shipInfo = parts[1].split(" \\(");  //divides the second part of the row got previously based on the character "("
                    String name = shipInfo[0];
                    String[] details = shipInfo[1].substring(0, shipInfo[1].length() - 1).split(": ");  //extract specific information from the second part of the string
                    if (type.equals("CruiseShip") && details.length >= 2) {  //check if it is a Cruise Ship and if the second part of the string contains the two labels(codeShip and capacityShip)
                        int maxCapacity = Integer.parseInt(details[1].split(" ")[0]);  //if it is a Cruise Ship extract the value maxCapacity from the second part of the string
                        archive.addShip(new CruiseShip(name, maxCapacity));  //Adds a new instance of CruiseShip to the archive with parameters name and maxCapacity
                    } else if (type.equals("CargoShip") && details.length >= 2) {  //check if it is a Cargo Ship and if the second part of the string contains the two labels(codeShip and capacityShip)
                        int tonnellage = Integer.parseInt(details[1].split(" ")[0]);  //if it is a Cargo Ship extract the value tonnellage from the second part of the string
                        archive.addShip(new CargoShip(name, tonnellage));   //Adds a new instance of CargoShip to the archive with parameters name and tonnelage
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Error parsing ship details: " + e.getMessage());
        }
        return archive;
    }
}
