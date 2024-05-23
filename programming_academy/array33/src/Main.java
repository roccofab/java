//verificare se un array di numeri interi contiene due elementi specificati 65 e 77
public class Main {
    public static boolean ContieneNumeri(int[] array) {
        int n1 = 65;
        int n2 = 77;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n1) {
                return true;
            }
        }
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n2) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 45, 65, 90, 77, 200};
        System.out.println(ContieneNumeri(array));
    }
}