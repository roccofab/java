public class Automobile {
    private double consumo;
    private double carburante;

    public Automobile(double consumo, double carburante) {
        this.consumo = consumo;
        this.carburante = 0;
    }
    public void Drive(double distanzaPercorsa) {
        double consumiPercorso = consumo * distanzaPercorsa;
        if(consumiPercorso <= consumo) {
            carburante -= consumiPercorso;
        } else{
            System.out.println("Carburante Esaurito");
        }
    }
    public double dammiCarburante() {
        return carburante;
    }
    public double faiRifornimento(double litri) {
        carburante += litri;
        return carburante;
    }
}
