//1. operatori di comparazione| <=, >=, <, >, ==, !=

//2. operatori logici| AND(&&), OR(!!), NOT 
public class operatori {
    public static void main(String[] args) {

        // faccio delle comparazioni usando gli operatori di comparazione
        int x = 100;
        int y = 10;
        boolean risultato = x < 10;     
        System.out.println(risultato);  //otteniamo stampato a schermo "false" perchè 100 non è minore di 10
        risultato = x > 10;
        System.out.println(risultato);  //otteniamo stampato a schermo "true" perchè "x" è maggiore di 10

        risultato = x <= 100;
        System.out.println(risultato);   //otteniamo stampato a schermo "true" perchè "x" non è minore di 100 ma bensì è uguale a 100

        risultato = y >= x;
        System.out.println(risultato);  //otteniamo false perchè "y" non è maggiore e neanche uguale a "x"

        risultato = x==y;
        System.out.println(risultato);  //otteniamo stampato a schermo false perchè "x" e "y" non sono uguali

        risultato = x != y;
        System.out.println(risultato);  //otteniamo stampato a schermo "true" perchè "x" e "y" sono diversi


        // operatori logici esempi
        boolean l = x > y && x % 2 == 0;  // vengono verificate due condizioni tramite && e nell'esempio sono entrambe vere perchè "x>y" e "x % 2 == 0 ovvero x è pari"
        System.out.println(l);            //otteniamo la stampa a schermo "true" 

        l = x > y && x % 3 == 0;      //in questo esempio la prima condizione "x > y" è vera, mentre la seconda "x % 3 == 0" è falsa perchè x = 100 e quindi un numero pari
        System.out.println(l);        //otteniamo la stampa a schermo "false"

       l = 3 < 10 || 3 % 2 == 0;   //con l'operatore OR(||) verifichiamo se almeno una tra le due condizioni è "true", nell'esempio la prima condizione è "true" e la seconda "false"
       System.out.println(l);      //otteniamo la stampa a schermo "true"

       l = x < y || y != 10;
       System.out.println(l);    //otteniamo la stampa a schermo "false   
       
       int r = 3;
       System.out.println(!(r > 10));   //otteniamo la stampa a schermo "true" perchè "r" non è vero che è > 10, l'operatore NOT(!) in generale va ad invertire il risultato della condizione
       System.out.println(!(x>10));     //otteniamo la stampa a schermo "false" perchè "x" è maggiore di 10 tutavia ho inserito la negazione all inizio della condizione "!"
       
       //espressione
       boolean j = (5 < 10 && 5 % 2 == 0) || (6 < 10 && 6 % 2 == 0);  //otteniamo la stampa a schermo "true" perchè: 5 < 10(true), 5%2==0(false) e true + false = false, mentre nella seconda condizione 6<10(true) e 6%2==0(true), l'operatore || verifica se almeno una condizione è "true"
       System.out.println(j);
    }
}