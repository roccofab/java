public class Vettura {
    private String targa;
    private short oraArrivo;
    private short oraScadenza;

    public Vettura(String targa, short oraArrivo, short oraScadenza) {
        this.targa = targa;
        this.oraArrivo = oraArrivo;
        this.oraScadenza = oraScadenza;
    }
    public String getTarga() {
        return targa;
    }
    public short getOraArrivo() {
        return oraArrivo;
    }
    public short getOraScadenza() {
        return oraScadenza;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public void setOraArrivo(short oraArrivo) {
        if(oraArrivo >= 0 && oraArrivo <= 23 ) {
            this.oraArrivo = oraArrivo;
        } else {
            System.out.println("L'orario di arrivo deve essere compresa tra 0 e 23");
        }
    }
    public void setOraScadenza(short oraScadenza) {
        if(oraScadenza >= 0 && oraScadenza <= 23 ) {
            this.oraScadenza = oraScadenza;
        } else {
            System.out.println("L'orario di scadenza deve essere compresa tra 0 e 23");
        }
    }
}
