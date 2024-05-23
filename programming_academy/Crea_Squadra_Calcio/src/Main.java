import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestoreSquadre gestore = new GestoreSquadre();
        int opzione;
        do {
            System.out.println("Seleziona Opzione:");
            System.out.println("1. Inserisci Nuova Squadra(premi 1): ");
            System.out.println("2. Cancella Squadra(premi 2): ");
            System.out.println("3. Cerca Squadra per Nome Esatto(premi 3): ");
            System.out.println("4. Cerca Squadra per Nome Parziale(premi 4): ");
            System.out.println("5. Visualizza Elenco Squadre(premi 5): ");
            System.out.println("0. Uscire: ");
            opzione = scanner.nextInt();
            scanner.nextLine();
            switch(opzione) {
                case 1:
                    System.out.println("Inserire Nome Squadra: ");
                    String nomeSquadra = scanner.nextLine();
                    System.out.println("Inserire Sede Partita: ");
                    String sedePartita = scanner.nextLine();
                    System.out.println("Inserire nome Stadio: ");
                    String nomeStadio = scanner.nextLine();
                    System.out.println("Inserire Numero Spettatori(5000-50000): ");
                    int numeroSpettatori = scanner.nextInt();
                    try {
                        gestore.InserimentoSquadra(nomeSquadra, sedePartita, nomeStadio, numeroSpettatori);
                    }  catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Inserire Nome Squadra da Cancellare: ");
                    String nome = scanner.nextLine();
                    try {
                        gestore.cancellaSquadra(nome);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Inserire Nome Esatto Squadra da cercare: ");
                    String nomeEsatto = scanner.nextLine();
                    Squadra squadra = gestore.cercaNomeEsattoSquadra(nomeEsatto);
                    if(squadra != null) {
                        System.out.println(squadra.toString());
                    } else{
                        System.out.println("Squadra non trovata");
                    }
                    break;

                case 4 :
                    System.out.println("Inserire Nome Parziale Squadra da Cercare: ");
                    String nomeParziale = scanner.nextLine();
                    squadra = gestore.cercaNomeParzialeSquadra(nomeParziale);
                    if(squadra != null) {
                        System.out.println(squadra.toString());
                    } else {
                        System.out.println("Squadra non trovata");
                    }
                    break;

                case 5:
                    gestore.StampaSquadre();
                    break;

                case 0:
                    break;
            }
        } while(opzione != 0);
    }
}