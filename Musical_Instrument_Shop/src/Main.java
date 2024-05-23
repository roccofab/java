import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        int choice;
        shop.addInstrument(new Instrument("Classical Guitar", "Gibson", 350.99, 5));
        shop.addInstrument(new Instrument("Electric Guitar", "Fender", 1000, 2));
        shop.addInstrument(new Instrument("Grand Piano", "Fazioli", 20000, 2));
        shop.addInstrument(new Instrument("Violin", "Stainer", 699.99, 5));
        shop.addInstrument(new Instrument("Trumpet", "Fazioli", 1000.99, 3));
        do{
            System.out.println("\nEnter your Choice:");
            System.out.println("1.Display Available Instruments(press 1): ");
            System.out.println("2.Buy Instrument(press 2): ");
            System.out.println("Exit(press 0): ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    shop.displayInstruments();
                    break;

                case 2:
                    shop.sellInstruments(shop.getInstrumentsAvailable());
                    break;
            }
        } while(choice!= 0);
    }
}