import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Archive archive;
        Archive.loadFromFile("newArchive.txt");  //filename will store the name of the file where data'll be loaded

        // check if newArchive.txt exists: in this file are stored the navys
        File file = new File("newArchive.txt");
        if (file.exists()) {
            archive = Archive.loadFromFile("newArchive.txt");  //read existing ships generated and added in the previous run
        } else {
            // if the file newArchive.txt doesn't exist: create a new Archive with 11 random navys and then save on the file newArchive.txt
            archive = new Archive(11);
            archive.saveToFile("newArchive.txt");  //save 11 navys generate on newArchive.txt
        }

        //print
        assert archive != null;
        String archiveShips = archive.printArchive();
        System.out.println(archiveShips);

        // prints the ships stored in the archive
        String choice;
        do {
            System.out.println("Add New Ship (press add or exit to stop): ");
            choice = scanner.nextLine();
            if (choice.equals("exit")) {
                break;
            }
            System.out.println("Cruise Ship (press 'C'), Cargo Ship (press 'P'): ");
            String choice2 = scanner.nextLine();
            switch (choice2) {
                case "C":
                    System.out.println("Enter Cruise Ship Code (IMO/ELIA + 7Numbers + Nation + Country + C): ");
                    String cruiseShipCode = scanner.nextLine();
                    System.out.println("Enter Maximum Capacity (Maximum 5000): ");
                    int maxCapacity = scanner.nextInt();
                    scanner.nextLine();
                    CruiseShip cruiseShip = new CruiseShip(cruiseShipCode, maxCapacity);
                    if(maxCapacity <= 2000) {
                        double costSC = cruiseShip.registrationSmallCruise();
                        System.out.println(costSC);
                    }  else if(maxCapacity >= 2500)  {
                        double costBC = cruiseShip.RegistrationBigCruise();
                        System.out.println(costBC);
                    }
                    archive.addShip(cruiseShip);
                    break;

                case "P":
                    System.out.println("Enter Cargo Ship Code (IMO + 7Numbers + Nation + Country + c): ");
                    String cargoShipCode = scanner.nextLine();
                    System.out.println("Enter Maximum Tonnellage (Maximum Weight is 200000): ");
                    int cargoWeight = scanner.nextInt();
                    scanner.nextLine();
                    CargoShip cargoShip = new CargoShip(cargoShipCode, cargoWeight);
                    double costCargo = cargoShip.RegistrationCost();
                    System.out.println(costCargo);
                    archive.addShip(cargoShip);
                    break;
            }
            archive.saveToFile("newArchive.txt");  //saves manually added ships to the file
        } while (!choice.equals("exit"));
    }
}
