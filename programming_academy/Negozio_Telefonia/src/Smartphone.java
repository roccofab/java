public class Smartphone {
    private int codice;
    private String modello;
    private String marca;
    private int prezzo;

    public Smartphone(int codice, String modello, String marca, int prezzo) {
        this.codice = codice;
        this.modello = modello;
        this.marca = marca;
        this.prezzo = prezzo;
    }

    public int getCodice() {
        return codice;
    }

    public String getModello() {
        return modello;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrezzo() {
        return prezzo;
    }
}
