public class Container {
    private int peso;
    private Destinazione dest;

    public Container(int peso, Destinazione dest) {
        this.peso = peso;
        this.dest = dest;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public Destinazione getDest() {
        return dest;
    }
    public void setDest(Destinazione dest) {
        this.dest = dest;
    }
}
