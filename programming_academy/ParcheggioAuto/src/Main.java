//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void stampaVetture(Parcheggio parcheggio) {   // nuovo metodo stampa vettura per verificare il corretto funzionamento del parcheggio
        System.out.println("Vetture nel parcheggio:");
        for (int i = 0; i < parcheggio.getNumVetture(); i++) {
            Vettura vettura = parcheggio.getVetture()[i];
            if (vettura != null) {
                System.out.println("Targa: " + vettura.getTarga() +
                        ", Ora Arrivo: " + vettura.getOraArrivo() +
                        ", Ora Scadenza: " + vettura.getOraScadenza());
            }
        }
    }
    public static void main(String[] args) {
        Parcheggio parcheggio = new Parcheggio(5);
        Vettura vettura = new Vettura("AB75VYC", (short)12, (short)20);
        Vettura vettura2 = new Vettura("AD65VKC", (short)11, (short)20);
        Vettura vettura3 = new Vettura("AB76VFD", (short)6, (short)11);
        Vettura vettura4 = new Vettura("AC54VBJ", (short)6, (short)11);
        parcheggio.ParcheggiaVettura(vettura);
        parcheggio.ParcheggiaVettura(vettura2);
        parcheggio.ParcheggiaVettura(vettura3);
        parcheggio.ParcheggiaVettura(vettura4);
        parcheggio.promozione("VKC", (short)2);
        System.out.println(parcheggio.getOrarioCorrente());
        parcheggio.getMaxOre();
        parcheggio.OrarioScaduto();   // uscita dal parcheggio vettura 3 e vettura 4
        stampaVetture(parcheggio);
    }
}