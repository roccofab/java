import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Auto[] Lista_Auto = new Auto[]{
                new Auto("Fiat", "500", "Bianco", "1.2L"),
                new Auto("Alfa Romeo", "Giulia", "Rosso", "2.0L"),
                new Auto("Fiat", "Punto", "Nero", "1.2L"),
                new Auto("Fiat", "Panda", "Nero", "1.0L"),
                new Auto("Fiat", "Chroma", "Nero", "1.9L"),
        };
        Motocicletta[] Lista_Moto = new Motocicletta[]{
                new Motocicletta("Ducati", "Monster", "Rosso", "821cc"),
                new Motocicletta("Yamaha", "MT-07", "Blu", "689cc"),
                new Motocicletta("Yamaha", "XSR900 GP", "Power Grey", "890cc"),
                new Motocicletta("Yamaha", "2024-MT10", "Tech Black", "890cc"),
        };
        //HashMap composed of Object-Value Pairs: inside the HashMap I've put an integer value representing the price for each car object in the list
        HashMap<Auto, Integer> autoPrezzi = new HashMap<Auto, Integer>();
        autoPrezzi.put(Lista_Auto[0], 7500);
        autoPrezzi.put(Lista_Auto[1], 20000);
        autoPrezzi.put(Lista_Auto[2], 6000);
        autoPrezzi.put(Lista_Auto[3], 10000);
        autoPrezzi.put(Lista_Auto[4], 5000);

        //HashMap composed of Object-Value Pairs: inside the HashMap I've put an integer value representing the price for each moto object in the list'
        HashMap<Motocicletta, Integer> motoPrezzi = new HashMap<Motocicletta, Integer>();
        motoPrezzi.put(Lista_Moto[0], 8500);
        motoPrezzi.put(Lista_Moto[1], 12000);
        motoPrezzi.put(Lista_Moto[2], 15000);
        motoPrezzi.put(Lista_Moto[3], 10000);

       //print the list of auto objects and the price for each object
        System.out.println("Lista Auto:");
        for (int i = 0; i < Lista_Auto.length; i++) {
            System.out.println((i + 1) + ". Veicolo a 4 ruote");
            Lista_Auto[i].mostraMarca();
            Lista_Auto[i].mostraModello();
            Lista_Auto[i].mostraColore();
            Lista_Auto[i].mostraCilindrata();
            System.out.println("Prezzo: " + autoPrezzi.get(Lista_Auto[i]) + "€");
        }

        //print the list of moto objects and the price for each object
        System.out.println("\nLista Motociclette:");
        for (int i = 0; i < Lista_Moto.length; i++) {
            System.out.println((i + 1) + ". Veicolo a 2 ruote");
            Lista_Moto[i].mostraMarca();
            Lista_Moto[i].mostraModello();
            Lista_Moto[i].mostraColore();
            Lista_Moto[i].mostraCilindrata();
            System.out.println("Prezzo: " + motoPrezzi.get(Lista_Moto[i]) + "€");
        }
    }
}