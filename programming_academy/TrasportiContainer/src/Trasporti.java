import java.util.ArrayList;

public class Trasporti {
    private Container[] container; // array di container

    private int n_cont; // numero di container presenti

    private ArrayList<Destinazione> destinazioni;  // lista di destinazioni

    public Trasporti(int max) {
        container = new Container[max];
        n_cont = 0;
        destinazioni = new ArrayList<Destinazione>();
    }

    public Trasporti(Trasporti t) {  //costruttore per creare una copia dell'oggetto esistente Trasporti
        this.container = new Container[t.container.length];
        for (int i = 0; i < t.container.length; i++) {
            this.container[i] = t.container[i];  // copia i riferimenti ai container contenuti in t.container
        }
        this.n_cont = t.n_cont;  //copia del numero di container esistenti da t
        this.destinazioni = new ArrayList<Destinazione>(t.destinazioni);  // copia delle destinazioni da t
    }

    public boolean findCont(int p, String d) {
        for (int i = 0; i < n_cont; i++) {  // itera attraverso la lista di container
            if (container[i].getPeso() == p && container[i].getDest().equals(d)) {
                return true;
            }
        }
        return false;
    }

    public boolean findDest(String d) {
        for (Destinazione dest : destinazioni) {  //itera attraverso la lista di destinazioni
            if (dest.getDestinazione().equals(d)) {
                return true;
            }
        }
        return false;
    }

    public void addCont(int p, String d) {
        if (!findCont(p, d)) {  // aggiungi un nuovo container solo se non è già esistente
            container[n_cont] = new Container(p, new Destinazione(d));
            addDest(d);
            n_cont++;
        }
    }

    public void addDest(String d) {   // aggiungi una nuova destinazione solo se non è già esistente
        if (!findDest(d)) {
            destinazioni.add(new Destinazione(d));
        }
    }

    public void cancCont(int p, String d) {
        for (int i = 0; i < n_cont; i++) {  // itera attraverso l'array di container
            if (container[i].getPeso() == p && container[i].getDest().getDestinazione().equals(d)) { // se il container viene trovato(peso = p e destinazione = d):
                container[i] = container[n_cont - 1];   //sposta il container trovato nell'ultima posizione
                container[n_cont - 1] = null;   //imposta il container nell'ultima posizione con il valore null
                n_cont--;  // decrementa di una unità l'array di container
            }
        }
    }

    public void cancDest(String d) {  //Crea una ArrayList di container contenente solo i container con destinazione diversa dal parametro d e dopo converte la ArrayList in array
        ArrayList<Container> temp = new ArrayList<>();  // numero di container non noto: una ArrayList non richiede una dimensione fissa
        for (int i = 0; i < n_cont; i++) {  // itera attraverso l'array di container
            if (!container[i].getDest().getDestinazione().equals(d)) {  //aggiungi alla ArrayList tutti i container che non hanno  destinazione uguale al parametro d
                temp.add(container[i]);
            }
        }
        container = temp.toArray(new Container[temp.size()]);  // converte la ArrayList in array
        n_cont = temp.size();  //imposta il numero di container uguale al numero di container presenti nella ArrayList
        destinazioni.remove(d);  // rimuove la destinazione d dalla lista di destinazioni
    }
    public int max() {
        int maxPeso = -1;
        for(Destinazione dest : destinazioni) {
            int pesoTotale = 0;  // variabile per calcolare il pesoTotale per ogni destinazione: ogni iterazione che corrisponde a una nuova destinazione parte da 0
            for(int i = 0; i < n_cont; i++) {
                if(container[i].getDest().getDestinazione().equals(dest.getDestinazione())) {
                    pesoTotale += container[i].getPeso();
                }
            }
            if(pesoTotale > maxPeso) {
                maxPeso = pesoTotale;
            }
        }
        return maxPeso;
    }
}
