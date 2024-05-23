public class Card {
    String valore;
    String seme;
    public Card(String valore, String seme) {
        this.valore = valore;
        this.seme = seme;
    }
    public boolean confronta(String valore, String seme) {
        return this.valore.equals(valore) && this.seme.equals(seme);
    }
}
