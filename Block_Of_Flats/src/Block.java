public class Block {
    Flat[][] flats;
    int numberFloors;
    int FlatPerFloor; //number of flats on each floor

    /*Constructor initialize name's owner to Nobody, number of tenats to 0 and the
      surfaces area of each flat on the floors
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

    public void setOwnerTenants(int floor, int numberFlat, String owner, int TenantsNum){
        flats[floor][numberFlat-1].setOwner(owner);
        flats[floor][numberFlat-1].setNumberTenants(TenantsNum);
    }
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
