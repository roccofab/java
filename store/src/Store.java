import java.util.ArrayList;
import java.util.List;
public class Store {
    private final List<product> products;
    private String name;
    private double price;
    private double amount;
    private double weight;

    public Store(){

        this.products = new ArrayList<>();

    }
   public void addProduct(product product) {

        products.add(product);

    }
    public void removeProduct(String product) {

        products.remove(product);

    }

    public product getProduct(String name) {
        for(product product : products) {
            if(product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
    public void viewList() {
        for(product product : products) {
            System.out.println("\t\t" +product+ "\n\t\t");
        }
    }
    public static void displayMenu() {
        System.out.println("\n*** NavBar ***");
        System.out.println("1. Add a product");
        System.out.println("2. Search for a product");
        System.out.println("3. Remove a product");
        System.out.println("4. Update product packages");
        System.out.println("5. View product list");
        System.out.println("6. Exit");
    }
    public void showInitialList() {
        if(products.isEmpty()) {
            System.out.println("The store is empty, Add products");
        } else {
            viewList();
        }
    }

    public Store setName(String name) {
        this.name = name;
        return this;
    }

    public Store setPrice(double price) {
        this.price = price;
        return this;
    }

    public Store setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public Store setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public product createProduct() {
        return new product(name, price, amount, weight);
    }

    public void updatePackageProduct(String nameProduct, double newQuantity) {
        product storedProduct = getProduct(nameProduct);
        if(storedProduct != null) {
            storedProduct.setAmount(newQuantity);
            System.out.println("Updated");
        } else {
            System.out.println("Product not Found");
        }
    }
}
