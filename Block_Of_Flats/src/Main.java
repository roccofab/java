
public class Main {
    public static void main(String[] args) {
        int[] FlatsSurfaces = {120, 90, 60};
        Block block = new Block(6, 3, FlatsSurfaces);
        block.setOwnerTenants(1, 2, "John", 4);
        block.printInfo();
    }
}