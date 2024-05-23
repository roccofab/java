public class Sim extends Call {
   private double importo;
   private Call[] TelefonateFatte;
   private Call[] TelefonateRicevute;
    public Sim(int numero, double durata, double costo, double importo) {
        super(numero, durata, costo);
        this.importo = importo;
        this.TelefonateFatte = new Call[10];
        this.TelefonateRicevute = new Call[10];
    }
    public void AggiungiTelefonataFatta(Call call) {
        for(int i = 0; i < TelefonateFatte.length; i++) {
            if(TelefonateFatte.length < 10) {
                TelefonateFatte[i] = call;
            }
        }
    }
    public void AggiungiTelefonataRicevuta(Call call) {
        for(int i = 0; i < TelefonateRicevute.length; i++) {
            if(TelefonateRicevute.length < 10) {
                TelefonateRicevute[i] = call;
            }
        }
    }
    public double getCostoTotaleChiamate() {
        double CostoTotale = 0.0;
        for(Call call : TelefonateFatte) {
            if(call != null) {
                CostoTotale += call.costo;
            }
        }
        for(Call call : TelefonateRicevute) {
            if(call != null) {
                CostoTotale += call.costo;
            }
        }
        return CostoTotale;
    }
    public double getDurataTotaleChiamate() {
        double DurataTotale = 0.0;
        for(Call call : TelefonateFatte) {
            if(call != null) {
                DurataTotale += call.durata;
            }
        }
        for(Call call : TelefonateRicevute) {
            if(call != null) {
                DurataTotale += call.durata;
            }
        }
        return DurataTotale;
    }
}
