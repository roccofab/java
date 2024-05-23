import java.util.ArrayList;
// creazione di ArrayList di studenti, corsi e docenti: non utilizzo gli array perchè la grandezza non è specificata
public class Università {
    private String nome;
    private String città;
    private String indirizzo;
    private ArrayList<Studente> studenti;
    private ArrayList<Corso> corsi;
    private ArrayList<Docente> docenti;

    public Università(String nome, String città, String indirizzo) {
        this.nome = nome;
        this.città = città;
        this.indirizzo = indirizzo;
        this.studenti = new ArrayList<>();
        this.corsi = new ArrayList<>();
        this.docenti = new ArrayList<>();
    }
    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }
    public void aggiungiCorso(Corso corso) {
        corsi.add(corso);
    }
    public void aggiungiDocente(Docente docente) {
        docenti.add(docente);
    }
    public void aggiungiFrequenzaCorso(Corso corso, Studente studente) {
        studente.aggiungiCorso(corso);
    }
}
