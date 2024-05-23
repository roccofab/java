//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] Pari(int[] array) {  //inserisci i numeri Pari presenti in array in arrayPari
        int[] arrayPari = new int[array.length];
        int index = 0;
        for(int i : array) {
            if(i % 2 == 0) {
                arrayPari[index] = i;
                index++;
            }
        }
        return arrayPari;
    }
    public static int[] Dispari(int[] array) {  //inserisci i numeri dispari presenti in array in arrayDispari
        int[] arrayDispari = new int[array.length];
        int index = 0;
        for(int i : array) {
            if(i % 2!= 0) {
                arrayDispari[index] = i;
                index++;
            }
        }
        return arrayDispari;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6,8,10,11,13,21,19,31,30,22,20,40};
        int[] arrayPari = Pari(array);
        System.out.println("Numeri Pari:");
        for(int i : arrayPari) {
            if(i != 0) {  //ignora gli zero finali: altrimenti alla fine dell'array vengono stampati zeri fino a raggiungere la lunghezza dell'array originale(array)
                System.out.print(i + " ");
            }
        }
        int[] arrayDispari = Dispari(array);
        System.out.println("\nNumeri Dispari:");
        for(int i : arrayDispari) {
            if(i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}