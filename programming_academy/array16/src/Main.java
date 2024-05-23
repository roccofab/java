//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int ElementoDiMaggioranza(int[] array) {  //ottenere l'elemento di maggioranza da un lato array di interi contenenti duplicati
        int ValoreLimite = array.length/2;                  // un elemento di maggioranza è un elemento che appare più di n / 2 volte dove n è la dimensione dell'array
        int contatore = 0;
        int n = -1;
        for(int i = 0; i < array.length; i++) {
            if(contatore == 0) {
                n = array[i];
            }
            if(array[i] == n) {
                contatore++;
            } else {
               contatore--;
            }
        }
        contatore = 0;
        for(int i : array) {
            if(array[i] == n) {
                contatore++;
            }
        }
        if (contatore > ValoreLimite) {
            return n;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 5, };
        for(int i : array) {
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println(ElementoDiMaggioranza(array));
    }
}