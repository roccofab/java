import java.util.ArrayList;
import java.util.Iterator;

public class GestoreSquadre {
    private ArrayList<Squadra> squadre;
    public GestoreSquadre() {
        squadre = new ArrayList<>();  //lista vuota
    }
    public void InserimentoSquadra(String nome, String sedePartita, String nomeStadio, int spettatori) {
        Squadra squadra = new Squadra(nome, sedePartita, nomeStadio, spettatori);  //crea nuovo oggetto squadra
        if(squadre.contains(squadra)) {  // se la squadra creata è già presente nella lista di squadre: lancia nuova eccezione
            throw new IllegalArgumentException("Squadra già presente");
        }
        squadre.add(squadra);
    }
    public void cancellaSquadra(String nome) {
        Iterator<Squadra> it = squadre.iterator();  //iteratore per scorrere la lista di squadre: se il nome viene trovato la squadra viene rimossa altrimenti lancia una eccezione
        while(it.hasNext()) {
            Squadra squadra = it.next();
            if(squadra.getNome().equalsIgnoreCase(nome)) {
                it.remove();
                return; //squadra rimossa
            }
        }
        throw new IllegalArgumentException("Squadra non trovata");
    }
    public Squadra cercaNomeEsattoSquadra(String nome) {
        Iterator<Squadra> it = squadre.iterator();  //iteratore per scorrere la lista di squadre: se il nome viene trovato la squadra viene rimossa altrimenti restituisce null
        while(it.hasNext()) {
            Squadra squadra = it.next();
            if(squadra.getNome().equalsIgnoreCase(nome)) {
                return squadra;
            }
        }
        return null;
    }
    public Squadra cercaNomeParzialeSquadra(String nome) {
        Iterator<Squadra> it = squadre.iterator();  // iteratore per scorrere la lista di squadre: se il nome della squadra inizia con il parametro nome, allora viene restituita la corrispondente squadra, altrimenti restituisce null
        while(it.hasNext()) {
            Squadra squadra = it.next();
            if(squadra.getNome().startsWith(nome)) {
                return squadra;
            }
        }
        return null;
    }
    public void StampaSquadre() {
        Iterator<Squadra> it = squadre.iterator();  //stampa tutte le squadre nella lista di squadre tramite Iteratore
        while(it.hasNext()) {
            Squadra squadra = it.next();
            System.out.println(squadra);
        }
    }
}
