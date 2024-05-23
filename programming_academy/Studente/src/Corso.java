public class Corso {
    private Esame[] esami;

    public Corso(Esame[] esami) {
        this.esami = esami;
    }
    public int votoMinimo() {
        int votoMinimo = 100;
        for(Esame esame : esami) {
            if(esame.getVoto() < votoMinimo) {
                votoMinimo = esame.getVoto();
            }
        }
        return votoMinimo;
    }
    public String[] StudentiPeggiori() {
        int votoMinimo = votoMinimo();
        int contatore = 0;
        for(Esame esame : esami) {
            if(esame.getVoto() == votoMinimo) {
                contatore++;
            }
        }
        String[] studentiPeggiori = new String[contatore];
        int i = 0;
        for(Esame esame : esami) {
            if(esame.getVoto() == votoMinimo) {
                studentiPeggiori[i] = esame.getCognome();
                i++;
            }
        }
        return studentiPeggiori;
    }
}
