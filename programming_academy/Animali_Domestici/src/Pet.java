public class Pet {
    private String nome;
    private String animale;
    private int età;

    public Pet(String nome, String tipo, int età) {
        this.nome = nome;
        this.animale = animale;
        this.età = età;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setAnimale(String animale) {
        this.animale = animale;
    }
    public String getAnimale() {
        return animale;
    }
    public void setEtà(int età) {
        this.età = età;
    }
    public int getEtà() {
        return età;
    }
}
