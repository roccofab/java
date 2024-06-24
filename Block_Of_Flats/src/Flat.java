/**
 *The Flat class represents a flat (apartment) with details about its owner,
 *number of tenants, floor, and area.
 *<p>
 *This class provides methods to access and modify the owner and number of tenants,
 *while the area and floor are immutable once the object is created.
 *</p>
 */
public class Flat {
    private String owner;
    private final int area;
    private final int floor;
    int numberTenants;

    /**
     * @param owner the name of the owner
     * @param numberTenants the number of tenants in the flat
     * @param floor the floor on which the flat is located
     * @param area the area of the flat in square meters
     */
    public Flat(String owner, int numberTenants, int floor, int area){
        this.owner = owner;
        this.numberTenants = numberTenants;
        this.area = area;
        this.floor = floor;
    }
    public String getOwner(){
        return owner;
    }

    /**
     *
     * @return area of the flat in square meters
     */
    public int getArea(){
        return area;
    }

    /**
     *
     * @return floor where the flat is located
     */
    public int getFloor(){
        return floor;
    }

    /**
     *
     * @return number of tenants in the flat
     */
    public int getNumberTenants(){
        return numberTenants;
    }

    /**
     *
     * @param owner the new owner's name
     * @return the new owner's name
     */
    public String setOwner(String owner){
        this.owner = owner;
        return this.owner;
    }

    /**
     *
     * @param numberTenants the number of tenants in the flat
     * @return the number of tenants in the flat
     */
    public int setNumberTenants(int numberTenants){
        this.numberTenants = numberTenants;
        return this.numberTenants;
    }

    /**
     *
     * @return a string representation of the flat
     */
    public String toString(){
        return "Owner: " + this.owner + "\nNumber of tenants: " + this.numberTenants + "\nFloor: " + this.floor + "\nArea: " + this.area+ " mq";
    }
}
