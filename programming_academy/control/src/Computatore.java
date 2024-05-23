import java.util.Random;
import java.util.Scanner;

public class Computatore {
   private Scanner scanner;
   public Computatore() {
      this.scanner =  new Scanner(System.in);
   }
   public int LeggiIntero() {
    System.out.println("Inserire Numero: ");
    return scanner.nextInt();
   }
   public void PariDispari() {
       do {
           int numero = LeggiIntero();
           if (numero % 2 == 0) {
               System.out.println("Numero Pari");
           } else {
               System.out.println("Numero Dispari");
           }
           System.out.println("Continua Inserimento Numeri(si-no): ");
       } while (scanner.next().equalsIgnoreCase("si"));
   }
   public void MaggioreMinore() {
       do{
           int numero1 = LeggiIntero();
           int numero2 = LeggiIntero();
           if(numero1 == numero2) {
               System.out.println("Numeri Uguali");
           } else if(numero1 > numero2) {
               System.out.println(+numero1+ " > " +numero2);
           } else {
               System.out.println(+numero2+ " > " +numero1);
           }
           System.out.println("Continua Inserimento(si-no): ");
       } while(scanner.next().equalsIgnoreCase("s"));
   }
   public void ContaNumeriVerticale(int l) {   //stampa valori in verticale fino a un valore limite da input
    for(int i = 0; i <= l; i++) {
        System.out.println(i);
    }
   }
   public void ContaNumeriOrizzontale(int l) {   //stampa valori in orizzontale fino a un valore limite inserito da input
       for(int i = 0; i <= l; i++) {
           System.out.print(i);
           if(i < l) {
               System.out.print(",");
           }
           if(i == l) {
               System.out.print(".");
           }
       }
       System.out.println();
   }
   public String LeggiStringa() {
       System.out.println("Inserire Stringa: ");
       return scanner.nextLine();
   }
   public void Semaforo() {
       String stringa = LeggiStringa();
       switch(stringa.toLowerCase()) {
           case "rosso":
               System.out.println("ALT");
               break;
           case "verde":
               System.out.println("VAI");
               break;
           case "arancione":
               System.out.println("ATTENZIONE");
               break;
           default:
               System.out.println("NON SEI AL SEMAFORO");
               break;
       }
   }
   public void Totalizzatore() {   //continua a inserire valori fintanto che viene inserito si, altrimenti termina l'inserimento e stampa totale valori inseriti e la media dei vlori inseriti
       int totale = 0;
       int contatore = 0;
       String inserimento;
       do{
           int numero = LeggiIntero();
           totale += numero;
           contatore++;
           scanner.nextLine();
           System.out.println("Continuare Inserimento(si-no): ");
           inserimento = scanner.nextLine();
       } while(inserimento.equalsIgnoreCase("si"));
       System.out.println("Totale: " +totale);
       System.out.println("Media: " +((double) totale / contatore));
   }
   public void StampaVettore() {   //crea un vettore di interi casuali tra 0 e 100 e visualizza in riga oppure in colonna
       int[] vettore = new int[10];
       Random rand = new Random();
       for(int i = 0; i < vettore.length; i++) {
           vettore[i] = rand.nextInt(100);
       }
       System.out.println("Visualizzare in Riga o in Colonna(r-c): ");
       char scelta = scanner.next().charAt(0);
       if(scelta == 'r' || scelta == 'R') {
           for(int i : vettore) {
               System.out.print(i+ " ");
           }
           System.out.println();
       } else if(scelta == 'c' || scelta == 'C') {
           for(int i : vettore) {
               System.out.println(i);
           }
       }
   }
   public String[] CreaVettoreNomi(String[] array) {   //questo metodo crea il vettore nominativi scegliendo in modo casuale tramite la funzione rand i nomi da un vettore array che viene istanziato nella classe main
       String[] nominativi = new String[10];  //vettore nominativi
       Random rand = new Random();
       for(int i = 0; i < nominativi.length; i++) {
           nominativi[i] = array[rand.nextInt(array.length)];   //assegna all'indice i il nome trovato nel vettore array
       }
       for(int i = 0; i < nominativi.length; i++) {  //stampa verticalmente i nomi memorizzati nel vettore creato precedentemente e il progressivo
           System.out.println((i + 1) + ". " + nominativi[i]);
       }
       return nominativi;
   }
    public String[] OrdinaVettoreNomi(String[] array) {  //Crea vettore nomi e ordina con algoritmo bubble sort
       String[] nominativi = CreaVettoreNomi(array);
       for(int i = 0; i < nominativi.length; i++) {
           for(int j = 0; j < nominativi.length - 1; j++) {
               if(nominativi[j].compareTo(nominativi[j + 1]) > 0) {  //confronta stringa in posizione [j] con la stringa in posizione [j+1]: il confronto restituisce un intero < 0 se la stringa in posizione [j] precede la stringa in posizione [j+1] in termini di caratteri Unicode, 0 se i caratteri sono in posizioni Unicode uguali e un untero > se la stringa in posizione [j] segue la stringa in posizione [j+1]
                   //sposta a sinistra la stringa con caratteri Unicode inferiori
                   String temp = nominativi[j];
                   nominativi[j] = nominativi[j + 1];
                   nominativi[j + 1] = temp;
               }
           }
       }
       for(int i = 0; i < nominativi.length; i++) {  //stampa il vettore di stringhe ordinato
           System.out.println((i + 1) + ". " + nominativi[i]);
       }
       return nominativi;
    }
    public void cercaNome(String[] array) {   //crea un vettore di nomi con il metodo CreaVettoreNomi(inserisce dei nomi casuali memorizzati in un array creato nella classe main) e cerca un nome inserito con la relativa posizione
       String[] nominativi = CreaVettoreNomi(array);
       System.out.println();
       System.out.println("Inserire Nome: ");
       String nome = scanner.nextLine();
       boolean nomeTrovato = false;
       for(int i = 0; i < nominativi.length; i++) {
           if(nome.equalsIgnoreCase(nominativi[i])) {
               System.out.println("Il nome " + nome + " è stato trovato in posizione " + (i + 1));
               nomeTrovato = true;
           }
       }
        if (!nomeTrovato) { // Se il flag è ancora false, il nome non è stato trovato
            System.out.println("Il nome " + nome + " non è stato trovato");
        }
    }
    public void stampaTabellina(int numero) {   //metodo generico per stampare le tabelline, inserendo nel metodo main il parametro 10 viene stampata la tabellina del 10
       for(int i = 1; i < 10; i++) {
           System.out.println(numero+ "*" +i+ "=" +numero * i);
       }
    }
    public double[][] Meteo() {
       int giorni = 7;
       int rilevazioniGiornaliere = 4;  //1 rilevazione ogni 6 ore
        double[][] temperatureSettimana = new double[giorni][rilevazioniGiornaliere];
        Random rand = new Random();
        for(int i = 0; i < temperatureSettimana.length; i++) {
            for(int j = 0; j < temperatureSettimana[i].length; j++) {
                temperatureSettimana[i][j] = rand.nextInt(100);  //inserisci temperature casuali tra 0 e 20
            }
        }
        return temperatureSettimana;
   }
}
