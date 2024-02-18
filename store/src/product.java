public class product implements toStringInterface {
    private String name;
    private double price;
    private double amount;
    private double weight;

    public product(String name, double price, double amount, double weight){  //constructor method of the class product
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.weight = weight;
    }


    public String getName() {

        return name;
    }
    public double getPrice() {

        return price;
    }

    private double getAmount() {

        return amount;
    }
    private double getWeight() {

        return weight;

    }
    public void setName(String name) {

        this.name = name;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public void setAmount(double amount){

        this.amount = amount;
    }

    public void setWeight(double weight) {

        this.weight = weight;

    }

    @Override
    public String toString() {
        return "Product:\n" +
                "Name: " + name + "\n" +
                "Price: " + price + "€\n" +
                "Amount of package: " + amount+ "\n" +
                "Weight per package: " + weight + "kg\n";
    }

}


