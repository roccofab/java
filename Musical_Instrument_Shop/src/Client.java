class Client {
    private String clientName;
    private int clientID;
    private int quantity_instrument_bought;

    public Client(String clientName, int clientID, int quantity_instrument_bought) {
        this.clientName = clientName;
        this.clientID = clientID;
        this.quantity_instrument_bought = quantity_instrument_bought;
    }

    public String getClientName() {
        return clientName;
    }

    public int getClientID() {
        return clientID;
    }

    public int getQuantity_instrument_bought() {
        return quantity_instrument_bought;
    }
    public int incrementQuantityInstrumentBought() {
        return quantity_instrument_bought++;
    }
}
