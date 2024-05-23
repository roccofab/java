import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Computatore comp = new Computatore();
        int choice;
        do {
            System.out.println("1. Leggi Intero(1): ");
            System.out.println("2. Pari o Dispari(2): ");
            System.out.println("3. Maggiore o Minore(3): ");
            System.out.println("4. Stampa Numeri in Verticale(4): ");
            System.out.println("5. Stampa Numeri in Orizzontale(5): ");
            System.out.println("6. Leggi Stringa(6): ");
            System.out.println("7. Semaforo(7): ");
            System.out.println("8. Calcola Somma e Media(8): ");
            System.out.println("9. Stampa Vettore di Interi(9): ");
            System.out.println("10. Stampa Vettore di Stringhe con Indice(10):  ");
            System.out.println("11. Ordina Vettore di Stringhe(11): ");
            System.out.println("12. Cerca Nomi in Vettore di Stringhe(12): ");
            System.out.println("13. Stampa Tabelline(13): ");
            System.out.println("14. Meteo Settimanale(14): ");
            System.out.println("0. Esci(0): ");
            choice = scan.nextInt();

            switch(choice) {
                case 1:
                    comp.LeggiIntero();
                    break;

                case 2:
                    comp.PariDispari();
                    break;

                case 3:
                    comp.MaggioreMinore();
                    break;

                case 4:
                    System.out.println("Inserire Valore Limite(numero intero): ");
                    int l = scan.nextInt();
                    comp.ContaNumeriVerticale(l);
                    break;

                case 5:
                    System.out.println("Inserire Valore Limite(numero intero): ");
                    int lim = scan.nextInt();
                    comp.ContaNumeriOrizzontale(lim);
                    break;

                case 6:
                    comp.LeggiStringa();
                    break;

                case 7:
                    comp.Semaforo();
                    break;

                case 8:
                    comp.Totalizzatore();
                    break;

                case 9:
                    comp.StampaVettore();
                    break;

                case 10:
                    String[] nomi = {"Marco", "Lorenzo", "Carlo", "Patrizio", "Sara", "Maria", "Laura", "Nicola", "Orazio", "Osvaldo", "Yuri", "Gianni", "Elisa"};
                    comp.CreaVettoreNomi(nomi);
                    System.out.println();
                    break;

                case 11:
                    String[] nomi2 = {"Marco", "Lorenzo", "Carlo", "Patrizio", "Sara", "Maria", "Laura", "Nicola", "Orazio", "Osvaldo", "Yuri", "Gianni", "Elisa"};
                    comp.OrdinaVettoreNomi(nomi2);
                    break;

                case 12:
                    String[] nomi3 = {"Marco", "Lorenzo", "Carlo", "Patrizio", "Sara", "Maria", "Laura", "Nicola", "Orazio", "Osvaldo", "Yuri", "Gianni", "Elisa"};
                    comp.cercaNome(nomi3);
                    break;

                case 13:
                    int num = 10;
                    comp.stampaTabellina(num);
                    break;

                case 14:
                    double[][] temperature = comp.Meteo();
                    for(int j = 0; j < temperature.length; j++) {
                        for(int s = 0; s < temperature[j].length; s++) {
                            System.out.println(temperature[j][s]);
                        }
                        System.out.println();
                    }
            }
        } while(choice != 0);
    }
}