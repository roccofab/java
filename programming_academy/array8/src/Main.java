//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int VerificaNumeri(int[] arr) {  //conta valori pari a 0 e - 1 in un array di interi
        int contaZeri = 0;
        int contaMenoUno = 0;
        for(int i : arr) {
            if(i == 0) {
                contaZeri++;
            }
            if(i == -1) {
                contaMenoUno++;
            }
        }
        return contaZeri + contaMenoUno;
    }
    public static void main(String[] args) {
        int[] arr = {1, 20, 30, 0, -1, 10, -1, -1, 0, 3, -1};
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nTotale Valori Pari a 0 e -1: " +VerificaNumeri(arr));
    }
}