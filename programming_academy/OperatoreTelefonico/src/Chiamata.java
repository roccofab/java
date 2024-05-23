public class Chiamata {
    private String numeroDestinatario;
    private int durata;

    public Chiamata(String numeroDestinatario, int durata) {
        this.numeroDestinatario = numeroDestinatario;
        this.durata = durata;
    }
    public String getNumero() {
        return numeroDestinatario;
    }
    public int getDurata() {
        return durata;
    }
}
