public class Flat {
    private String owner;
    private final int area;
    private final int floor;
    int numberTenants;

    public Flat(String owner, int numberTenants, int floor, int area){
        this.owner = owner;
        this.numberTenants = numberTenants;
        this.area = area;
        this.floor = floor;
    }
    public String getOwner(){
        return owner;
    }
    public int getArea(){
        return area;
    }
    public int getFloor(){
        return floor;
    }
    public int getNumberTenants(){
        return numberTenants;
    }
    public String setOwner(String owner){
        this.owner = owner;
        return this.owner;
    }
    public int setNumberTenants(int numberTenants){
        this.numberTenants = numberTenants;
        return this.numberTenants;
    }
    public String toString(){
        return "Owner: " + this.owner + "\nNumber of tenants: " + this.numberTenants + "\nFloor: " + this.floor + "\nArea: " + this.area+ " mq";
    }
}
