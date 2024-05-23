public class OggettoEsposto {
    String tipo;
    String autore;
    String epoca;

    public OggettoEsposto(String tipo, String autore, String epoca) {
        this.tipo = tipo;
        this.autore = autore;
        this.epoca = epoca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getAutore() {
        return autore;
    }

    public String getEpoca() {
        return epoca;
    }
}
