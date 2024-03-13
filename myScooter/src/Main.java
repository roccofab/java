import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* in this program i've created a list of not registered scooters from the class Scooter, the class RegisteredScooter inherit
        * all attributes of the class Scooter and then add the number of plate to the scooter. You can select a scooter
        * , then print all information about the selected scooter and then you can add the number of plate to the selected scooter.
        * Once you've added the number of plate the scooter is registered.
        * In the end the original not registered scooter will be deleted from the list scooters and added to registeredScooter list*/

        ArrayList<Scooter> scooters = new ArrayList<>();   //ArrayList scooters contain the scooters not registered
        ArrayList<RegisteredScooter> registeredScooters = new ArrayList<>();  //ArrayList registeredScooters 'll contain the scooter that you choose to register

        scooters.add(new Scooter("Aprilia RSV4", "black", "1099cc", 0, "67999€", 350));
        scooters.add(new Scooter("Aprilia RSV4", "orange", "1099cc", 0, "46900€", 350));
        scooters.add(new Scooter("Aprilia RS 660", "metal", "659cc", 0, "17799€", 270));
        scooters.add(new Scooter("Aprilia RS 125", "blue and metal", "124cc", 0, "5629€", 120));
        scooters.add(new Scooter("Kawasaki ninja 650 Sport Pack", "green", "649cc", 0, "31789€", 320));
        scooters.add(new Scooter("Bimota Tesi H2", "red and white", "999cc", 0, "70000€", 320));
        scooters.add(new Scooter("BMW M100 RR", "black", "999cc", 0, "89998€", 270));
        scooters.add(new Scooter("Ducati Panigale", "black", "955cc", 0, "25500€", 350));
        scooters.add(new Scooter("Aston Martin AMB 001", "black", "997cc", 0, "124000€", 350));

        for (Scooter scooter : scooters) {   //print the list of the scooters not registered
            System.out.println(scooter.getInfo() + "\n");
        }
        int choice;
        do {
            System.out.println("Enter Choice (0-" + (scooters.size() - 1) + " to Register, -1 to Exit): ");
            choice = sc.nextInt();
            sc.nextLine();
        } while (choice < -1 || choice >= scooters.size());

        while (choice >= 0) {
            if (choice < scooters.size()) {
                Scooter scooterToRegister = scooters.get(choice);  //get the object scooter you need to register from the list scooters
                System.out.println("Enter number plate for " + scooterToRegister.getType() + ": ");
                String numberPlate = sc.nextLine();

                //create the object registered scooter
                RegisteredScooter registeredScooter = new RegisteredScooter(
                        scooterToRegister.getType(),
                        scooterToRegister.getColor(),
                        scooterToRegister.getDisplacement(),
                        scooterToRegister.getPrice(),
                        scooterToRegister.getMaxSpeed(),
                        scooterToRegister.getCurrentSpeed(),
                        numberPlate);

                registeredScooters.add(registeredScooter);
                scooters.remove(choice);  //remove the object scooter that is currently registered, from the list scooters

                System.out.println("Scooter successfully registered!");
                break;
            }
        }
            // Display updated scooter information about the list of not registered scooters(scooters)
            System.out.println("\nAvailable Scooters(not registered):");
            for (Scooter scooter : scooters) {
                System.out.println(scooter.getInfo() + "\n");
            }

            System.out.println("\nRegistered Scooters:");   //print the list of registered scooters added from the list of not registered scooters
            for (RegisteredScooter registeredScooter : registeredScooters)
                System.out.print(registeredScooter.getInfo() + "\n");
        }
}