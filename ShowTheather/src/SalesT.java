public class SalesT extends Theather {  //subclass of the superclass Theather
    public SalesT(String s, int f, int r) {  //the subclass SalesT doesn't inherit the constructor from the superclass Theather
        super(s, f, r);
    }

    void sellTickets(int x, boolean p) {
        if (p && x <= getGroundFloorSeats()) {
            System.out.println("Successfully sold " + x + " seats on the ground floor.");
        } else if (!p && x <= getRaisedGroundFloorSeats()) {
            System.out.println("Successfully sold " + x + " seats on the raised ground floor.");
        } else {
            System.out.println("Insufficient seats available.");
        }
    }

    int summary(boolean x) {
        if(x == true) {
            return groundFloorSeats;
        } else {
            return raisedGroundFloorSeats;
        }
    }
}
