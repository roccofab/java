class Instrument {
    private String InstrumentName;
    private String brand;
    private double price;
    private int quantityInStock;

    public Instrument(String InstrumentName, String brand, double price, int quantityInStock) {
        this.InstrumentName = InstrumentName;
        this.brand = brand;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getInstrumentName() {
        return InstrumentName;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setInstrumentName(String InstrumentName) {
        this.InstrumentName = InstrumentName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    public void decrementQuantity() {
        if (quantityInStock > 0) {
            quantityInStock--;
        }
    }
}
