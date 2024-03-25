import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Show Name: ");
        String showName = sc.nextLine();

        Theather t = new Theather(showName, 100, 50);   //object t from the class Theather

        System.out.println("\t\t" + showName);
        System.out.println("Total Seats On the Ground Floor: " + t.getGroundFloorSeats());  //get total number of seats on the ground floor
        System.out.println("Total Seats On the Raised Ground Floor: " + t.getRaisedGroundFloorSeats());  //get total number of seats on the raised ground floor

        System.out.println("Enter Reserved Seats on the Ground Floor: ");
        int seatsF = sc.nextInt();
        t.assignGroundFloorSeats(seatsF);

        System.out.println("Enter Reserved Seats on the Raised Ground Floor: ");
        int seatsR = sc.nextInt();
        t.assignRaisedGroundFloorSeats(seatsR);

        SalesT tickets = new SalesT(showName, t.getGroundFloorSeats(), t.getRaisedGroundFloorSeats());  //object tickets from the class SalesT

        System.out.println("Enter Seats to Reserve on the Ground Floor: ");
        int sellGround = sc.nextInt();
        tickets.sellTickets(sellGround, true);   //if p is true you get the number of the available seats on the ground floor

        System.out.println("Enter Seats to Reserve on the Raised Ground Floor: ");
        int sellRaised = sc.nextInt();
        tickets.sellTickets(sellRaised, false);   //if p is false you get the number of the available seats on the raised ground floor

        System.out.println("Available Seats on the ground floor: " + t.getGroundFloorSeats());
        System.out.println("Available Seats on the Raised Ground Floor: " +t.getRaisedGroundFloorSeats());
    }
}