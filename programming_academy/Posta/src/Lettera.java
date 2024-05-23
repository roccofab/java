public class Lettera {
    public Persona mittente;
    public Persona destinatario;
    public Data dataSpedizione;

    public Lettera(Persona mittente, Persona destinatario, Data dataSpedizione) {
        this.mittente = mittente;
        this.destinatario = destinatario;
        this.dataSpedizione = dataSpedizione;
    }
    public Persona getMittente() {
        return mittente;
    }
    public Persona getDestinatario() {
        return destinatario;
    }
    public Data getDataSpedizione() {
        return dataSpedizione;
    }
}
