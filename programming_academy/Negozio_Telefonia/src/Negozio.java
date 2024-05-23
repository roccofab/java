public class Negozio {
    Smartphone[] phones;

    public Negozio(Smartphone[] phones) {
        this.phones = phones;
    }
    public double Media(String m) {
        double prezzi = 0;
        int contatore = 0;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getMarca().equals(m)) {
                prezzi += phones[i].getPrezzo();
                contatore++;
            }
        }
        if(contatore == 0) {
            return 0;
        }
        return prezzi / contatore;
    }
    public String[] Trova(String m){
        double prezzoMedio = Media(m);
        int contatore = 0;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getMarca().equals(m) && phones[i].getPrezzo() < prezzoMedio) {
                contatore++;
            }
        }
        String[] TelefoniTrovati = new String[contatore];
        int i = 0;
        for(Smartphone phone : phones) {
            if(phone.getMarca().equals(m) && phone.getPrezzo() < prezzoMedio) {
                i++;
                TelefoniTrovati[i] = phone.getModello();
            }
        }
        return TelefoniTrovati;
    }
}
