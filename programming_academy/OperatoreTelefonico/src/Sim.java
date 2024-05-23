import java.util.ArrayList;

public class Sim {
    private String numero;
    private double credito;
    private ArrayList<Chiamata> chiamate;

    public Sim(String numero, double credito) {
        this.numero = numero;
        this.credito = credito;
        this.chiamate = new ArrayList<>();
    }
    public void InserisciChiamata(Chiamata chiamata) {
        chiamate.add(chiamata);
    }
    public int minutiTotali() {
        int totale = 0;
        for (Chiamata chiamata : chiamate) {
            totale += chiamata.getDurata();
        }
        return totale;
    }
    public int ChiamateVerso(String numero) {
        int contatore = 0;
        for(Chiamata chiamata : chiamate) {
            if(chiamata.getNumero().equals(numero)) {
                contatore++;
            }
        }
        return contatore;
    }
    public void StampaDati() {
        System.out.println("Numero: " + numero);
        System.out.println("Credito: " + credito);
        System.out.println("Minuti totali: " + minutiTotali());
        for(Chiamata chiamata : chiamate) {
            System.out.println(chiamata);
        }
    }
}
