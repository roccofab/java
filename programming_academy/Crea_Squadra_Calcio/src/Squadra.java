import java.lang.Exception;

public class Squadra {
    private String nome;
    private String sedePartita;
    private String nomeStadio;
    private int spettatori;

    public Squadra(String nome, String sedePartita, String nomeStadio, int spettatori) {
        this.nome = nome;
        this.sedePartita = sedePartita;
        this.nomeStadio = nomeStadio;
        this.spettatori = spettatori;
    }

    public void setNome(String nome) {
        if (nome.isEmpty() || nome == null) {
            throw new IllegalArgumentException("Inserire un Nome");
        } else if (nome.length() > 70) {
            throw new IllegalArgumentException("Il nome non può superare i 70 caratteri");
        }
            this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSedePartita(String nome) {
        if (nome.isEmpty() || nome == null) {
            throw new IllegalArgumentException("Inserire un Nome");
        } else if (nome.length() > 30) {
            throw new IllegalArgumentException("Il nome non può superare i 30 caratteri");
        }
        this.sedePartita = nome;
    }
    public String getSedePartita() {
        return sedePartita;
    }
    public void setNomeStadio(String nome) {
        if (nome.isEmpty() || nome == null) {
            throw new IllegalArgumentException("Inserire un Nome");
        } else if (nome.contains("'")) {
            throw new IllegalArgumentException("Il nome non può superare i 30 caratteri");
        }
        this.nomeStadio = nome;
    }
    public String getNomeStadio() {
        return nomeStadio;
    }
    public void setNumeroSpettatori(int numero) {
        if (numero < 5000 && numero > 50000) {
            throw new IllegalArgumentException("Numero Spettatori Non Valido");
        }
        this.spettatori = numero;
    }
    public int getNumeroSpettatori() {
        return spettatori;
    }
    @Override
    public String toString() {
        return "Squadra: " + nome + ", Sede: " + sedePartita + ", Stadio: " + nomeStadio + ", Spettatori: " + spettatori;
    }
}

