public class Theather {
    public String show;
    public int groundFloorSeats, raisedGroundFloorSeats;

    public Theather(String s, int f, int r) {  //constructor of the class theather
        show = s;
        groundFloorSeats = f;
        raisedGroundFloorSeats = r;
    }
    void assignGroundFloorSeats(int x) {  //method to calculate the available seats for the ground floor of the theather x is the number of seats occupied, so the total seats of raised ground floor - x return the avilable seats
        groundFloorSeats -= x;
    }
    void assignRaisedGroundFloorSeats(int y) {  //method to calculate the available seats for the raised ground floor of the theather y is the number of seats occupied, so the total seats of raised ground floor - y return the available seats
        raisedGroundFloorSeats -= y;
    }


    public int getGroundFloorSeats() {
        return groundFloorSeats;
    }
    public int getRaisedGroundFloorSeats() {
        return raisedGroundFloorSeats;
    }
}
