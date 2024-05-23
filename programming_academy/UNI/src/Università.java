import java.util.ArrayList;

public class Università {
    Docente[] docenti;

    public Università(Docente[] docenti) {
        this.docenti = docenti;
    }
    public int getEtàMinima() {
        int minEtà = Integer.MAX_VALUE;
        for(Docente d : docenti) {
            if(d.getEtà() < minEtà) {
                minEtà = d.getEtà();
            }
        }
        return minEtà;
    }
    public String[] TrovaGiovani() {
        int minEtà = getEtàMinima();
        ArrayList<String> DocentiGiovani = new ArrayList<String>();
        for(Docente d : docenti) {
            if(d.getEtà() < minEtà) {
                DocentiGiovani.add(d.getNome());
            }
        }
        return DocentiGiovani.toArray(new String[docenti.length]);
    }
}
