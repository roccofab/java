public class Docente {
    String nome;
    String cognome;
    String codice;
    int età;
    public Docente(String nome, String cognome, String codice) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getCodice() {
        return codice;
    }
    public int getEtà() {
        return età;
    }
}
