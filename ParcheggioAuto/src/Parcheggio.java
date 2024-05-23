import java.time.LocalTime;
import java.util.ArrayList;

public class Parcheggio {
    private int numPosti;
    private Vettura[] vetture;
    private int numVetture;

    public Parcheggio(int numPosti) {
        this.numPosti = numPosti;
        this.vetture = new Vettura[numPosti];
        numVetture = 0;
    }
    public boolean ParcheggiaVettura(Vettura vettura) { // assegna la nuova vettura al primo posto disponibile nell'array di oggetti vetture
        if (numVetture < numPosti) {
            vetture[numVetture] = vettura;
            numVetture++;
            return true;
        }
        return false;
    }
    public boolean UscitaVettura(Vettura vettura) {  // se la vettura viene trovata: viene assegnato null all'indice corrispondente e decrementa di 1 l'array di oggetti vetture
        for (int i = 0; i < vetture.length; i++) {
            if (vetture[i] != null && vetture[i].equals(vettura)) {
                vetture[i] = null;
                numVetture--;
                return true;
            }
        }
        return false;
    }
    public void spostaVettura(int posIniziale, int posFinale) {  // metodo per cambiare la posizione di una vettura all'interno dell'array vetture
        for(int i = posIniziale; i < posFinale; i++) {
            vetture[i] = vetture[i + 1];
        }
    }
    public LocalTime getOrarioCorrente() {  //ottieni l'orario corrente tramite l'oggetto LocalTime della classe java.time
        return LocalTime.now();
    }
    public void OrarioScaduto() {
        LocalTime now = LocalTime.now();
        LocalTime newTime = now.plusHours(1);  // Incrementa l'orario corrente di un'ora
        for(int i = 0; i < numVetture; i++) {
            if(vetture[i].getOraScadenza() <= newTime.getHour()) {  // Confronta l'ora di scadenza con l'ora corrente aggiornata: se è uguale allora utilizza il metodo spostaVettura
                vetture[i] = null;
                UscitaVettura(vetture[i]);
                numVetture--;
            }
        }
    }
    public void promozione(String codice, short oreGratuite) {  //se il valore della stringa targa di vettura[i] termina con codice: aggiungi oreGratuite all'orario di scadenza
        for(int i = 0; i < numVetture; i++) {
            if(String.valueOf(vetture[i].getTarga()).endsWith(codice)) {
                vetture[i].setOraScadenza((short)(vetture[i].getOraScadenza() + oreGratuite));
            }
        }
    }
    public ArrayList<Vettura> getMaxOre() {
        ArrayList<Vettura> maxOre = new ArrayList<Vettura>();
        int max = 0;  // variabile per tenere traccia del massimo numero di ore pagate
        for(int i = 0; i < numVetture; i++) {
            if(vetture[i].getOraScadenza() > max) {  // confronta il valore dell'orario di scadenza vettura[i] con la variabile max: se è maggiore di max, aggiorna max con il valore Orario Scadenza
                max = vetture[i].getOraScadenza();
            }
            if(vetture[i].getOraScadenza() == max) {  // la vettura ha lo stesso numero di ore pagate del massimo identificato e quindi viene aggiunta alla ArrayList
                maxOre.add(vetture[i]);
            }
        }
        return maxOre;
    }

    public int getNumVetture() {
        return numVetture;
    }

    public Vettura[] getVetture() {
        return vetture;
    }
}
