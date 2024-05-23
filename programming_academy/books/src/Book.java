public class Book {
    String titolo;
    String autore;
    double prezzo;
    public Book(String titolo, String autore, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }
    public String getTitolo() {
        return titolo;
    }
    public String getAutore() {
        return autore;
    }
    public double getPrezzo() {
        return prezzo;
    }
}
