//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int Somma(int[] array) {  //sommare i valori di un array
        int risultato = 0;
        for (int i = 0; i < array.length; i++) {
            risultato += array[i];
        }
        return risultato;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(Somma(array));
    }
}