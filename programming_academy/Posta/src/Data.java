public class Data implements toString {
    public int giorno;
    public int mese;
    public int anno;

    public Data(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    @Override
    public String toString() {
        return giorno + "/" + mese + "/" + anno;
    }
}
