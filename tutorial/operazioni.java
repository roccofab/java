//1. operatori aritmetici semplici(+, -, /, %, *)
//2. incremento e decremento
//3. operatori aritmetici complessi (^, sqrt, log, ln...) con -Math class
// 4. esempi
public class operazioni {
    public static void main(String[] args) {
      //+, -, /, *, %
      int a = 20;
      int b = 10;
      int z = a + b;
      System.out.println(z);
      //oppure più semplicemente risolvo l'operazioni dentro la funzione di stampa a schermo
      System.out.println(a + b);
      System.out.println(a-b);
      System.out.println(a * b);
      System.out.println(a / b);
      System.out.println(a % b);

      //shorthand
      a += 12;  //equivale a scrivere a = a + 12
      a -= 12;  //equivale a scrivere a = a - 12
      a *= 12;  //equivale a scrivere a = a * 12
      a /= 12;  //equivale a scrivere a = a / 12
      a %= 12;  //equivale a scrivere a = a % 12

      //incremento e decremento (fondamentale nei cicli di iterazione)
      a++;  //incrementa a di 1
      a--;  //decrementa a di 1

      //esempio espressione con operazioni semplici e parentesi annidate (la precedenza va da destra a sinistra e le parentesi tonde hanno sempre la precedenza, ancor più quelle annidate)
      int espressione = ((3 + b) * 3 + (4 - 2)) * 9;
      System.out.println(espressione);

      //-Math class:   alcuni metodi: abs, min, max, pow, sqrt
      System.out.println(Math.abs(-50));   //otteniamo stampato a schermo "50" e no "-50" perchè abs sta per absolute e mi calcola il valore assoluto di un numero
      System.out.println(Math.min(15, 30));  //otteniamo stampato a schermo 15 che è il valore minimo tra 30 e 15, min. sta per minimum
      System.out.println(Math.max(15, 30));  //otteniamo stampato a schermo 30 che è il valore massimo tra 15 e 30, max. sta per maximum
      System.out.println(Math.sqrt(25));   //otteniamo stampato a schermo il valore 5 perchè la radice quadrata di 25 è 5
      System.out.println(Math.pow(3, 2));  //otteniamo stampato a schermo il valore 9 perchè 3^2 = 9
      System.out.println(Math.log10(10));    //otteniamo stampato a schermo il valore 1 perchè il log10 di 10 = 1
      System.out.println(Math.log(100));     //otteniamo stampato a schermo il log in base 3 di 100 che vale 4.605170185988092
      System.out.println(Math.PI);   //otteniamo stampato a schermo il valore di pi-greco ovvero 3.14159786353748...
      
    }
    }
