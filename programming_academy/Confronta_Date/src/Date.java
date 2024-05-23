
public class Date {
    private int giorno;
    private int mese;
    private int anno;

    public Date(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }
    public boolean confrontaDate(Date nuovaData) {
        if(this.giorno == nuovaData.giorno && this.mese == nuovaData.mese && this.anno == nuovaData.anno) {
            return true;
        }
        return false;
    }
    public String toString() {
        return this.giorno + "/" + this.mese + "/" + this.anno;
    }
}
