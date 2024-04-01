public class CargoShip extends Navy {
    private int tonnellage;

    public CargoShip(String name, int tonnellage) {  //constructor for the subclass CargoShip
        super(name);
        this.tonnellage = tonnellage;
    }
    public double RegistrationCost() {
        return tonnellage * 50;
    }
    @Override
    public String toString() {
        return "CargoShip: " + name + " (Tonnellage: " + tonnellage + ")";
    }
}
