public class CruiseShip extends Navy {
    private int MaxCapacity;

    public CruiseShip(String name, int MaxCapacity) {  //Constructor for the subclass CruiseShip
        super(name);
        this. MaxCapacity = MaxCapacity;
    }
    public double RegistrationBigCruise() {
        return MaxCapacity * 100.50;
    }
    public double registrationSmallCruise() {
        return  (MaxCapacity * 70.50);
    }
    @Override
    public String toString() {
        return "CruiseShip: " + name + " (MaxCapacity: " + MaxCapacity + " Places)";
    }
}
