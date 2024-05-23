//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] TrovaCoppia(int[] arr, int target) {  //verifica se esiste una coppia di valori nell'array di interi con una somma specificata presa in input
        int[] valori = new int[2];  //memorizza nell'array i due valori la cui somma è uguale a target
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    valori[0] = arr[i];
                    valori[1] = arr[j];
                    return valori;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 20, 10, 15, 31, 24, 50};
        int target = 30;
        int[] valori = TrovaCoppia(arr, target);
        if(valori != null) {
            for(int i : valori) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Non Esiste Coppia Valori");
        }
    }
}