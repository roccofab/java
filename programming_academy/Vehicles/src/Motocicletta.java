public class Motocicletta extends Veicolo {
    private String Marca;
    private String Modello;
    private String colore;
    private String cilindrata;

    public Motocicletta(String Marca, String Modello, String colore, String cilindrata) {
        this.Marca = Marca;
        this.Modello = Modello;
        this.colore = colore;
        this.cilindrata = cilindrata;
    }
    public void setMarca(String marca) {
        this.Marca = marca;
    }
    public void setModello(String modello) {
        this.Modello = modello;
    }
    public void setColore(String colore) {
        this.colore = colore;
    }
    public void setCilindrata(String cilindrata) {
        this.cilindrata = cilindrata;
    }
    @Override
    public void mostraTipo() {
      System.out.println("Veicolo a 2 ruote");
    }

    @Override
    public void mostraMarca() {
      System.out.println(" - Marca: " +Marca);
    }

    @Override
    public void mostraModello() {
      System.out.println(" - Modello: " +Modello);
    }

    @Override
    public void mostraColore() {
        System.out.println(" - Colore:" +colore);
    }

    @Override
    public void mostraCilindrata() {
        System.out.println(" - Cilindrata:" +cilindrata);
    }
}
