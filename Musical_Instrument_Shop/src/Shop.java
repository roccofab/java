import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Shop {
    ArrayList<Instrument> instrumentsAvailable;
    ArrayList<Client> clients;
    double balance;
    Random random;

    public Shop() {
        instrumentsAvailable = new ArrayList<>();
        clients = new ArrayList<>();
        this.balance = 0.0;  //the starter balance is 0.0
        this.random = new Random();
    }
    public void addInstrument(Instrument instrument) {
        instrumentsAvailable.add(instrument);
    }
    public void addClient(Client client) {
        clients.add(client);
    }
    public ArrayList<Instrument> getInstrumentsAvailable() {
        return instrumentsAvailable;
    }
    public void displayInstruments() {
        System.out.printf("%-20s %-20s %-10s %-20s\n", "Instrument:", "Brand:", "Price:", "Quantity in Stock:");
        for (Instrument instrument : instrumentsAvailable) {
            System.out.printf("%-20s %-20s $%-9.2f %-20d\n",
                    instrument.getInstrumentName(),
                    instrument.getBrand(),
                    instrument.getPrice(),
                    instrument.getQuantityInStock());
        }
    }
    public void sellInstruments(ArrayList<Instrument> instruments) {
        Scanner scanner = new Scanner(System.in);
        displayInstruments();
        Instrument chosenInstrument;
        do {
            System.out.println("Enter the Name of the Instrument to buy: ");
            String choice = scanner.nextLine();
            System.out.println("Enter the Brand of the Instrument: ");
            String brandChoice = scanner.nextLine();
            chosenInstrument = null;
            for (Iterator<Instrument> iterator = instrumentsAvailable.iterator(); iterator.hasNext();) {  //get the instrument from the list of instrumentsAvailable and assing it to chosenInstrument
                Instrument instrument = iterator.next();
                if (instrument.getInstrumentName().equalsIgnoreCase(choice) && instrument.getBrand().equalsIgnoreCase(brandChoice)) {
                    chosenInstrument = instrument;
                    iterator.remove();
                    break;
                }
            }
            if (chosenInstrument == null) {
                System.out.println("Not Found.");
                return;
            }
        } while (chosenInstrument == null);  //repeat actions till you enter the correct name and the correct brand of the instrument
        double price = chosenInstrument.getPrice();
        System.out.println("The Price is: " +price);
        System.out.println("Enter the Payment: ");
        double payment = scanner.nextDouble();
        scanner.nextLine();
        while(payment < price) {  //repeat action till you enter the correct payment that is greater or equal than the instrument price, you can't enter a price that is less than the instrument price
            System.out.println("Enter the Payment: ");
            payment = scanner.nextDouble();
            scanner.nextLine();
        }
        if(payment > price) {
            double change = payment - price;
            System.out.printf("The Change is: %.2f", change);
            balance += payment;  //add the payment to the balance
            balance -= change;   //decrease the balance of change amount
            System.out.println("\nSuccessfully Bought");
        }
        chosenInstrument.decrementQuantity();  //if there is more than one chosenInstrument: decrease the quantity in stock by 1
        if(chosenInstrument.getQuantityInStock() == 0) {
            instrumentsAvailable.remove(chosenInstrument);   //if there is only one chosenInstrument: remove it from the list
        }
        balance += payment;   //add the correct payment to the balance
        //add the client to the list clients
        System.out.println("Enter your Name:");
        String clientName = scanner.nextLine();
        boolean exists = false;
        for (Client client : clients) {  //search for the client in the clients list
            if (client.getClientID() != 0) {
                // Increase the quantity of instruments purchased for the existing client
                client.incrementQuantityInstrumentBought();
                exists = true;
                break;
            }
        }
        //add the new client to the list clients
        int clientID = generateRandomID(); //Generate random id for the new  client
        clients.add(new Client(clientName, clientID, 1));
    }
    private int generateRandomID() {
        int id = random.nextInt(10000000) + 1;
        return id;
    }
}
