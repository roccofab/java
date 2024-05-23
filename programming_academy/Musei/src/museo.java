import java.util.ArrayList;

public class museo {
    OggettoEsposto[] o;
    public museo(OggettoEsposto[] o) {
        this.o = o;
    }
    public int TrovaOggettoEsposto(String a) {
        int contatore = 0;
        for(OggettoEsposto esposto : o) {
            if(esposto.getAutore().equalsIgnoreCase(a)) {
                contatore++;
            }
        }
        return contatore;
    }
    public String GeneraCodici(OggettoEsposto o) {  // metodo per estrarre la prima lettera del tipo di oggetto e autore e l'epoca per intero
        return o.getTipo().substring(0, 1) + "-" +o.getAutore().substring(0, 1) + "-" +o.getEpoca();
    }
    public String[] CodiciXVII() {
        ArrayList<String> codici = new ArrayList<>();
        for(OggettoEsposto esposto : o) {
            if(esposto.getTipo().equalsIgnoreCase("dipinto") && esposto.getEpoca().equalsIgnoreCase("XVII")) {
                codici.add(GeneraCodici(esposto));  // se l'oggetto di tipo dipinto e epoca XVII viene trovato: è aggiunto alla lista
            }
        }
        return codici.toArray(new String[0]);  //conversione della lista in array di stringhe
    }
}
