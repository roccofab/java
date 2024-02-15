import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Store store = new Store();  //Create a store object using the method constructor from the class Store
        store.showInitialList();   //Show the initial list using the method showInitialList of the class Store, if the list is empty you will get the message: "The store is empty, Add products"
        while(true) {
            System.out.println("Enter Product name(stop to finish): ");
            String name = new Scanner(System.in).nextLine();

            if(name.equals("stop")) {
                break;
            }
            System.out.println("Enter Product Price: ");
            String priceInput = new Scanner(System.in).nextLine().trim();
            double price;
            try {
                price = Double.parseDouble(priceInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid price. Please enter a valid number.");
                continue;
            }


            System.out.println("Enter Amount of package: ");
            String amountInput = new Scanner(System.in).nextLine();
            double amount;
            try {
                amount = Double.parseDouble(amountInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount, enter a valid number!");
                continue;
            }

            System.out.println("Enter weight per package: ");
            String weightInput = new Scanner(System.in).nextLine();
            double weight;
            try {
                weight = Double.parseDouble(weightInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid weight, enter a valid number!");
                continue;
            }


            product product = new Store().setName(name).setPrice(price).setAmount(amount).setWeight(weight).createProduct();   //Create a product object using the method constructor from the class product
            store.addProduct(product);   //Add the product built from input user using the method addProduct from the class Store
        }

        //Search for a product
        System.out.println("Search for a product?(yes or no): ");
        String symbol = new Scanner(System.in).nextLine();
        switch(symbol) {
            case "yes":
                System.out.println("Enter the name of the product to search: ");
                String searchProduct = new Scanner(System.in).nextLine();
                product productFound = store.getProduct(searchProduct);  //Search for a product using the method getProduct from the class Store

                if(productFound != null) {
                    System.out.println(productFound);
                } else {
                    System.out.println("Product not found");
                }
                break;

            case "no":
                break;
        }

        System.out.println("Remove a product?(yes or no): ");
        String symbol2 = new Scanner(System.in).nextLine();
        switch(symbol2) {
            case "yes":
            //Remove a product with the method removeProduct from the class Store
            System.out.println("Enter the name of the product to remove: ");
            String productToRemove = new Scanner(System.in).nextLine();
            store.removeProduct(productToRemove);
                //View the list of products with the method viewList from the class Store
                store.viewList();
            break;

            case "no":
                //View the list of products with the method viewList from the class Store
                store.viewList();
                break;
        }


        System.out.println("Remove packages amount for a product(yes or no): ");
        String symbol3 = new Scanner(System.in).nextLine();
        switch(symbol3) {
            case "yes":
                System.out.println("Enter the name of the package to remove: ");
                String productToUpdate = new Scanner(System.in).nextLine();

                System.out.println("Enter the new quantity of packages: ");
                double numberPackages = new Scanner(System.in).nextDouble();

                store.updatePackageProduct(productToUpdate, numberPackages);
                store.viewList();
                break;

            case "no":
                break;

        }
    }
}