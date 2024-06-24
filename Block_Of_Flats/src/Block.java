/**
 * The Block class represents a building block composed of multiple floors,
 *with each floor containing a specified number of flats.
 *<p>
 *Each flat is initialized with default values for the owner's name, number
 *of tenants, and surface area. The class provides methods to set the owner
 *and number of tenants for a specific flat, and to print information about
 *all the flats in the block.
 */
public class Block {
    Flat[][] flats;
    int numberFloors;
    int FlatPerFloor; //number of flats on each floor

    /**
     *Constructs a new Block with the specified number of floors, flats per floor,
     *and surface areas for each flat.
     *<p>
     *The constructor initializes the owner's name to "Nobody", the number of tenants
     *to 0, and sets the surface area of each flat based on the provided array.
     *</p>
     *@param numberFloors the number of floors in the block
     *@param FlatPerFloor the number of flats on each floor
     *@param FlatsSurfacesPerFloor an array containing the surface areas for each flat on the floors
     *
     */
    public Block(int numberFloors, int FlatPerFloor, int[] FlatsSurfacesPerFloor){
        this.numberFloors = numberFloors;
        this.FlatPerFloor = FlatPerFloor;
        flats = new Flat[numberFloors][FlatPerFloor];  //The block of Flat is composed of 6 floors and 4 flats on each floor
        for(int i = 0; i < numberFloors; i++){
            for(int j = 0; j < FlatPerFloor; j++){
                flats[i][j] = new Flat("Nobody", 0, i, FlatsSurfacesPerFloor[j]);
            }
        }
    }

    /**
     * Sets the owner and number of tenants for a specific flat.
     *
     * @param floor the floor number where the flat is located
     * @param numberFlat the flat number on the specified floor
     * @param owner the new owner's name
     * @param TenantsNum the new number of tenants
     */
    public void setOwnerTenants(int floor, int numberFlat, String owner, int TenantsNum){
        flats[floor][numberFlat-1].setOwner(owner);
        flats[floor][numberFlat-1].setNumberTenants(TenantsNum);
    }
    /**
     * Prints information about all the flats in the block.
     */
    public void printInfo(){
        for(int i = 0; i < numberFloors; i++){
            System.out.println("\n");
            System.out.println("Number Floor " +i+ ":");
            for(int j = 0; j < FlatPerFloor; j++){
                System.out.println("\nFlat " +(j+1)+ ":");
                System.out.println(flats[i][j].toString());
            }
        }
    }
}
